/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;
import Datos.Actividad;
import Datos.Area;
import Datos.HibernateUtil;
import Datos.Plaga;
import Datos.TipoCultivo;
import Datos.conexion;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author GABRIEL
 */
public class CtrTipoCultivo {
    private  conexion cx;

    public CtrTipoCultivo() {
        cx=new conexion();
    }
    public boolean InsertarTipoCultivo(TipoCultivo p){
        if (p!=null) {
            cx.Insertar(p);
            return true;
        }else {
            return false;
        }
    }
    
    public boolean ModificarTipoCultivo(TipoCultivo p){
        if (p!=null) {
            cx.Modificar(p);
            return true;
        }else {
            return false;
        }
    }
    public boolean EliminarTipoCultivo(TipoCultivo p){
        if (p!=null) {
            cx.Eliminar(p);
            return true;
        }else {
            return false;
        }
    }
    public List<TipoCultivo> ObtenerTipoCultivo(String consulta){
        List<TipoCultivo> lista=new  ArrayList<TipoCultivo>();
        if (!consulta.equals("")) {
            lista=cx.getObjects(consulta);
            
        }else {
           lista=null;
        }
        return lista;
    }
}
