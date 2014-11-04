/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;
import Datos.Actividad;
import Datos.Aplicacion;
import Datos.Area;
import Datos.HibernateUtil;
import Datos.Plaga;
import Datos.conexion;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author GABRIEL
 */
public class CtrAplicacion {
    private  conexion cx;

    public CtrAplicacion() {
        cx=new conexion();
    }
    public boolean InsertarAplicacion(Aplicacion p){
        if (p!=null) {
            cx.Insertar(p);
            return true;
        }else {
            return false;
        }
    }
    
    public boolean ModificarAplicacion(Aplicacion p){
        if (p!=null) {
            cx.Modificar(p);
            return true;
        }else {
            return false;
        }
    }
    public boolean EliminarAplicacion(Aplicacion p){
        if (p!=null) {
            cx.Eliminar(p);
            return true;
        }else {
            return false;
        }
    }
    public List<Aplicacion> ObtenerAplicacion(String consulta){
        List<Aplicacion> lista=new  ArrayList<Aplicacion>();
        if (!consulta.equals("")) {
            lista=cx.getObjects(consulta);
            
        }else {
           lista=null;
        }
        return lista;
    }
}
