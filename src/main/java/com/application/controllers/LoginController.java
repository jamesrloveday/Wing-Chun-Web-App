package com.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by james on 13/06/2016.
 *
 * Login controller class to return the login page and to handle login requests from the user.
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String getLoginPage() {
        return "login";
    }
}
