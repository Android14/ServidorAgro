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
import Datos.Proveedor;
import Datos.conexion;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author GABRIEL
 */
public class CtrProveedor {
    private  conexion cx;

    public CtrProveedor() {
        cx=new conexion();
    }
    public boolean InsertarProveedor(Proveedor p){
        if (p!=null) {
            cx.Insertar(p);
            return true;
        }else {
            return false;
        }
    }
    
    public boolean ModificarProveedor(Proveedor p){
        if (p!=null) {
            cx.Modificar(p);
            return true;
        }else {
            return false;
        }
    }
    public boolean EliminarProveedor(Proveedor p){
        if (p!=null) {
            cx.Eliminar(p);
            return true;
        }else {
            return false;
        }
    }
    public List<Proveedor> ObtenerProveedor(String consulta){
        List<Proveedor> lista=new  ArrayList<Proveedor>();
        if (!consulta.equals("")) {
            lista=cx.getObjects(consulta);
            
        }else {
           lista=null;
        }
        return lista;
    }
}
