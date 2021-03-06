package com.digiboy.erp.service;

import com.digiboy.erp.api.UserService;
import com.digiboy.erp.dao.UserDao;
import com.digiboy.erp.dto.UserDTO;
import com.digiboy.erp.mapper.UserMapper;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
@Local(UserService.class)
public class UserServiceImpl implements UserService {

    @EJB
    private UserDao dao;

    @Inject
    UserMapper mapper;

    @Override
    public UserDTO findByUsername(String username) {
        return null;
    }

    public void save(UserDTO userDTO) {
        dao.save(mapper.toUser(userDTO));
    }
}
