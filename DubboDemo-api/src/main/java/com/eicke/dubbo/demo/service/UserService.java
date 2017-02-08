package com.eicke.dubbo.demo.service;

import com.eicke.dubbo.demo.domain.User;

/**
 * Created by liujinyan on 2017/2/8.
 */
public interface UserService {
    User getById(Integer id);
}
