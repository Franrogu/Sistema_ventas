/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.Connection;
import  java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import modelo.vendedores;

public class vendedorDAO implements CRUD{
    PreparedStatement ps;
    ResultSet rs;
    Conexion con=new Conexion();
    Connection acceso;
    
    vendedores ven=new vendedores();
    
   
public vendedores listarID(String dni){
    vendedores v=new vendedores();
    String sql="select * from vendedor where dni=?";
    try {
       acceso=con.Conectar();
       ps=acceso.prepareStatement(sql);
        ps.setString(1, dni);
        rs=ps.executeQuery();
        while (rs.next()) {            
            v.setId(rs.getInt(1));
            v.setDni(rs.getString(2));
            v.setNombre(rs.getString(3));
            v.setTelefono(rs.getString(4));
            v.setUser(rs.getString(5));
            v.setEstado(rs.getInt(6));
        }
    } catch (Exception e) {
    }
    return v;
}





    @Override
    public List listar() {
        List<vendedores> lista=new ArrayList<>();
        String sql="select * from vendedor";
        try {                                   //************INVESTIGAR PARA QUE SIRVE EL TRY CATCH
          acceso=con.Conectar();
       ps=acceso.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
               vendedores v=new vendedores();      ///*************INSTANCIAMOS EL OBJETO CLIENTE
                 v.setId(rs.getInt(1));
                 v.setDni(rs.getString(2));
                 v.setNombre(rs.getString(3));
                 v.setTelefono(rs.getString(4));
                 v.setUser(rs.getString(5));
                 v.setEstado(rs.getInt(6));
                 lista.add(v);
                
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="insert into vendedor(dni,nombre,telefono,user,estado)values(?,?,?,?,?)";
        try {
            acceso=con.Conectar();
       ps=acceso.prepareStatement(sql);  //***************COMO PARAMETRO INGRESAMOS LA CONSULTA SQL
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
        String sql="update vendedor set dni=?,nombre=?,telefono=?,user=?,estado=? where idvendedor=?";
        try {
            acceso=con.Conectar();
       ps=acceso.prepareStatement(sql);
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
        String sql="delete from vendedor where idvendedor=?";
        try {
            acceso=con.Conectar();
       ps=acceso.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
   
    
    
    public EntidadVendedor ValidarVendedor(String dni,String user){
        EntidadVendedor ev=new EntidadVendedor();
        String sql="SELECT * FROM vendedor WHERE dni like ? and user like ?";
        try {
            acceso=con.Conectar();
            ps=acceso.prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, user);
            rs=ps.executeQuery();
            while (rs.next()) {
                ev.setId(rs.getInt(1));
                ev.setDni(rs.getString(2));
                ev.setNombre(rs.getString(3));
                ev.setTelefono(rs.getString(4));
                ev.setEstado(rs.getString(5));
                ev.setUser(rs.getString(6));
            }
        } catch (Exception e) {
        }
        return ev;
    }
}
