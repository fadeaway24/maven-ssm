package com.ssm.dao;

import com.ssm.model.User;
import org.springframework.stereotype.Repository;

/**
 * 　　* @Description: TODO
 * 　　* @author gebp
 * 　　* @date 2018/9/28 16:30
 *
 */
@Repository
public interface UserDao {
    User selectByPrimaryKey(int id);
}
