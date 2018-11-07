/**
 * Project Name: dubbo_demo
 * File Name: UserController.java
 * Package Name: com.tgd.dubbo.controller
 * Date: 2018/11/6 17:47
 */
package com.tgd.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tgd.dubbo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author:滕国栋
 * @Date:2018/11/6
 */
@RestController
public class UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("/hello/")
    public String sayHello() {
        return userService.sayHello();
    }
}
