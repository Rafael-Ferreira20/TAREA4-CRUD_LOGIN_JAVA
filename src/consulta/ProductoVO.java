//meteos set y get productos
package consulta;

public class ProductoVO {
    String ID ;
    String Nombre_Usuario;
    String Contraseña;
    String Nombre;
    String Apellido;
    String Telefono;
    String Correo;

public ProductoVO(){}

/*Todo los codigos get*/

public String getID(){
        return ID;
    }
    public String getNombre_Usuario(){
        return Nombre_Usuario;
    }
    public String getContraseña(){
        return Contraseña;
    }
    public String getNombre(){
        return Nombre;
    }
    public String getApellido(){
        return Apellido;
    }
    public String getTelefono(){
        return Telefono;
    }
    public String getCorreo(){
        return Correo;
    }
  

/*Todo los codigos set*/
     public void setID(String ID){
        this.ID = ID;
    }
    public void setNombre_Usuario(String Nombre_Usuario){
        this.Nombre_Usuario = Nombre_Usuario;
    }
    public void setContraseña(String Contraseña){
        this.Contraseña = Contraseña;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public void setApellido(String Apellido){
        this.Apellido = Apellido;
    }
    public void setTelefono(String Telefono){
        this.Telefono = Telefono;
    }
    public void setCorreo(String Correo){
        this.Correo = Correo;
    }

}
