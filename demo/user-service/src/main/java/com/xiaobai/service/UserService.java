package com.xiaobai.service;

import com.xiaobai.mapper.UserMapper;
import com.xiaobai.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 终于白发始于青丝
 * @create 2022-03-11 下午 23:33
 * @program demo
 * @Version 1.0
 * @ClassName UserService
 * @Description 类方法说明：$
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {
        return userMapper.findById(id);
    }
}
