
package Vista;

import Modelo.Solicitud;
import Modelo.Cliente;
import Controlador.Controlador;
import Modelo.Pieza;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.postgresql.util.PSQLException;



public final class VentanaPrincipal extends javax.swing.JFrame {
    Controlador cont = new Controlador();
    
    public VentanaPrincipal() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        imprimirListaCliente();
        imprimirListaSolicitudes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaClientes = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listSolicitudes = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        Solicitudes = new javax.swing.JMenu();
        nuevoCliente = new javax.swing.JMenuItem();
        nuevaPieza = new javax.swing.JMenuItem();
        datosPieza = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empresa de Encargos");

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        listaClientes.setBackground(new java.awt.Color(204, 204, 204));
        listaClientes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Consolas", 0, 14))); // NOI18N
        listaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaClientes);

        listSolicitudes.setBackground(new java.awt.Color(204, 204, 204));
        listSolicitudes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Solicitudes de Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Consolas", 0, 14))); // NOI18N
        listSolicitudes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(listSolicitudes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        Solicitudes.setText("Solicitudes");

        nuevoCliente.setText("Nuevo Cliente");
        nuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoClienteActionPerformed(evt);
            }
        });
        Solicitudes.add(nuevoCliente);

        nuevaPieza.setText("Solicitar Nueva Pieza");
        nuevaPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaPiezaActionPerformed(evt);
            }
        });
        Solicitudes.add(nuevaPieza);

        datosPieza.setText("Datos de una pieza");
        datosPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosPiezaActionPerformed(evt);
            }
        });
        Solicitudes.add(datosPieza);

        jMenuBar1.add(Solicitudes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoClienteActionPerformed
        AgregarCliente v1 = new AgregarCliente(this, rootPaneCheckingEnabled);
        v1.setVisible(true);
    }//GEN-LAST:event_nuevoClienteActionPerformed

    private void nuevaPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaPiezaActionPerformed
        try {
            ArrayList<Cliente> clientes = cont.obtener_clientes();
            if(clientes.isEmpty()){
                JOptionPane.showMessageDialog(null,"Debe Introducir al menos un cliente primero");
            }else{
                AgregarPieza v2 = new AgregarPieza(this, rootPaneCheckingEnabled);
                v2.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_nuevaPiezaActionPerformed

    private void listaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaClientesMouseClicked
        try {
            ArrayList<Cliente> clientes = cont.obtener_clientes();
            ArrayList<Solicitud> solicitudes = cont.obtener_solicitudes();
            ArrayList<Integer> indices = new ArrayList<>();
            int index = listaClientes.getSelectedIndex();
            String nombre = clientes.get(index).getNombre();
            for(int i=0; i<solicitudes.size(); i++){
                if(solicitudes.get(i).getNombreClienteCorrespondiente().equals(nombre)){
                    indices.add(i);
                }
            }
            int[] ejasi = new int[indices.size()];
            for (int i = 0; i < ejasi.length; i++) {
                ejasi[i] = indices.get(i);
            }
            listSolicitudes.setSelectedIndices(ejasi);
            
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_listaClientesMouseClicked

    private void datosPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosPiezaActionPerformed
        int id = obtener_id();
        try {
            mostrarDatosPieza(cont.obtener_pieza(id),id);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_datosPiezaActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new VentanaPrincipal().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    public void imprimirListaCliente() throws SQLException, PSQLException{
        DefaultListModel <String> modelo = new DefaultListModel<>();
        ArrayList<Cliente> clientes = cont.obtener_clientes();
        for(int i=0; i<clientes.size(); i++){
            modelo.add(i, "Nombre: "+clientes.get(i).getNombre()+" || Correo: "+clientes.get(i).getCorreo()+" || Forma de Pago: "+clientes.get(i).getForma_pago());
        }
        listaClientes.setModel(modelo);
    }

    public void imprimirListaSolicitudes() throws SQLException, PSQLException{
        DefaultListModel <String> modelo = new DefaultListModel<>();
        ArrayList<Solicitud> solicitudes = cont.obtener_solicitudes();
        for(int i=0; i<solicitudes.size(); i++){
            modelo.add(i,"id de la Pieza: "+solicitudes.get(i).getIdPiezaCorrespondiente()+" || Nombre del Cliente: "+solicitudes.get(i).getNombreClienteCorrespondiente()+" || Fecha: "+solicitudes.get(i).getFecha());
        }
        listSolicitudes.setModel(modelo);    
    }
        
    //Obtener el ID de la Pieza
    public int obtener_id()throws NumberFormatException{
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el id de la solicitud de la pieza que desea: ", "Datos de una pieza", 1));
        return id;  
    }
    
    public void mostrarDatosPieza(Pieza p, int id){
        JOptionPane.showMessageDialog(null, "ID: "+id+"\n"
                + "Peso: "+p.getPeso()+"Kg\n"
                + "Cantidad de Piezas: "+p.getCantidad_piezas()+"\n"
                + "Descripción: "+p.getDescripcion()+"\n"
                + "Costo de la pieza: $"+p.calcularCosto(p.getPeso()), "Resultado", 1);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Solicitudes;
    private javax.swing.JMenuItem datosPieza;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listSolicitudes;
    private javax.swing.JList<String> listaClientes;
    private javax.swing.JMenuItem nuevaPieza;
    private javax.swing.JMenuItem nuevoCliente;
    // End of variables declaration//GEN-END:variables
}