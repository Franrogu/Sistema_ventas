
package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.imageio.stream.FileImageInputStream;


public class ProductosDAO {
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
   
    //Producto co=new Producto();
    


    public Producto listarID(String codigo){        //Nos lista el codigo que le ingresemos al buscador en "Generar ventas"
    Producto p=new Producto();
    String sql="select * from producto where codigo=?";
    try {
        con=cn.Conectar();
        ps=con.prepareStatement(sql);
        ps.setString(3, codigo);    //Obtiene el codigo del producto y lo manda al buscador del generador de ventas
        rs=ps.executeQuery();
        while (rs.next()) {            
            p.setId(rs.getInt(1));
            p.setProveedor(rs.getString(2));
            p.setCodigo(rs.getString(3));
            p.setTamaño(rs.getString(4));
            p.setTipo(rs.getString(5));
            p.setStock(rs.getInt(6));
            p.setPreciomay(rs.getDouble(7));
            p.setPreciocat(rs.getDouble(8));
            p.setPreciomen(rs.getDouble(9));
          //  p.setFoto(rs.getBytes(10));
         
        }
    } catch (Exception e) {
    }
    return p;
}
    

    
//    @Override
    
    
    
    public List listar() {
        List<Producto> lista=new ArrayList<>();
        String sql="select * from producto";
        //idproducto,proveedor,codigo,numerot,tipo,stock,preciomay,preciocat,preciomen
        try {                                   //************INVESTIGAR PARA QUE SIRVE EL TRY CATCH
            con = cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
             Producto p=new Producto();///*************INSTANCIAMOS EL OBJETO PRODUCTO
                 p.setId(rs.getInt(1));
                 p.setProveedor(rs.getString(2));
                 p.setCodigo(rs.getString(3));
                 p.setTamaño(rs.getString(4));
                 p.setTipo(rs.getString(5));
                 p.setStock(rs.getInt(6));
                 p.setPreciomay(rs.getDouble(7));
                 p.setPreciocat(rs.getDouble(8));
                 p.setPreciomen(rs.getDouble(9));
                 //p.setFoto(rs.getBytes(10));
               
                  lista.add(p);                                        }
        } catch (Exception e) {
        }
        return lista;
    }

    
    
    
    /*
    public void saveimg(String nomimg, String img){
        
      String sql="insert into producto(nomimg,img)values(?,?)";
        FileInputStream fi=null;  //Se encarga de leer el archivo desde una ruta, ademas de convertir la imagen en bytes
        try {
            File file = new File(nomimg);   //El objeto tipo file va a leer la ruta e la imagen 
            fi = new FileInputStream(file);  //Aqui lee la imagen en bites
            
            ps=con.prepareStatement(sql); //Aqui insertamos en la base de datos la sentencia guardada en la variable "sql"
            ps.setString(9, nomimg);
            ps.setBinaryStream(10, fi); //Aqui guarda la imagen en binario
            ps.executeUpdate();
            
            
        } catch (Exception e) {
        }
        
    }
    */
    
   // @Override
    
    
    
    public int add(Object[] o) { //****+En object[] o" lo que hacemos es pasarle todos los datos obtenidos por la consulta sql 
        int r=0;
        String sql="insert into producto(proveedor,codigo,numerot,tipo,stock,preciomay,preciocat,preciomen)values(?,?,?,?,?,?,?,?)";
        try {
            con=cn.Conectar();
           // File file=new File();//El objeto tipo File lee la ruta de la imagen 
                    
            ps=con.prepareStatement(sql);  //***************COMO PARAMETRO INGRESAMOS LA CONSULTA SQL
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            ps.setObject(8, o[7]);
           
            
            //ps.setBytes(9, o.getFoto());
            
            r=ps.executeUpdate();     //**********************CODIGO DONDE SE EJECUTAN LOS CAMBIOS SE IGUALA A LA RESPUESTA
        } catch (Exception e) {
        }
        return r;
    }

  // @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql="update producto set proveedor=?,codigo=?,numerot=?,tipo=?,stock=?,preciomay=?,preciocat=?,preciomen=? where idproducto=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            ps.setObject(8, o[7]);
            ps.setObject(9, o[8]);
           
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

  //  @Override
    public void eliminar(int id) {
          String sql="delete from producto where idproducto=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

 
    
    
}
