
package Vista;

import Controlador.Controlador;
import Modelo.Cliente;
import javax.swing.JOptionPane;
import Excepciones.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import org.postgresql.util.PSQLException;

/**
 *
 * @author Dany
 */
public class AgregarCliente extends javax.swing.JDialog {
    VentanaPrincipal vp = (VentanaPrincipal) this.getParent();    
    
    public AgregarCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(vp);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        textNombreCliente = new javax.swing.JTextField();
        textCorreoCliente = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Cliente");

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel1.setText("Cliente");

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setText("Correo:");

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setText("Método de Pago:");

        jRadioButton1.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Cheque Ordinario");

        jRadioButton2.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Cheque de Empresa");

        jRadioButton3.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Cheque Certificado");

        jRadioButton4.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Transacción Bancaria");

        textNombreCliente.setBackground(new java.awt.Color(204, 204, 204));

        textCorreoCliente.setBackground(new java.awt.Color(204, 204, 204));

        botonAgregar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonSalir.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(textNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(textCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(botonAgregar)
                        .addGap(21, 21, 21)
                        .addComponent(botonSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)
                            .addComponent(jLabel4))
                        .addGap(117, 117, 117)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(textNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(textCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton3))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton4))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        boolean error = false;
        Controlador cont = new Controlador();
        
        if(jRadioButton1.isSelected()){
            try{
                cont.agregar_cliente(new Cliente(textNombreCliente.getText(), textCorreoCliente.getText(), jRadioButton1.getText()));
            } catch (CamposVacios e){
                error = true;
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (PSQLException e) {
                String errorMessage = e.getServerErrorMessage().getMessage();
                JOptionPane.showMessageDialog(null, errorMessage);
            } catch (SQLException ex) {
                Logger.getLogger(AgregarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(jRadioButton2.isSelected()){
            try{
                cont.agregar_cliente(new Cliente(textNombreCliente.getText(), textCorreoCliente.getText(), jRadioButton2.getText()));
            }catch(CamposVacios e){
                error = true;
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (PSQLException e) {
                String errorMessage = e.getServerErrorMessage().getMessage();
                JOptionPane.showMessageDialog(null, errorMessage);
            } catch (SQLException ex) {
                Logger.getLogger(AgregarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(jRadioButton3.isSelected()){
            try{
                cont.agregar_cliente(new Cliente(textNombreCliente.getText(), textCorreoCliente.getText(), jRadioButton3.getText()));
            }catch(CamposVacios e){
                error = true;
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (PSQLException e) {
                String errorMessage = e.getServerErrorMessage().getMessage();
                JOptionPane.showMessageDialog(null, errorMessage);
            } catch (SQLException ex) {
                Logger.getLogger(AgregarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(jRadioButton4.isSelected()){
            try{
                cont.agregar_cliente(new Cliente(textNombreCliente.getText(), textCorreoCliente.getText(), jRadioButton4.getText()));
            }catch(CamposVacios e){
                error = true;
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (PSQLException e) {
                String errorMessage = e.getServerErrorMessage().getMessage();
                JOptionPane.showMessageDialog(null, errorMessage);
            } catch (SQLException ex) {
                Logger.getLogger(AgregarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Por favor seleccione una de las opciones de pago");
            error = true;
        }
        if(error == false){
            try {
                vp.imprimirListaCliente();
            } catch (SQLException ex) {
                Logger.getLogger(AgregarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            setVisible(false);
        }
        
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        setVisible(false);
    }//GEN-LAST:event_botonSalirActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            AgregarCliente dialog = new AgregarCliente(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField textCorreoCliente;
    private javax.swing.JTextField textNombreCliente;
    // End of variables declaration//GEN-END:variables

    public JRadioButton getjRadioButton1() {
        return jRadioButton1;
    }

    public JRadioButton getjRadioButton2() {
        return jRadioButton2;
    }

    public JRadioButton getjRadioButton3() {
        return jRadioButton3;
    }

    public JRadioButton getjRadioButton4() {
        return jRadioButton4;
    }

    public JTextField getTextCodigoCliente() {
        return textNombreCliente;
    }
    
    public JTextField getTextCorreoCliente() {
        return textCorreoCliente;
    }
}
