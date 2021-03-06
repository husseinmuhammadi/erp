package com.digiboy.erp.web.controller;

import org.slf4j.Logger;

import javax.inject.Inject;
import javax.inject.Named;

@Named("home")
public class HomeController {
    @Inject
    private Logger logger;

    public String index() {
        logger.info("Forward to index");
        return "index";
    }
}
