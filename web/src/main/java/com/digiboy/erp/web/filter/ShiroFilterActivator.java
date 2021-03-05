package com.digiboy.erp.web.filter;

import org.apache.shiro.web.servlet.ShiroFilter;

// This filter already set in web.xml
// @WebFilter("/*")
public class ShiroFilterActivator extends ShiroFilter {
    private ShiroFilterActivator() {
    }
}
