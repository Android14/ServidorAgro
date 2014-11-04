/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servidoragro;
import Controladores.*;
import Datos.Plaga;
import Datos.Punto;
/**
 *
 * @author GABRIEL
 */
public class ServidorAgro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        CtrPlaga c=new CtrPlaga();
//          Plaga l = new Plaga();
//            l.setNombre("Hormigas");
//            l.setDetallePlaga("Mata lechugas");
//            l.setImagen("bkjdasfkjb");
//            l.setFechaCreacion("10/10/2014");
//            l.setFechaActualizacion("19/10/2014");
//            //conexion c = new conexion(HibernateUtil.getSessionFactory().openSession());
//            c.InsertarPlaga(l);
        CtrPunto c=new CtrPunto();
          Punto l = new Punto();
            l.setId(2);
            l.setLatitud("-64.64386832");
            l.setLongitud("65.49874932");
            l.setFechaCreacion("10/10/2014");
           
            //conexion c = new conexion(HibernateUtil.getSessionFactory().openSession());
            c.InsertarPunto(l);
    }
    
}
