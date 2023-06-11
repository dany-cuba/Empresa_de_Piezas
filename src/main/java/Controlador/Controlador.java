package Controlador;

import Excepciones.CamposVacios;
import Excepciones.Positivos;
import Modelo.Cliente;
import Modelo.Pieza;
import Modelo.PiezaMetalica;
import Modelo.PiezaMixta;
import Modelo.PiezaPlastica;
import Modelo.Solicitud;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;

public class Controlador {
    private Connection connection;
    
    public void conectarBD() throws SQLException{
        connection = Conexion.getConnection();
    }
    public void desconectarBD() throws SQLException{
        Conexion.closeConnection(connection);
    }
    
    public void agregar_cliente(Cliente c) throws SQLException, CamposVacios{
        conectarBD();
        if(c.getNombre().equals("")||c.getCorreo().equals("")){
            throw new CamposVacios("Por favor rellene todos los campos y seleccione método de pago"); 
        }else{
            try (CallableStatement cs = connection.prepareCall("{call agregar_cliente(?,?,?)}")) {
                cs.setString(1, c.getNombre());
                cs.setString(2, c.getCorreo());
                cs.setString(3, c.getForma_pago());
                cs.executeQuery();
            }
        }
        desconectarBD();
    }
    
    public ArrayList<Cliente> obtener_clientes() throws SQLException{
        ArrayList<Cliente> clientes = new ArrayList<>();
        conectarBD();
        
        ResultSet rs;
        try (CallableStatement cs = connection.prepareCall("{call obtener_clientes()}")) {
            rs = cs.executeQuery();
            while (rs.next()) {
                clientes.add(new Cliente(rs.getString(1),rs.getString(2),rs.getString(3)));
            }
        }
        rs.close();
        desconectarBD();
        return clientes;
    }
    
    public void verificar_cliente(String nombre) throws SQLException{
        conectarBD();
        try (CallableStatement cs = connection.prepareCall("{? = call verificar_cliente(?)}")) {
            cs.registerOutParameter(1, Types.BOOLEAN);
            cs.setString(2, "nombre_del_cliente");
            cs.execute();
            if(cs.getBoolean(1) == true){
                throw new SQLException();
            }
                
        }
        
        desconectarBD();
    }
    
    public void agregar_solicitud(Solicitud s) throws SQLException{
        conectarBD();
        
        try (CallableStatement cs = connection.prepareCall("{call agregar_solicitud(?,?,?)}")) {
            cs.setString(1, s.getNombreClienteCorrespondiente());
            cs.setInt(2, s.getIdPiezaCorrespondiente());
            cs.setDate(3, (Date) s.getFecha());
            cs.executeQuery();
        }
        
        desconectarBD();
    }
    
    public ArrayList<Solicitud> obtener_solicitudes() throws SQLException{
        ArrayList<Solicitud> solicitudes = new ArrayList<>();
        conectarBD();
        
        ResultSet rs;
        try (CallableStatement cs = connection.prepareCall("{call obtener_solicitudes()}")) {
            rs = cs.executeQuery();
            while (rs.next()) {
                solicitudes.add(new Solicitud(rs.getString(2),rs.getInt(3),rs.getDate(4)));
            }
        }
        rs.close();
        desconectarBD();
        return solicitudes;
    }
    
    public void agregar_pieza(Pieza p) throws SQLException, CamposVacios, Positivos{
        conectarBD();
        
        if(p.getDescripcion().equals("")){
            throw new CamposVacios("Por favor rellene todos los campos y seleccione método de pago");
            
        }else if(p.getPeso() <= 0||p.getCantidad_piezas() <=0){
            throw new Positivos("Los valores de peso y cantidad de piezas deben ser mayores que cero");
            
        }else{
            try (CallableStatement cs = connection.prepareCall("{call agregar_pieza(?,?,?,?,?)}")) {
                cs.setString(1, p.getDescripcion());
                cs.setDouble(2, p.getPeso());
                cs.setInt(3, p.getCantidad_piezas());
                cs.setDouble(4, p.calcularCosto(p.getPeso()));
                cs.setString(5, p.tipo(p));
                cs.executeQuery();
            }   
        }
        desconectarBD();
    }
    
    public Pieza obtener_pieza(int id) throws SQLException{
        conectarBD();
        
        Pieza p;
        ResultSet rs;
        try (CallableStatement cs = connection.prepareCall("{call obtener_pieza(?)}")) {
            cs.setInt(1, id);
            rs = cs.executeQuery();
            rs.next();
            p = switch (rs.getString(6)) {
                case "Metálica" -> new PiezaMetalica(rs.getString(2), rs.getDouble(3), rs.getInt(4));
                case "Plástica" -> new PiezaPlastica(rs.getString(2), rs.getDouble(3), rs.getInt(4));
                case "Mixta" -> new PiezaMixta(rs.getString(2), rs.getDouble(3), rs.getInt(4));
                default -> null;
            };
        }
        rs.close();
        desconectarBD();
        return p;
    }
    
    public int obtener_ultimo_id_piezas() throws SQLException{
        conectarBD();
        int lastId;
        try (CallableStatement cs = connection.prepareCall("{? = call obtener_ultimo_id_piezas()}")) {
            cs.registerOutParameter(1, Types.INTEGER);
            cs.execute();
            lastId = cs.getInt(1);
        }
        desconectarBD();
        return lastId;
    }
    
}

