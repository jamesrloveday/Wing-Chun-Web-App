package com.application.service;



import com.application.transferObjects.User;

import java.util.List;

/**
 * Created by james on 02/06/2016.
 */
public interface UserService {

    User save(User u);
    List<com.application.transferObjects.User> findAll();
    User findUser(String id);
    User findUser(String username, String password);
}
