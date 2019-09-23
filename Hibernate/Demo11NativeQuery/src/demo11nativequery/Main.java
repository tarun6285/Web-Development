/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo11nativequery;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
            Query q = session.createSQLQuery("select * from list where age > 20 ");
            List l = q.list();
            Iterator itr = l.iterator();
            while (itr.hasNext()) {
                Object[] obj = (Object[]) itr.next();
                System.out.println(obj[0] + "\t" + obj[1] + "\t" + obj[2]);
            }
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        } finally {
            session.flush();
            session.close();
        }
    }
}
