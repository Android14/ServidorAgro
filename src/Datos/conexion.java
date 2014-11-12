package Datos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Hibernate;
//import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author wilmer
 */
public class conexion implements Serializable {

    public static Session cx;

    public conexion() {
       // cx = s.getSessionFactory().openSession();
       cx= HibernateUtil.getSessionFactory().openSession();
    }

    public boolean Insertar(Object o) {
        Transaction t = cx.beginTransaction();
        try {
            cx.save(o);
            t.commit();
            cx.flush();
            return true;
        } catch (Exception e) {
            System.out.println("no se inserto");
            t.rollback();

            return false;
        }
    }

    public boolean Modificar(Object o) {
        Transaction t = cx.beginTransaction();
        try {
            cx.update(o);
            t.commit();
            cx.flush();
            return true;
        } catch (Exception e) {
            System.out.println("no se modifico");
            t.rollback();
            return false;
        }
    }
 public static boolean Modificar2(Object o) {
        Transaction t = cx.beginTransaction();
        try {
            cx.update(o);
            t.commit();
            cx.flush();
            return true;
        } catch (Exception e) {
            System.out.println("no se modifico");
            t.rollback();
            return false;
        }
    }
    public static void Eliminar(Object o) {
        Transaction t = cx.beginTransaction();
        try {
            cx.delete(o);
            t.commit();
            cx.flush();
        } catch (Exception e) {
            System.out.println("no se inserto");
            t.rollback();
        }
    }

    public List getObjects(String HQLQuery) {
        List lista = null;
        try {
            Query q = cx.createQuery(HQLQuery);
            lista = q.list();
        } catch (Exception e) {
        }
        return lista;
    }
    
   
    
 
    
    public static void main(String[] args) {
//          Laboratorio l = new Laboratorio();
//            l.setNroLab(1);
//            l.setCodLab("lab1");
//            l.setNomLab("fernandito");
//            l.setEstado((byte)1);
            Plaga l = new Plaga();
            l.setNombre("Campeones");
            l.setDetallePlaga("Mata choclo");
            l.setImagen("bkjdasfkjb");
            l.setFechaCreacion("10/10/2014");
            l.setFechaActualizacion("19/10/2014");
            conexion c = new conexion();
            //conexion c = new conexion(HibernateUtil.getSessionFactory().openSession());
            c.Insertar(l);
//            Plaga l2 = (Plaga) c.getObjects("select* from Plaga");
//            System.out.println(l2.getNombre()+"   "+l2.getDetallePlaga());
//          int s=8987954;
//        List<Cliente> cl=   c.getObjects("from Cliente where ciPe="+String.valueOf(s));
//        System.out.println(cl.get(1).getNomPe()+cl.get(0).getNomPe());
////          
//         List <Pedido> p= c.getObjects("from Pedido");
//        System.out.println(p.get(0).getNroPed()+p.get(0).getCliente().getNomPe());
//          
//        List<DetallePe> dp=c.getObjects("from DetallePe  where nro_Ped="+String.valueOf(1));
//          System.out.println(dp.get(0).getPedido().getNroPed());
//          System.out.println(dp.get(1).getPedido().getNroPed());
//          System.out.println(dp.get(2).getPedido().getNroPed());
//    
          
          
          
    }

}
