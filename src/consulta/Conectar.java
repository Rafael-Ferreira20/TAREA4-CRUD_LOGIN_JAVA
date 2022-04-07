
//conexion base de datos 
package consulta;

import java.sql.*;

public class Conectar{
            
    static String bd = "usuarios";
    static String login = "root";
    static String password = "rafael12345";
    static String url = "jdbc:mysql://root@localhost:3306/usuarios";
    Connection connection = null;

    public Conectar(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(url,login,password);
        if (connection!=null){
            System.out.println("Conexión a base de datos "+bd+" OK\n");
        }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConnection(){
        return connection;
    }

    public void desconectar(){
        connection = null;
    }


}