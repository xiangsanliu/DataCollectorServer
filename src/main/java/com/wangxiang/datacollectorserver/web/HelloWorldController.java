package com.wangxiang.datacollectorserver.web;

import com.wangxiang.datacollectorserver.domain.User;
import com.wangxiang.datacollectorserver.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private UserRepository repository;

    @RequestMapping("/xiang")
    public User test() {
        User user = new User();
        user.setName("xiang");
        user.setEmail("xiangjianjian");
        repository.save(user);
        return user;
    }
}
