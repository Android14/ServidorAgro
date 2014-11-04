/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;
import Datos.HibernateUtil;
import Datos.Plaga;
import Datos.Trabajo;
import Datos.conexion;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author GABRIEL
 */
public class CtrTrabajo {
    private  conexion cx;

    public CtrTrabajo() {
        cx=new conexion();
    }
    public boolean InsertarTrabajo(Trabajo p){
        if (p!=null) {
            cx.Insertar(p);
            return true;
        }else {
            return false;
        }
    }
    
    public boolean ModificarTrabajo(Trabajo p){
        if (p!=null) {
            cx.Modificar(p);
            return true;
        }else {
            return false;
        }
    }
    public boolean EliminarTrabajo(Trabajo p){
        if (p!=null) {
            cx.Eliminar(p);
            return true;
        }else {
            return false;
        }
    }
    public List<Trabajo> ObtenerTrabajo(String consulta){
        List<Trabajo> lista=new  ArrayList<Trabajo>();
        if (!consulta.equals("")) {
            lista=cx.getObjects(consulta);
            
        }else {
           lista=null;
        }
        return lista;
    }
}
