/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo9criteria;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;

/**
 *
 * @author root
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Session session = null;
        try {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            Criteria c=session.createCriteria(CList.class);
            c.setProjection(Projections.projectionList().add(Projections.property("name")).add(Projections.property("age")));
            c.addOrder(Order.asc("age"));
            //c.addOrder(Order.desc("age"));

            List l = c.list();
            Iterator itr = l.iterator();
            while (itr.hasNext()) {
               Object[] obj = (Object[]) itr.next();
                System.out.println(obj[0] + "\t" + obj[1]);
            }                       
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        } finally {
            session.flush();
            session.close();
        }
    }
}
