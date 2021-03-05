package com.digiboy.erp.web.controller;

import com.javastudio.shiro.service.UserService;
import org.slf4j.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class UserController {
    private String username;
    private String password;

    @Inject
    private Logger logger;

    @Inject
    private UserService userService;

}
