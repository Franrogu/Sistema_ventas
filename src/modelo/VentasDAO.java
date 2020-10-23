
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.Ventas;
import modelo.DegalleVentas;


public class VentasDAO {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
    
    public String NroSerieVentas(){
        String serie="";
        String sql="select max(numeroserie) from ventas";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                serie=rs.getString(1);
                
            }
        } catch (Exception e) {
        }
        return serie;
    }
    
    public String IdVentas(){
        String idv="";
        String sql="select max(idventas) from ventas";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                idv=rs.getString(1);
                              
            }
        } catch (Exception e) {
        }
        return  idv;
    }
    
    public int GuardarVentas(Ventas v){
        Ventas ventas=new Ventas();
        String sql="insert into ventas(idcliente,idvendedor,numeroserie,fechaventa,monto,estado) values(?,?,?,?,?,?)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, v.getIdcliente());
            ps.setInt(2, v.getIdVvendedor());
            ps.setString(3, v.getSerie());
            ps.setString(4, v.getFechaVent());
            ps.setDouble(5, v.getMonto());
            ps.setString(6, v.getEstado());
            r=ps.executeUpdate();
            
            if (r>0) {
                JOptionPane.showMessageDialog(null, "Informacion de ventas guardada");
            }
        } catch (Exception e) {
        }
        
        return r;
    }
    
    
    public  int GuardarDetalleVentas(DegalleVentas dv){
        String sql="insert into detalle_ventas(ventas_idventas,producto_idproducto,cantidad,precio)values(?,?,?,?)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, dv.getIdVentas());
            ps.setInt(2, dv.getIdProducto());
            ps.setInt(3, dv.getCantidad());
            ps.setDouble(4, dv.getPrecioVenta());
           
            
            r=ps.executeUpdate();
            if (r>0) {
                JOptionPane.showMessageDialog(null, "Informacion de detalle ventas guardada");
            }
        } catch (Exception e) {
        }
        
        return r;
    }
}
