
package modelo;


public class DegalleVentas {
    int id;
    int idVentas;
    int IdProducto;
    int cantidad;
    String tipo;
    String tamaño;
    String color;
    double precioVenta;

    public DegalleVentas() {
    }

    public DegalleVentas(int id, int idVentas, int IdProducto, int cantidad, String tipo, String tamaño, String color, double precioVenta) {
        this.id = id;
        this.idVentas = idVentas;
        this.IdProducto = IdProducto;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.color = color;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
     
    
}
