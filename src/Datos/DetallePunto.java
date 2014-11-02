package Datos;
// Generated 02-nov-2014 20:36:45 by Hibernate Tools 3.6.0


import java.io.Serializable;

/**
 * DetallePunto generated by hbm2java
 */
public class DetallePunto  implements java.io.Serializable {


     private int idDetallePunto;
     private Punto punto;
     private Area area;
     private int id;
     private int nroOrden;
     private Serializable fechaCreacion;
     private int idPunto;
     private int idArea;

    public DetallePunto() {
    }

    public DetallePunto(int idDetallePunto, Punto punto, Area area, int id, int nroOrden, Serializable fechaCreacion, int idPunto, int idArea) {
       this.idDetallePunto = idDetallePunto;
       this.punto = punto;
       this.area = area;
       this.id = id;
       this.nroOrden = nroOrden;
       this.fechaCreacion = fechaCreacion;
       this.idPunto = idPunto;
       this.idArea = idArea;
    }
   
    public int getIdDetallePunto() {
        return this.idDetallePunto;
    }
    
    public void setIdDetallePunto(int idDetallePunto) {
        this.idDetallePunto = idDetallePunto;
    }
    public Punto getPunto() {
        return this.punto;
    }
    
    public void setPunto(Punto punto) {
        this.punto = punto;
    }
    public Area getArea() {
        return this.area;
    }
    
    public void setArea(Area area) {
        this.area = area;
    }
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getNroOrden() {
        return this.nroOrden;
    }
    
    public void setNroOrden(int nroOrden) {
        this.nroOrden = nroOrden;
    }
    public Serializable getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Serializable fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public int getIdPunto() {
        return this.idPunto;
    }
    
    public void setIdPunto(int idPunto) {
        this.idPunto = idPunto;
    }
    public int getIdArea() {
        return this.idArea;
    }
    
    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }




}


