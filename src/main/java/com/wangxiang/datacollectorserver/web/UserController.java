package com.wangxiang.datacollectorserver.web;


import com.alibaba.fastjson.JSON;
import com.wangxiang.datacollectorserver.Constants;
import com.wangxiang.datacollectorserver.domain.dao.IMEIRepository;
import com.wangxiang.datacollectorserver.domain.dao.UserRepository;
import com.wangxiang.datacollectorserver.domain.entity.HttpResult;
import com.wangxiang.datacollectorserver.domain.entity.ImeiModel;
import com.wangxiang.datacollectorserver.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserRepository userRepository;

    private IMEIRepository imeiRepository;

    @Autowired
    public UserController(UserRepository userRepository, IMEIRepository imeiRepository) {
        this.userRepository = userRepository;
        this.imeiRepository = imeiRepository;
    }

    @RequestMapping("/login")
    public HttpResult<Void> login(@RequestParam("imei") String imei) {
        HttpResult<Void> result = new HttpResult<>();
        ImeiModel imeiModel = imeiRepository.findImeiModelByImei(imei);
        if (imeiModel == null) {
            result.setResultCode(Constants.USER_LOGIN_FAILED);
        } else {
            result.setResultCode(Constants.USER_LOGIN_SUCCESS);
        }
        return result;
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
