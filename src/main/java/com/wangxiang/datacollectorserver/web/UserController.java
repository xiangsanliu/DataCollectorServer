package com.wangxiang.datacollectorserver.web;


import com.alibaba.fastjson.JSON;
import com.wangxiang.datacollectorserver.domain.dao.UserRepository;
import com.wangxiang.datacollectorserver.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/get")
    public User getUser(Long id) {
        return userRepository.findUserById(id);
    }

    @PostMapping("/register")
    public String register(String content) {            //对user传进的user进行检查，返回错误（成功）信息
        userRepository.save(JSON.parseObject(content, User.class));
        return null;
    }

}
