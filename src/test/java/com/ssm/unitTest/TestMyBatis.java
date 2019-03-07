package com.ssm.unitTest;

import com.alibaba.fastjson.JSON;
import com.ssm.model.User;
import com.ssm.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.stream.Stream;

/**
 * 　　* @Description: TODO
 * 　　* @author gebp
 * 　　* @date 2018/9/28 22:38
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);

    @Autowired
    private UserService userService;

//    @Test
//    public void test1(){
//        User user = userService.getUserById(2);
//        logger.info(JSON.toJSONString(user));
//    }


    @Test
    public void testSorted(){
        //Stream.of(3,2,1,5,8,6).sorted().forEach(System.out::println);
        Stream.of(3,2,1,5,8,6).sorted(Integer::compareTo).forEach(System.out::println);
    }
}
