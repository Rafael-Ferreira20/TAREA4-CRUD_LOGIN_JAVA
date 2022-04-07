/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import consulta.Consulta1;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.SQLusuario;
import modelo.usuario;

/**
 *
 * @author wilfr
 */
public class registro extends javax.swing.JFrame {
       
    public registro() {
        initComponents();
        boton_registrar.setEnabled(false);
        setSize(800, 510);
        setLocationRelativeTo(null);
        
    }
    //habilitar botones 

    public void habilitarboton() {
        if (!txtusuario.getText().isEmpty() && !txtcontraseña.getText().isEmpty() && !txtconfirmarcontraseña.getText().isEmpty() && !txtnombre.getText().isEmpty() && !txtapellido.getText().isEmpty() && !txttelefono.getText().isEmpty() && !txtcorreo.getText().isEmpty()) {
    
        boton_registrar.setEnabled(true);
        
    } else {
            boton_registrar.setEnabled(false);
            
            }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtconfirmarcontraseña = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtapellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        boton_registrar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NEW/wallpaperbetter.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 350));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Modern No. 20", 1, 36)); // NOI18N
        jLabel1.setText("Registro Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtusuarioKeyReleased(evt);
            }
        });
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 160, 30));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 26)); // NOI18N
        jLabel2.setText("Contraseña :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 210, 40));

        txtcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcontraseñaKeyReleased(evt);
            }
        });
        getContentPane().add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 160, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 26)); // NOI18N
        jLabel3.setText("<html>Confirmar contraseña :<html>");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        txtconfirmarcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtconfirmarcontraseñaKeyReleased(evt);
            }
        });
        getContentPane().add(txtconfirmarcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 160, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 26)); // NOI18N
        jLabel4.setText("Nombre :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnombreKeyReleased(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 160, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 26)); // NOI18N
        jLabel5.setText("Apellido :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 1, 26)); // NOI18N
        jLabel12.setText("Nombre de Usuario :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NEW/cancelar.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 140, 110));

        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });
        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtapellidoKeyReleased(evt);
            }
        });
        getContentPane().add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 160, 30));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 26)); // NOI18N
        jLabel6.setText("Numero de telefono :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 160, 30));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 26)); // NOI18N
        jLabel7.setText("Correo electronico :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });
        txtcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcorreoKeyReleased(evt);
            }
        });
        getContentPane().add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 160, 30));

        boton_registrar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        boton_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoinicio/regmateria.png"))); // NOI18N
        boton_registrar.setContentAreaFilled(false);
        boton_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrarActionPerformed(evt);
            }
        });
        getContentPane().add(boton_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 110, 100));

        jLabel10.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel10.setText("Registrar");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoActionPerformed

    private void boton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_registrarActionPerformed
    //metodo set y validacion de contraseña
     SQLusuario modSQL = new SQLusuario();
     usuario mod =new usuario();
     String contra=new String(txtcontraseña.getPassword());
     String confirmarcontra=new String(txtconfirmarcontraseña.getPassword());
     if(contra.equals(confirmarcontra))
     {
      
      mod.setNombre_de_usuario(txtusuario.getText());
      mod.setContraseña(txtcontraseña.getText());
      mod.setNombre(txtnombre.getText());
      mod.setApellido(txtapellido.getText());
      mod.setNumero_de_telefono(txttelefono.getText());
      mod.setCorreo_electronico(txtcorreo.getText());
      
         try {
             if(modSQL.registrar(mod))
             {
                 JOptionPane.showMessageDialog(null, "registro completo...");
                 limpiar();
                 
                   login form=new login();
                   form.setVisible(true);
                   this.dispose();
                 
             }else
             {
                 JOptionPane.showInputDialog(null,"error.exe");
                 
             }  } catch (SQLException ex) {
             Logger.getLogger(registro.class.getName()).log(Level.SEVERE, null, ex);
         }
      
      
      
     }else
     {
         JOptionPane.showInputDialog(null,"las contraseñas no son iguales");
     }
     
    }//GEN-LAST:event_boton_registrarActionPerformed
     
    private void limpiar()
    {
       txtusuario.setText(""); 
       txtcontraseña.setText("");
       txtconfirmarcontraseña.setText("");
       txtnombre.setText("");
       txtapellido.setText("");
       txttelefono.setText("");
       txtcorreo.setText("");
    }    
    
    
    
    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
       char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        
        if(txttelefono.getText().length() >=10 ){
            evt.consume();
        } // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtusuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyReleased
        habilitarboton();
    }//GEN-LAST:event_txtusuarioKeyReleased

    private void txtcontraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontraseñaKeyReleased
        habilitarboton();
    }//GEN-LAST:event_txtcontraseñaKeyReleased

    private void txtconfirmarcontraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconfirmarcontraseñaKeyReleased
        habilitarboton();
    }//GEN-LAST:event_txtconfirmarcontraseñaKeyReleased

    private void txtnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyReleased
        habilitarboton();
    }//GEN-LAST:event_txtnombreKeyReleased

    private void txtapellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyReleased
        habilitarboton();
    }//GEN-LAST:event_txtapellidoKeyReleased

    private void txttelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyReleased
        habilitarboton();
    }//GEN-LAST:event_txttelefonoKeyReleased

    private void txtcorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoKeyReleased
        habilitarboton();
    }//GEN-LAST:event_txtcorreoKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_registrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JPasswordField txtconfirmarcontraseña;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
