/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package umbara.dhit.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import umbara.dhit.model.person;

/**
 *
 * @author ADM Billet
 */
@Repository
public class personDAO extends HibernateDaoSupport{

    @Autowired
    public void setSuperSessionFactory(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }

    public void save(person p) {
     getHibernateTemplate().save(p);
    }
}
