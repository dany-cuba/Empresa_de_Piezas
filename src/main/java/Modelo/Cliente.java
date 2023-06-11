package Modelo;




import java.io.Serializable;

public class Cliente implements Serializable{
    private final String nombre;
    private final String correo;
    private final String forma_pago;
    

    public Cliente(String codigo, String correo, String formaPago) {
        this.nombre = codigo;
        this.correo = correo;
        this.forma_pago = formaPago;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getForma_pago() {
        return forma_pago;
    }
    
    
}
