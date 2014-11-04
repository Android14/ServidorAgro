/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;
import Datos.HibernateUtil;
import Datos.Plaga;
import Datos.Propiedad;
import Datos.conexion;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author GABRIEL
 */
public class CtrPropiedad {
    private  conexion cx;

    public CtrPropiedad() {
        cx=new conexion();
    }
    public boolean InsertarPropiedad(Propiedad p){
        if (p!=null) {
            cx.Insertar(p);
            return true;
        }else {
            return false;
        }
    }
    
    public boolean ModificarPropiedad(Propiedad p){
        if (p!=null) {
            cx.Modificar(p);
            return true;
        }else {
            return false;
        }
    }
    public boolean EliminarPropiedad(Propiedad p){
        if (p!=null) {
            cx.Eliminar(p);
            return true;
        }else {
            return false;
        }
    }
    public List<Propiedad> ObtenerPropiedad(String consulta){
        List<Propiedad> lista=new  ArrayList<Propiedad>();
        if (!consulta.equals("")) {
            lista=cx.getObjects(consulta);
            
        }else {
           lista=null;
        }
        return lista;
    }
}
