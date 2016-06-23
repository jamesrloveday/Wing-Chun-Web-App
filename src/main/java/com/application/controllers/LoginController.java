package com.application.controllers;

import com.application.service.LoginService;
import com.application.transferObjects.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by james on 13/06/2016.
 *
 * Login controller class to return the login page and to handle login requests from the user.
 */
@Controller
@RequestMapping("/wingchun")
public class LoginController {

    private LoginService loginService;

    public LoginController() {} //default constructor

    @Autowired
    public LoginController(LoginService loginService){
        this.loginService = loginService;
    }

    @RequestMapping(value = "/login")
    public String getLoginPage() {
        return "login";
    }

    @RequestMapping(value = "loginUser", method = RequestMethod.POST)
    public String loginUser(@RequestParam("username") String username,
                            @RequestParam("password") String password) {
        final User user = new User(username, password);
        final boolean loggedIn = loginService.loginUser(user);
            if(loggedIn) return "home";  
            else return "redirect:login";
    }
    
    @RequestMapping(value = "loginUser", method = RequestMethod.GET)
    public String loginUser() {
        final User user = new User();
        final boolean loggedIn = loginService.loginUser(user);
            if(loggedIn) return "home";  
            else return "redirect:login";
    }
}
