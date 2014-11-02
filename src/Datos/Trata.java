package Datos;
// Generated 02-nov-2014 20:36:45 by Hibernate Tools 3.6.0


import java.io.Serializable;

/**
 * Trata generated by hbm2java
 */
public class Trata  implements java.io.Serializable {


     private int id;
     private Producto producto;
     private Plaga plaga;
     private int seguridad;
     private Serializable fechaCreacion;

    public Trata() {
    }

    public Trata(int id, Producto producto, Plaga plaga, int seguridad, Serializable fechaCreacion) {
       this.id = id;
       this.producto = producto;
       this.plaga = plaga;
       this.seguridad = seguridad;
       this.fechaCreacion = fechaCreacion;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public Plaga getPlaga() {
        return this.plaga;
    }
    
    public void setPlaga(Plaga plaga) {
        this.plaga = plaga;
    }
    public int getSeguridad() {
        return this.seguridad;
    }
    
    public void setSeguridad(int seguridad) {
        this.seguridad = seguridad;
    }
    public Serializable getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Serializable fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }




}


