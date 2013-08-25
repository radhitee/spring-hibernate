/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package umbara.dhit.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import umbara.dhit.model.person;

/**
 *
 * @author ADM Billet
 */
@Repository
public class personDAO {

    @Autowired
    SessionFactory sessionFactory;

    public void save(person p) {
     sessionFactory.getCurrentSession().save(p);
    }
}
