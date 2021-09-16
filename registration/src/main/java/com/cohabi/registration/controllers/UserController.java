package com.cohabi.registration.controllers;

import com.cohabi.registration.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping(value = "user/{id}")
    public User getUser(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setFirstName("Martin");
        user.setLastName("Gutierrez");
        user.setPhone("3127773294");
        user.setEmail("mgo@mgo.com");
        user.setPassword("1234");
        return user;
    }

    @RequestMapping(value = "user")
    public List<User> getUsers() {

        List<User> userList = new ArrayList<>();

        User user = new User();
        user.setId(1L);
        user.setFirstName("Martin");
        user.setLastName("Gutierrez");
        user.setPhone("3127773294");
        user.setEmail("mgo@mgo.com");
        user.setPassword("1234");

        User user2 = new User();
        user2.setId(2L);
        user2.setFirstName("Martin");
        user2.setLastName("Gutierrez");
        user2.setPhone("3127773294");
        user2.setEmail("mgo@mgo.com");
        user2.setPassword("1234");

        User user3 = new User();
        user3.setId(3L);
        user3.setFirstName("Martin");
        user3.setLastName("Gutierrez");
        user3.setPhone("3127773294");
        user3.setEmail("mgo@mgo.com");
        user3.setPassword("1234");

        userList.add(user);
        userList.add(user2);
        userList.add(user3);
        return userList;
    }
    @RequestMapping(value = "marto")
    public User edit() {
        User user = new User();
        user.setFirstName("Martin");
        user.setLastName("Gutierrez");
        user.setPhone("3127773294");
        user.setEmail("mgo@mgo.com");
        user.setPassword("1234");
        return user;
    }

    @RequestMapping(value = "fuan")
    public User getUsuario() {
        User user = new User();
        user.setFirstName("Martin");
        user.setLastName("Gutierrez");
        user.setPhone("3127773294");
        user.setEmail("mgo@mgo.com");
        user.setPassword("1234");
        return user;
    }

}
