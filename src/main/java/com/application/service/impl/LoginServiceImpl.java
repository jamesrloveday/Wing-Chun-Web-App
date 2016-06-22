package com.application.service.impl;

import com.application.service.LoginService;
import com.application.service.UserService;
import com.application.transferObjects.User;
import com.application.validator.FieldValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by james on 13/06/2016.
 */
@Component("loginService")
public class LoginServiceImpl implements LoginService, FieldValidator {

    private final UserService userService;

    @Autowired
    public LoginServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean loginUser(User user) {
        if(this.isNotNull(user.username) && this.isNotNull(user.password)) {
            if((userService.findUser(user.username, user.password) != null)) {
                return !userService.findUser(user.username, user.password).clubLocation.isEmpty();
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
