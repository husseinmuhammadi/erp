package com.digiboy.erp.service;

import com.digiboy.erp.api.UserService;
import com.digiboy.erp.dto.User;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.Map;

@Stateless
@Local(UserService.class)
public class UserServiceImpl implements UserService {

    private static final Map<String, User> USERS = new HashMap<>();

    static {
        USERS.put("admin", new User("admin", "ac0e7d037817094e9e0b4441f9bae3209d67b02fa484917065f71b16109a1a78"));
    }

    @Override
    public User findByUsername(String username) {
        return USERS.get(username);
    }
}
