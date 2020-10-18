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

public class vendedorDAO {
    PreparedStatement ps;
    ResultSet rs;
    
    /**/
    Conexion con=new Conexion();
    Connection acceso;
    
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
