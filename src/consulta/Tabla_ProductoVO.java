
//realizacion de la tabla ususario

package consulta;

import consulta.Render;
import consulta.ProductoVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.JButton;


public class Tabla_ProductoVO{

   ProductoDAO dao = null;

    public void visualizar_ProductoVO(JTable tabla){
        
        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        dt.addColumn("ID");
        dt.addColumn("Nombre Usuario");
        dt.addColumn("Contraseña");
        dt.addColumn("Nombre");
        dt.addColumn("Apellido");
        dt.addColumn("Telefono");
        dt.addColumn("Correo Electronico");
        dt.addColumn("Modificar");
        dt.addColumn("Eliminar");

        JButton btn_modificar = new JButton("Modificar");
        btn_modificar.setName("m");
        
        JButton btn_eliminar = new JButton("Eliminar");
        btn_eliminar.setName("e");
        
        dao = new ProductoDAO();
        ProductoVO vo = new ProductoVO();
        ArrayList<ProductoVO> list = dao.Listar_ProductoVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[9];
                vo = list.get(i);
                fila[0] = vo.getID();
                fila[1] = vo.getNombre_Usuario();
                fila[2] = vo.getContraseña();
                fila[3] = vo.getNombre();
                fila[4] = vo.getApellido();
                fila[5] = vo.getTelefono();
                fila[6] = vo.getCorreo();
                fila[7] = btn_modificar;
                fila[8] = btn_eliminar;
                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(20);
        }
    }
}


