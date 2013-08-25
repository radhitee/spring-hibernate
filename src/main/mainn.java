/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import umbara.dhit.model.person;
import umbara.dhit.service.iface;

/**
 *
 * @author ADM Billet
 */
public class mainn {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("classpath:Config.xml");
        iface s=(iface)context.getBean("a");
        person p=new person();
        p.setName("fvck");
        p.setPassword("love");
        s.save(p);
    }
}
