/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package umbara.dhit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umbara.dhit.model.person;

/**
 *
 * @author ADM Billet
 */
@Service(value = "a")
@Transactional(readOnly = true)
public class service implements iface {
@Autowired personDAO dao;
    @Override
    @Transactional(readOnly = false)
    public void save(person p) {
        dao.save(p);
    }
}
