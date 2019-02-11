package com.zjp.controller;

import com.zjp.model.pojo.User;
import com.zjp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by hanguoan on 2019/1/6.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users/create",method = RequestMethod.POST)
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @RequestMapping(value = "/users/login",method = RequestMethod.GET)
    public User login(@RequestParam String username,@RequestParam String password){
        return userService.login(username,password);
    }

    @RequestMapping(value = "/users",method = RequestMethod.PUT)
    public User update(@RequestBody User user){
        return userService.update(user);
    }

    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    public void update(@PathVariable(value = "id") String id){
        userService.deleteUser(id);
    }

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public List<User> getAll(){
        return userService.getAll();
    }

}
