package com.digiboy.erp.dao;

import com.digiboy.erp.to.User;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
public class UserDao extends GenericDao<User, String> {

    @Inject
    private EntityManager em;

    public void save(User user) {
        em.persist(user);
    }
}
