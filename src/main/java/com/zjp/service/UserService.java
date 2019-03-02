package com.zjp.service;

import com.zjp.model.pojo.User;

import java.util.List;

/**
 * Created by hanguoan on 2019/1/6.
 */
public interface UserService {
    User createUser(User user);

    User login(String username, String password);

    User update(User user);

    void deleteUser(String id);

    List<User> getAll();
}
