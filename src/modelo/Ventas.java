
package modelo;


public class Ventas {
    int id;
    int idcliente;
    int idVvendedor;
    String Serie;
    String FechaVent;
    Double Monto;
    String estado;

    public Ventas() {
    }

    public Ventas(int id, int idcliente, int idVvendedor, String Serie, String FechaVent, Double Monto, String estado) {
        this.id = id;
        this.idcliente = idcliente;
        this.idVvendedor = idVvendedor;
        this.Serie = Serie;
        this.FechaVent = FechaVent;
        this.Monto = Monto;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdVvendedor() {
        return idVvendedor;
    }

    public void setIdVvendedor(int idVvendedor) {
        this.idVvendedor = idVvendedor;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    public String getFechaVent() {
        return FechaVent;
    }

    public void setFechaVent(String FechaVent) {
        this.FechaVent = FechaVent;
    }

    public Double getMonto() {
        return Monto;
    }

    public void setMonto(Double Monto) {
        this.Monto = Monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
  }
 