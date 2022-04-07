/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import consulta.Consulta1;
import modelo.conexionSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame {

    
    conexionSQL cc=new conexionSQL();
    Connection con=cc.conexion();
   
    public login() {
        initComponents();
        setSize(725, 482);
        setLocationRelativeTo(null);
       
       
    }
    
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtusuario = new javax.swing.JTextField();
        iniciarsesion = new javax.swing.JButton();
        txtcontraseña = new javax.swing.JPasswordField();
        registrar_usuario = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NEW/wallpaperbetter.jpg"))); // NOI18N
        jLabel3.setText("usuario");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NEW/cancelar.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, -1));

        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtusuarioKeyReleased(evt);
            }
        });
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 180, 40));

        iniciarsesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NEW/iniciar-sesion.png"))); // NOI18N
        iniciarsesion.setBorder(null);
        iniciarsesion.setContentAreaFilled(false);
        iniciarsesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarsesionActionPerformed(evt);
            }
        });
        getContentPane().add(iniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 110, 80));

        txtcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraseñaActionPerformed(evt);
            }
        });
        txtcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcontraseñaKeyReleased(evt);
            }
        });
        getContentPane().add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 180, 40));

        registrar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NEW/info.png"))); // NOI18N
        registrar_usuario.setContentAreaFilled(false);
        registrar_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(registrar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 80, 80));

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Registrar Usuario");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NEW/login (3).png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Iniciar Sesion");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel9.setText("Usuario :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 90, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel8.setText("Contraseña :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarsesionActionPerformed
        ValidarUsuario();
       
    }//GEN-LAST:event_iniciarsesionActionPerformed

    private void registrar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_usuarioActionPerformed
                    registro form=new registro();
                    form.setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_registrar_usuarioActionPerformed

    private void txtusuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyReleased
        
    }//GEN-LAST:event_txtusuarioKeyReleased

    private void txtcontraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontraseñaKeyReleased
        
    }//GEN-LAST:event_txtcontraseñaKeyReleased

    private void txtcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontraseñaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
//metodo para validar ususario
    public void ValidarUsuario(){
        
        int resultado=0;
        String contraseña=String.valueOf(txtcontraseña.getText());
        String usuario=txtusuario.getText();
        String SQL="select * from usuario where nombre_de_usuario='"+usuario+"' and contraseña='"+contraseña+"'  ";       

        
        try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            
            if (rs.next()) {
                
                resultado=1;
                
                if (resultado==1) {
                    
                    vista.inicio form=new inicio();
                    form.setVisible(true);
                    this.dispose();
                }
                
            }else{
              JOptionPane.showMessageDialog(null, "Error de Acceso, Usuario No Registrado o credenciales no validas intente de nuevo o registrase.");
        
            }
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    
    }    
    
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton iniciarsesion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton registrar_usuario;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
