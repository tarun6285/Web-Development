/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demohibernatecomponent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
            CEmp emp = (CEmp) session.load(CEmp.class, new Integer(1));
            System.out.println("Employee Name: " + emp.getName());
            System.out.println("City: " + emp.getAddress().getCity());
            System.out.println("State: " + emp.getAddress().getState());
            System.out.println("Country: " + emp.getAddress().getCountry());
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        } finally {
            session.flush();
            session.close();
        }
    }
}
