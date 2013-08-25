/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import umbara.dhit.model.person;



/**
 *
 * @author ADM Billet
 */
public class main {
    public static void main(String[] args) {
        SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
        person p=new person();
        p.setName("fvck");
        p.setPassword("you");
        Session s=sf.openSession();
        try {
            s.beginTransaction();
            s.save(p);
            s.getTransaction().commit();
        } catch (HibernateException e) {
        s.getTransaction().rollback();
        }s.close();
        s=sf.openSession();
        Query q=s.createQuery("from person");
        List<person> ls=q.list();
        for(person pp: ls){
            System.out.println("ID\t: "+pp.getId());
            System.out.println("Name\t: "+pp.getName());
            System.out.println("Pass\t: "+pp.getPassword());
        }
        s.close();
        sf.close();
    }
}
