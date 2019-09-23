/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo12querybyexample;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;

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
            CList cl = new CList();
            cl.setAge(21);
            Example ex = Example.create(cl);
            Criteria c = session.createCriteria(CList.class);
            c.add(ex);
            List l = c.list();
            Iterator itr = l.iterator();
            while (itr.hasNext()) {
                CList t = (CList) itr.next();
                System.out.println(t.getId() + "\t" + t.getName() + "\t" + t.getAge());
            }
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        } finally {
            session.flush();
            session.close();
        }
    }
}
