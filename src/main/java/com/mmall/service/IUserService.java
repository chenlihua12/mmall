package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: xu gang feng
 * @create: 2019-12-09 22:36
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str,String type);
}
