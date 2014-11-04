/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;
import Datos.Actividad;
import Datos.Area;
import Datos.Cultivo;
import Datos.HibernateUtil;
import Datos.Plaga;
import Datos.conexion;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author GABRIEL
 */
public class CtrCultivo {
    private  conexion cx;

    public CtrCultivo() {
        cx=new conexion();
    }
    public boolean InsertarCultivo(Cultivo p){
        if (p!=null) {
            cx.Insertar(p);
            return true;
        }else {
            return false;
        }
    }
    
    public boolean ModificarCultivo(Cultivo p){
        if (p!=null) {
            cx.Modificar(p);
            return true;
        }else {
            return false;
        }
    }
    public boolean EliminarCultivo(Cultivo p){
        if (p!=null) {
            cx.Eliminar(p);
            return true;
        }else {
            return false;
        }
    }
    public List<Cultivo> ObtenerCultivo(String consulta){
        List<Cultivo> lista=new  ArrayList<Cultivo>();
        if (!consulta.equals("")) {
            lista=cx.getObjects(consulta);
            
        }else {
           lista=null;
        }
        return lista;
    }
}
