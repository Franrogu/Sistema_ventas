//*****************SE REALIZAN LOS METODOS PARA EL MANTENIMIENTO DE NUESTRA BASE DE DATOS***********************


package modelo;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClienteDAO implements CRUD{
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    Cliente co=new Cliente();
    
       
public Cliente listarID(String dni){
    Cliente c=new Cliente();
    String sql="select * from cliente where dni=?";
    try {
        con=cn.Conectar();
        ps=con.prepareStatement(sql);
        ps.setString(1, dni);
        rs=ps.executeQuery();
        while (rs.next()) {            
            c.setId(rs.getInt(1));
            c.setDni(rs.getString(2));
            c.setNombre(rs.getString(3));
            c.setDireccion(rs.getString(4));
            c.setTelefono(rs.getString(5));
            c.setEstado(rs.getString(6));
        }
    } catch (Exception e) {
    }
    return c;
}

    @Override
    public List listar() {
        List<Cliente> lista=new ArrayList<>();
        String sql="select * from cliente";
        try {                                   //************INVESTIGAR PARA QUE SIRVE EL TRY CATCH
            con = cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Cliente c=new Cliente();        ///*************INSTANCIAMOS EL OBJETO CLIENTE
                 c.setId(rs.getInt(1));
                 c.setDni(rs.getString(2));
                 c.setNombre(rs.getString(3));
                 c.setDireccion(rs.getString(4));
                 c.setTelefono(rs.getString(5));
                 c.setEstado(rs.getString(6));
                 lista.add(c);
                
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="insert into cliente(dni,nombre,direccion,telefono,estado)values(?,?,?,?,?)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);  //***************COMO PARAMETRO INGRESAMOS LA CONSULTA SQL
            ps.setObject(1, o[0]);  //*****************ESTE OBJETO DEBE SER UN ARREGLO
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r=ps.executeUpdate();     //**********************CODIGO DONDE SE EJECUTAN LOS CAMBIOS SE IGUALA A LA RESPUESTA
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql="update cliente set dni=?,nombre=?,direccion=?,telefono=?,estado=? where idcliente=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql="delete from cliente where idcliente=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
        
}
