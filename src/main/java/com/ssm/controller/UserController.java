package com.ssm.controller;

import com.common.restful.Response;
import com.ssm.service.UserService;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ssm.model.User;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    /**
     　　* @Description: 根据userId查询单条用户记录
     　　* @author gebp
     　　* @date 2018/10/1 0:54
     　　*/
    @RequestMapping("/{id}")
    public Response getUserInJson(@PathVariable int id){
        User user = userService.getUserById(id);
        if (user != null){
            logger.info(user.toString());
        }
        return new Response().success(user);
    }

    //文件上传
   @RequestMapping("/upload")
    public String doUploadFile(@RequestParam("file")MultipartFile file) throws IOException {
        if (!file.isEmpty()) {
            logger.info("Process file:{}",file.getOriginalFilename());
        }
        FileUtils.copyInputStreamToFile(file.getInputStream(), new File("F:\\ssm-upload",System.currentTimeMillis()+file.getOriginalFilename()));
        return "success";
    }
}