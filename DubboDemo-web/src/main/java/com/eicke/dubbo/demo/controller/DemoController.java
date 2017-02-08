package com.eicke.dubbo.demo.controller;

import com.eicke.dubbo.demo.domain.User;
import com.eicke.dubbo.demo.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
/**
 * Created by liujinyan on 2017/2/8.
 */
@RestController
@RequestMapping("/user")
public class DemoController {
    private static Logger logger = Logger.getLogger(DemoController.class);

    @Reference
    private UserService userService;

    /*
     *  http://localhost:9998/user/getUserById?id=1
     */

    @RequestMapping("/getUserById")
    public Object getUserById(@RequestParam("id")Integer id) {
        User user = userService.getById(id);
        if(user!=null){
            System.out.println("user.getName():"+user.getName());
            logger.info("user.getAge():"+user.getAge());
        }
        return user;
    }
}
