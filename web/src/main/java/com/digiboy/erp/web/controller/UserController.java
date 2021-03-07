package com.digiboy.erp.web.controller;

import com.digiboy.erp.api.UserService;
import com.digiboy.erp.dto.UserDTO;
import org.slf4j.Logger;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class UserController implements Serializable {
    private static final long serialVersionUID = 4903676104974969327L;
    private String username;
    private String password;

    @Inject
    private Logger logger;

    @EJB
    private UserService userService;

    public String save() {
        userService.save(new UserDTO(username, password));
        return "index";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
