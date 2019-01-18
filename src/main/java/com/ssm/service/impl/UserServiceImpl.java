package com.ssm.service.impl;

import com.common.exception.BusiException;
import com.common.exception.HttpCode;
import com.ssm.dao.UserDao;
import com.ssm.model.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 　　* @Description: TODO
 * 　　* @author gebp
 * 　　* @date 2018/9/27 22:01
 *
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User getUserById(int userId){
        User user = userDao.selectByPrimaryKey(userId);
        if (user == null){
            throw new BusiException(HttpCode.BUSINESS_LOGIC_NOT_PASS.getCode(),HttpCode.BUSINESS_LOGIC_NOT_PASS.getMsg());
        }
        System.out.println("userName:"+ user.getUserName());
        return user;
    }
}
