package Datos;
// Generated 11-nov-2014 19:09:06 by Hibernate Tools 3.6.0


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Punto generated by hbm2java
 */
public class Punto  implements java.io.Serializable {


     private int idPunto;
     private int id;
     private Serializable latitud;
     private Serializable longitud;
     private Serializable fechaCreacion;
     private Set detallePuntos = new HashSet(0);

    public Punto() {
    }

	
    public Punto(int idPunto, int id, Serializable latitud, Serializable longitud, Serializable fechaCreacion) {
        this.idPunto = idPunto;
        this.id = id;
        this.latitud = latitud;
        this.longitud = longitud;
        this.fechaCreacion = fechaCreacion;
    }
    public Punto(int idPunto, int id, Serializable latitud, Serializable longitud, Serializable fechaCreacion, Set detallePuntos) {
       this.idPunto = idPunto;
       this.id = id;
       this.latitud = latitud;
       this.longitud = longitud;
       this.fechaCreacion = fechaCreacion;
       this.detallePuntos = detallePuntos;
    }
   
    public int getIdPunto() {
        return this.idPunto;
    }
    
    public void setIdPunto(int idPunto) {
        this.idPunto = idPunto;
    }
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Serializable getLatitud() {
        return this.latitud;
    }
    
    public void setLatitud(Serializable latitud) {
        this.latitud = latitud;
    }
    public Serializable getLongitud() {
        return this.longitud;
    }
    
    public void setLongitud(Serializable longitud) {
        this.longitud = longitud;
    }
    public Serializable getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Serializable fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Set getDetallePuntos() {
        return this.detallePuntos;
    }
    
    public void setDetallePuntos(Set detallePuntos) {
        this.detallePuntos = detallePuntos;
    }




}


