package Datos;
// Generated 11-nov-2014 19:09:06 by Hibernate Tools 3.6.0


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Propietario generated by hbm2java
 */
public class Propietario  implements java.io.Serializable {


     private Serializable nombreUsuario;
     private Serializable correo;
     private Serializable nombreCompleto;
     private Serializable contrasena;
     private Serializable fechaCreacion;
     private Serializable fechaActualizacion;
     private Set propiedads = new HashSet(0);

    public Propietario() {
    }

	
    public Propietario(Serializable nombreUsuario, Serializable correo, Serializable nombreCompleto, Serializable contrasena, Serializable fechaCreacion, Serializable fechaActualizacion) {
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.nombreCompleto = nombreCompleto;
        this.contrasena = contrasena;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }
    public Propietario(Serializable nombreUsuario, Serializable correo, Serializable nombreCompleto, Serializable contrasena, Serializable fechaCreacion, Serializable fechaActualizacion, Set propiedads) {
       this.nombreUsuario = nombreUsuario;
       this.correo = correo;
       this.nombreCompleto = nombreCompleto;
       this.contrasena = contrasena;
       this.fechaCreacion = fechaCreacion;
       this.fechaActualizacion = fechaActualizacion;
       this.propiedads = propiedads;
    }
   
    public Serializable getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(Serializable nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public Serializable getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(Serializable correo) {
        this.correo = correo;
    }
    public Serializable getNombreCompleto() {
        return this.nombreCompleto;
    }
    
    public void setNombreCompleto(Serializable nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public Serializable getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(Serializable contrasena) {
        this.contrasena = contrasena;
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
    public Set getPropiedads() {
        return this.propiedads;
    }
    
    public void setPropiedads(Set propiedads) {
        this.propiedads = propiedads;
    }




}


