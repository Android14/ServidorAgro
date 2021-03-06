package Datos;
// Generated 11-nov-2014 19:09:06 by Hibernate Tools 3.6.0


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * TipoCultivo generated by hbm2java
 */
public class TipoCultivo  implements java.io.Serializable {


     private int id;
     private Serializable nombreComun;
     private Serializable nombreCientifico;
     private Serializable familia;
     private Serializable genero;
     private Serializable distEntrePlantas;
     private Serializable distEntreSurcos;
     private Serializable imagen;
     private Serializable fechaCreacion;
     private Serializable fechaActualizacion;
     private Set afectas = new HashSet(0);

    public TipoCultivo() {
    }

	
    public TipoCultivo(int id, Serializable nombreComun, Serializable nombreCientifico, Serializable familia, Serializable genero, Serializable distEntrePlantas, Serializable distEntreSurcos, Serializable imagen, Serializable fechaCreacion, Serializable fechaActualizacion) {
        this.id = id;
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.familia = familia;
        this.genero = genero;
        this.distEntrePlantas = distEntrePlantas;
        this.distEntreSurcos = distEntreSurcos;
        this.imagen = imagen;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }
    public TipoCultivo(int id, Serializable nombreComun, Serializable nombreCientifico, Serializable familia, Serializable genero, Serializable distEntrePlantas, Serializable distEntreSurcos, Serializable imagen, Serializable fechaCreacion, Serializable fechaActualizacion, Set afectas) {
       this.id = id;
       this.nombreComun = nombreComun;
       this.nombreCientifico = nombreCientifico;
       this.familia = familia;
       this.genero = genero;
       this.distEntrePlantas = distEntrePlantas;
       this.distEntreSurcos = distEntreSurcos;
       this.imagen = imagen;
       this.fechaCreacion = fechaCreacion;
       this.fechaActualizacion = fechaActualizacion;
       this.afectas = afectas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Serializable getNombreComun() {
        return this.nombreComun;
    }
    
    public void setNombreComun(Serializable nombreComun) {
        this.nombreComun = nombreComun;
    }
    public Serializable getNombreCientifico() {
        return this.nombreCientifico;
    }
    
    public void setNombreCientifico(Serializable nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }
    public Serializable getFamilia() {
        return this.familia;
    }
    
    public void setFamilia(Serializable familia) {
        this.familia = familia;
    }
    public Serializable getGenero() {
        return this.genero;
    }
    
    public void setGenero(Serializable genero) {
        this.genero = genero;
    }
    public Serializable getDistEntrePlantas() {
        return this.distEntrePlantas;
    }
    
    public void setDistEntrePlantas(Serializable distEntrePlantas) {
        this.distEntrePlantas = distEntrePlantas;
    }
    public Serializable getDistEntreSurcos() {
        return this.distEntreSurcos;
    }
    
    public void setDistEntreSurcos(Serializable distEntreSurcos) {
        this.distEntreSurcos = distEntreSurcos;
    }
    public Serializable getImagen() {
        return this.imagen;
    }
    
    public void setImagen(Serializable imagen) {
        this.imagen = imagen;
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
    public Set getAfectas() {
        return this.afectas;
    }
    
    public void setAfectas(Set afectas) {
        this.afectas = afectas;
    }




}


