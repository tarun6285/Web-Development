/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package democompositekey;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author admin
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
            Transaction t = session.beginTransaction();
            EmpdeptId id = new EmpdeptId(10, 20);
            Empdept emp = new Empdept();
            emp.setId(id);
            emp.setRole("New Role");
            session.save(emp);
            t.commit();
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        } finally {
            session.flush();
            session.close();
        }
    }
}
