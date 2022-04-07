package consulta;

import consulta.ProductoVO;
import java.sql.*;
import java.util.ArrayList;



/*Metodo listar*/
public class ProductoDAO{
    //meteodos de mostar , mododficar y elimnar de vista ususarios.

    public ArrayList<ProductoVO> Listar_ProductoVO(){
        ArrayList<ProductoVO> list = new ArrayList<>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM usuario";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ProductoVO vo = new ProductoVO();
                vo.setID(rs.getString(1));
                vo.setNombre_Usuario(rs.getString(2));
                vo.setContraseña(rs.getString(3));
                vo.setNombre(rs.getString(4));
                vo.setApellido(rs.getString(5));
                vo.setTelefono(rs.getString(6));
                vo.setCorreo(rs.getString(7));
                list.add(vo);
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                rs.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
        return list;
    }

    public void Modificar_ProductoVO(ProductoVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE usuario SET nombre_de_usuario=?, contraseña=?, nombre=?, apellido=?, numero_de_telefono=?, correo_electronico=? WHERE id=?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getNombre_Usuario());
            ps.setString(2, vo.getContraseña());
            ps.setString(3, vo.getNombre());
            ps.setString(4, vo.getApellido());
            ps.setString(5, vo.getTelefono());
            ps.setString(6, vo.getCorreo());
            ps.setString(7, vo.getID());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
        
        
    }
      

    public static void eliminar_reg(int id){
           
           Conectar conec = new Conectar();
           String Q = "delete from usuarios.usuario where id = "+id;

           PreparedStatement ps = null;
          try{
            ps = conec.getConnection().prepareStatement(Q);
             ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
      
     }
    
            
}
}