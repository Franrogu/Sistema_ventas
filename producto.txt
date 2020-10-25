
package modelo;

import static sun.security.krb5.Confounder.bytes;


public class Producto {
    int id;
    String proveedor;
    String codigo;
    String tamaño;
    String tipo;
    int stock;
    double preciomay;
    double preciocat;
    double preciomen;
   

    public Producto() {
    }

    public Producto(int id, String proveedor, String codigo, String tamaño, String tipo, int stock, double preciomay, double preciocat, double preciomen) {
        this.id = id;
        this.proveedor = proveedor;
        this.codigo = codigo;
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.stock = stock;
        this.preciomay = preciomay;
        this.preciocat = preciocat;
        this.preciomen = preciomen;
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPreciomay() {
        return preciomay;
    }

    public void setPreciomay(double preciomay) {
        this.preciomay = preciomay;
    }

    public double getPreciocat() {
        return preciocat;
    }

    public void setPreciocat(double preciocat) {
        this.preciocat = preciocat;
    }

    public double getPreciomen() {
        return preciomen;
    }

    public void setPreciomen(double preciomen) {
        this.preciomen = preciomen;
    }

  
    
}

    