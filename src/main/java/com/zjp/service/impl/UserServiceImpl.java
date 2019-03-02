package com.zjp.service.impl;

import com.zjp.common.exception.DataException;
import com.zjp.mapper.UserMapper;
import com.zjp.model.pojo.User;
import com.zjp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by hanguoan on 2019/1/6.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User createUser(User user) {
        User user0 = new User();
        user0.setUsername(user.getUsername());
        User user1 = userMapper.selectOne(user0);
        if (user1!=null){
            throw new DataException("用户名重复", DataException.ExceptionName.Duplicate);
        }
        Date date = new Date();
        user.setCreateTime(date);
        int result = userMapper.insert(user);
        if (result!=0){
            return user;
        }
        return null;
    }

    @Override
    public User login(String username, String password) {
        User user0 = new User();
        user0.setUsername(username);
        User user = userMapper.selectOne(user0);
        if (user==null){
            throw new DataException("用户不存在", DataException.ExceptionName.Forbidden);
        }
        if (user.getPassword().equals(password)){
            return user;
        }
        throw new DataException("密码错误", DataException.ExceptionName.Forbidden);
    }

    @Override
    public User update(User user) {
        User oldUser = userMapper.selectByPrimaryKey(user.getId());
        if (oldUser!=null){
            int result = userMapper.updateByPrimaryKeySelective(user);
            if (result!=0){
                return userMapper.selectByPrimaryKey(user.getId());
            }
        }
        return null;
    }

    @Override
    public void deleteUser(String id) {
        int result = userMapper.deleteByPrimaryKey(id);
        if (result==0){
            throw new DataException("没有查到该用户", DataException.ExceptionName.InvalidParams);
        }
    }

    @Override
    public List<User> getAll() {
        return userMapper.selectAll();
    }
}
