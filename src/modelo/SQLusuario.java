
 
package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//clase conectar base de datos 

public class SQLusuario extends conexion {
    //meteodo para conectar vase de datos 
    
    public boolean registrar(usuario usr) throws SQLException
    {
        
       PreparedStatement ps = null; 
        Connection con = getconexion();
        String SQL = "INSERT INTO usuario (nombre_de_usuario, contraseña ,nombre ,apellido,numero_de_telefono,correo_electronico) VALUES(?,?,?,?,?,?)";
        
 
        try{
           ps = con.prepareStatement(SQL);
           ps.setString(1,usr.getNombre_de_usuario());
           ps.setString(2,usr.getContraseña());
           ps.setString(3,usr.getNombre());
           ps.setString(4,usr.getApellido());
           ps.setString(5,usr.getNumero_de_telefono());
           ps.setString(6,usr.getCorreo_electronico());
           ps.execute();
           return true;
        } catch (SQLException ex){
          Logger.getLogger(SQLusuario.class.getName()).log(Level.SEVERE,null,ex);
          
          return false;
        }
             
    }
    
}
    
