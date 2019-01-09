package com.zjp.service;

import com.zjp.model.pojo.User;

/**
 * Created by hanguoan on 2019/1/6.
 */
public interface UserService {
    User createUser(User user);

    User login(String username, String password);
}
