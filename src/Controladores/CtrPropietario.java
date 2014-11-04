/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;
import Datos.HibernateUtil;
import Datos.Propietario;

import Datos.conexion;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author GABRIEL
 */
public class CtrPropietario {
    private  conexion cx;

    public CtrPropietario() {
        cx=new conexion();
    }
    public boolean InsertarPropietario(Propietario p){
        if (p!=null) {
            cx.Insertar(p);
            return true;
        }else {
            return false;
        }
    }
    
    public boolean ModificarPropietario(Propietario p){
        if (p!=null) {
            cx.Modificar(p);
            return true;
        }else {
            return false;
        }
    }
    public boolean EliminarPropietario(Propietario p){
        if (p!=null) {
            cx.Eliminar(p);
            return true;
        }else {
            return false;
        }
    }
    public List<Propietario> ObtenerPropietario(String consulta){
        List<Propietario> lista=new  ArrayList<Propietario>();
        if (!consulta.equals("")) {
            lista=cx.getObjects(consulta);
            
        }else {
           lista=null;
        }
        return lista;
    }
}
