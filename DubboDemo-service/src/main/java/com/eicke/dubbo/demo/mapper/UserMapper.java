package com.eicke.dubbo.demo.mapper;

import com.eicke.dubbo.demo.domain.User;

/**
 * Created by liujinyan on 2017/2/8.
 */
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
