
package Vista;

import Controlador.Controlador;
import Modelo.PiezaMetalica;
import Modelo.Solicitud;
import Modelo.PiezaPlastica;
import Modelo.PiezaMixta;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import Excepciones.*;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.postgresql.util.PSQLException;


public class AgregarPieza extends javax.swing.JDialog {
    VentanaPrincipal vp2 = (VentanaPrincipal) this.getParent();
    
    public AgregarPieza(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(vp2);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textPesoPieza = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaDescrip = new javax.swing.JTextArea();
        botonAgregar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        textCantidadPiezas = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        comboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        textNombreCorrespondienteCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva Pieza");

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel6.setFont(new java.awt.Font("Consolas", 2, 36)); // NOI18N
        jLabel6.setText("Pieza");

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel8.setText("Peso:");

        textPesoPieza.setBackground(new java.awt.Color(204, 204, 204));
        textPesoPieza.setToolTipText("El peso que introduzca será en kilogramos");
        textPesoPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPesoPiezaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel9.setText("Descripción:");

        textAreaDescrip.setBackground(new java.awt.Color(204, 204, 204));
        textAreaDescrip.setColumns(20);
        textAreaDescrip.setRows(5);
        jScrollPane1.setViewportView(textAreaDescrip);

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

        jLabel10.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel10.setText("Cantidad de Piezas:");

        textCantidadPiezas.setBackground(new java.awt.Color(204, 204, 204));
        textCantidadPiezas.setToolTipText("Números naturales distintos de 0");

        jLabel11.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel11.setText("Tipo de Pieza:");

        comboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plástica", "Metálica", "Mixtas" }));
        comboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel1.setText("Nombre del Cliente Correspondiente:");

        textNombreCorrespondienteCliente.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textCantidadPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textPesoPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(comboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(botonAgregar)
                            .addGap(37, 37, 37)
                            .addComponent(botonSalir))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(textNombreCorrespondienteCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)))))
                .addGap(31, 38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPesoPieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(comboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(textCantidadPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textNombreCorrespondienteCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregar)
                    .addComponent(botonSalir))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textPesoPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPesoPiezaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPesoPiezaActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        boolean error = false;
        Controlador cont = new Controlador();
        
        switch(comboBox1.getSelectedIndex()){
            case 0 -> {
                
                try {
                    if(cont.verificar_cliente(textNombreCorrespondienteCliente.getText()) == true){
                        cont.agregar_pieza(new PiezaPlastica(textAreaDescrip.getText(), Double.parseDouble(textPesoPieza.getText()), Integer.parseInt(textCantidadPiezas.getText())));
                        cont.agregar_solicitud(new Solicitud(textNombreCorrespondienteCliente.getText(),cont.obtener_ultimo_id_piezas(),java.sql.Date.valueOf(LocalDate.now())));
                    } else {
                        error = true;
                        JOptionPane.showMessageDialog(null, "El código no corresponde a ningún cliente");
                    }   
                } catch (SQLException ex) {
                    error = true;
                    Logger.getLogger(AgregarPieza.class.getName()).log(Level.SEVERE, null, ex);
                } catch (CamposVacios ex) {
                    error = true;
                    JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
                } catch (Positivos | NumberFormatException ex) {
                    error = true;
                    JOptionPane.showMessageDialog(null, "El peso y la cantidad deben ser numeros mayores que 0");
                } 
            }
                
            case 1 -> {
                
                try {
                    if(cont.verificar_cliente(textNombreCorrespondienteCliente.getText()) == true){
                        cont.agregar_pieza(new PiezaMetalica(textAreaDescrip.getText(), Double.parseDouble(textPesoPieza.getText()), Integer.parseInt(textCantidadPiezas.getText())));
                        cont.agregar_solicitud(new Solicitud(textNombreCorrespondienteCliente.getText(),cont.obtener_ultimo_id_piezas(),java.sql.Date.valueOf(LocalDate.now())));
                    } else {
                        error = true;
                        JOptionPane.showMessageDialog(null, "El código no corresponde a ningún cliente");
                    }   
                } catch (SQLException ex) {
                    error = true;
                    Logger.getLogger(AgregarPieza.class.getName()).log(Level.SEVERE, null, ex);
                } catch (CamposVacios ex) {
                    error = true;
                    JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
                } catch (Positivos  | NumberFormatException ex) {
                    error = true;
                    JOptionPane.showMessageDialog(null, "El peso y la cantidad deben ser numeros mayores que 0");
                }
            }

            case 2 -> {
                try {
                    if(cont.verificar_cliente(textNombreCorrespondienteCliente.getText()) == true){
                        cont.agregar_pieza(new PiezaMixta(textAreaDescrip.getText(), Double.parseDouble(textPesoPieza.getText()), Integer.parseInt(textCantidadPiezas.getText())));
                        cont.agregar_solicitud(new Solicitud(textNombreCorrespondienteCliente.getText(),cont.obtener_ultimo_id_piezas(),java.sql.Date.valueOf(LocalDate.now())));
                    } else {
                        error = true;
                        JOptionPane.showMessageDialog(null, "El código no corresponde a ningún cliente");
                    }   
                } catch (SQLException ex) {
                    error = true;
                    Logger.getLogger(AgregarPieza.class.getName()).log(Level.SEVERE, null, ex);
                } catch (CamposVacios ex) {
                    error = true;
                    JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
                } catch (Positivos | NumberFormatException ex) {
                    error = true;
                    JOptionPane.showMessageDialog(null, "El peso y la cantidad deben ser numeros mayores que 0");
                }
            }
        }        
        if(error == false){
            try {
                vp2.imprimirListaSolicitudes();
            } catch (SQLException ex) {
                Logger.getLogger(AgregarPieza.class.getName()).log(Level.SEVERE, null, ex);
            }
            setVisible(false);
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        setVisible(false);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void comboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarPieza dialog = new AgregarPieza(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox<String> comboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAreaDescrip;
    private javax.swing.JTextField textCantidadPiezas;
    private javax.swing.JTextField textNombreCorrespondienteCliente;
    private javax.swing.JTextField textPesoPieza;
    // End of variables declaration//GEN-END:variables
    public JTextArea getTextAreaDescrip() {
        return textAreaDescrip;
    }

    public JTextField getTextCantidadPiezas() {
        return textCantidadPiezas;
    }
    public JTextField getTextPesoPieza() {
        return textPesoPieza;
    }
    
}
