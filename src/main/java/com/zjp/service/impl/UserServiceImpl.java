package com.zjp.service.impl;

import com.zjp.mapper.UserMapper;
import com.zjp.model.pojo.User;
import com.zjp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by hanguoan on 2019/1/6.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User createUser(User user) {
        Date date = new Date();
        int result = userMapper.insert(user);
        return null;
    }

    @Override
    public User login(String username, String password) {
        User user0 = new User();
        user0.setUsername(username);
        User user = userMapper.selectOne(user0);
        if (user.getPassword().equals(password)){
            return user;
        }
        return null;
    }
}
