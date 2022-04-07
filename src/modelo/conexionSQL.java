package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
//conexion de bace de datso para consulta almacen 



public class conexionSQL extends javax.swing.JFrame {
    
    public static final String URL = "jdbc:mysql://root@localhost:3306/usuarios"; //Direccion, puerto y nombre de la Base de Datos
    public static final String USERNAME = "root"; //Usuario de Acceso a MySQL
    public static final String PASSWORD = "rafel12345"; //Password del usuario
    
    Connection conectar=null;
    
    public Connection conexion(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://root@localhost:3306/usuarios","root","rafel12345");
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DE CONEXION");
        }
        return conectar;
    } 
    
}