
package modelo;


public class DegalleVentas {
    int id;
    int idVentas;
    int IdProducto;
    int cantidad;
    //String tipo;
    //String tamaño;
    //String color;
    double precioVenta;

    public DegalleVentas() {
    }

    public DegalleVentas(int id, int idVentas, int IdProducto, int cantidad, double precioVenta) {
        this.id = id;
        this.idVentas = idVentas;
        this.IdProducto = IdProducto;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
     
    
}
