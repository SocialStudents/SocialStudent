/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.UsersDao;
import com.techdhoom.socialstudent.model.Groups;
import com.techdhoom.socialstudent.model.Users;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 *
 * @author SONY
 */
// @Repository
public class UsersDaoImpl extends BaseAbstractGenericDao<Users, Long> implements UsersDao {

    @Override
    public List<Users> groupShow() {
        SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();
        Criteria criteria = new HibernateTemplate(sessionFactory).getSessionFactory().getCurrentSession().createCriteria(Users.class);
        return criteria.list();
    }

    @Override
    public Long createUser(Users users) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long updateEventmaster(Users users) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long deleteEventmaster(Users users) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrievebyidEventmaster(Users users) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrieveallEventmaster(Users users) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Users> retriveAllUsers() {
      return super.retrieveAll();
    }
}
