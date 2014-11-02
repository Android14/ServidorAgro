package Datos;
// Generated 02-nov-2014 22:45:18 by Hibernate Tools 3.6.0


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Proveedor generated by hbm2java
 */
public class Proveedor  implements java.io.Serializable {


     private int id;
     private Serializable nombreCompleto;
     private Serializable direccion;
     private Serializable telefono;
     private Serializable otro;
     private Serializable fechaCreacion;
     private Serializable fechaActualizacion;
     private Set productos = new HashSet(0);

    public Proveedor() {
    }

	
    public Proveedor(int id, Serializable nombreCompleto, Serializable direccion, Serializable telefono, Serializable otro, Serializable fechaCreacion, Serializable fechaActualizacion) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.telefono = telefono;
        this.otro = otro;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }
    public Proveedor(int id, Serializable nombreCompleto, Serializable direccion, Serializable telefono, Serializable otro, Serializable fechaCreacion, Serializable fechaActualizacion, Set productos) {
       this.id = id;
       this.nombreCompleto = nombreCompleto;
       this.direccion = direccion;
       this.telefono = telefono;
       this.otro = otro;
       this.fechaCreacion = fechaCreacion;
       this.fechaActualizacion = fechaActualizacion;
       this.productos = productos;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Serializable getNombreCompleto() {
        return this.nombreCompleto;
    }
    
    public void setNombreCompleto(Serializable nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public Serializable getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(Serializable direccion) {
        this.direccion = direccion;
    }
    public Serializable getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(Serializable telefono) {
        this.telefono = telefono;
    }
    public Serializable getOtro() {
        return this.otro;
    }
    
    public void setOtro(Serializable otro) {
        this.otro = otro;
    }
    public Serializable getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Serializable fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Serializable getFechaActualizacion() {
        return this.fechaActualizacion;
    }
    
    public void setFechaActualizacion(Serializable fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
    public Set getProductos() {
        return this.productos;
    }
    
    public void setProductos(Set productos) {
        this.productos = productos;
    }




}


