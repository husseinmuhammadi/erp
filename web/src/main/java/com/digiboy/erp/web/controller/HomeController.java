package com.digiboy.erp.web.controller;

import org.apache.shiro.util.ByteSource;
import org.apache.shiro.util.SimpleByteSource;
import org.slf4j.Logger;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;
import java.io.InputStream;

@Named("home")
public class HomeController {
    @Inject
    private Logger logger;

    public String index() {
        ByteSource byteSource = new SimpleByteSource(getClass().getClassLoader().getResourceAsStream("logback.xml"));
        System.out.println(new String(byteSource.getBytes()));

        logger.info("Forward to index");
        return "index";
    }
}
