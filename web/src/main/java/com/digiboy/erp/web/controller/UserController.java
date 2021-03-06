package com.digiboy.erp.web.controller;

import com.digiboy.erp.api.UserService;
import org.slf4j.Logger;

import javax.ejb.EJB;
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

    @EJB
    private UserService userService;



}
