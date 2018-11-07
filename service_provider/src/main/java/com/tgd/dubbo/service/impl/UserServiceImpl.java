/**
 * Project Name: dubbo_demo
 * File Name: UserServiceImpl.java
 * Package Name: com.tgd.dubbo.service.impl
 * Date: 2018/11/6 17:45
 */
package com.tgd.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tgd.dubbo.service.UserService;

/**
 * @Description:
 * @Author:滕国栋
 * @Date:2018/11/6
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello() {
        return "Hello World!";
    }
}
