package com.zjp.controller;

import com.zjp.model.pojo.User;
import com.zjp.service.UserService;
import io.swagger.annotations.ApiOperation;
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

    @ApiOperation(value = "创建用户")
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @ApiOperation(value = "登陆")
    @RequestMapping(value = "/users/login",method = RequestMethod.GET)
    public User login(@RequestParam String username,@RequestParam String password){
        return userService.login(username,password);
    }

    @ApiOperation(value = "修改用户信息")
    @RequestMapping(value = "/users",method = RequestMethod.PUT)
    public User update(@RequestBody User user){
        return userService.update(user);
    }

    @ApiOperation(value = "删除用户")
    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    public void update(@PathVariable(value = "id") String id){
        userService.deleteUser(id);
    }

    @ApiOperation(value = "获取所有用户")
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public List<User> getAll(){
        return userService.getAll();
    }

}
