
package modelo;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//clase conexion

public class conexion {
    private final String bace = "usuarios";
    private final String user = "root";
    private final String pasword = "rafel12345";
    private final String url = "jdbc:mysql://root@localhost:3306/usuarios" ;
    private Connection conectar =null;
   //metodo para conectar base de datos 
    
    public Connection getconexion() throws SQLException{
        
        
         try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(url,user,pasword);
      
        
        
        }   catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }  
    
         
         return conectar;
    }
 }

  
   
    

