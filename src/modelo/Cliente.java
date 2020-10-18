
package modelo;

import java.security.cert.CertPathBuilderSpi;


public class Cliente {
    int id;
    String dni;
    String nombre;
    String direccion;
    String telefono;
    String estado;

    
    //****************SE AGREGA EL CONSTRUCTOR VACIO***********************

    public Cliente() {
    }
    
    
  //****************SE AGREGA CONSTRUCTOR INICIALIZANDO LAS VARIABLES*********
    public Cliente(int id, String dni, String nombre, String direccion, String telefono, String estado) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estado = estado;
    }

        //***********************SE AGREGAN LOS METODOS GETTER Y SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
}    
  
 
    

   
