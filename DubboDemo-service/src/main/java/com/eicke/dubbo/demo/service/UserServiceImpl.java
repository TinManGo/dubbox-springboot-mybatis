package com.eicke.dubbo.demo.service;

import com.eicke.dubbo.demo.domain.User;
import com.eicke.dubbo.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liujinyan on 2017/2/8.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
