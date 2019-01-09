package com.zjp.controller;

import com.zjp.model.pojo.User;
import com.zjp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by hanguoan on 2019/1/6.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users",method = RequestMethod.POST)
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @RequestMapping(value = "/users/login",method = RequestMethod.GET)
    public User login(@RequestParam String username,@RequestParam String password){
        return userService.login(username,password);
    }


}
