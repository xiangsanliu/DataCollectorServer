package com.wangxiang.datacollectorserver.web;

import com.alibaba.fastjson.JSON;
import com.wangxiang.datacollectorserver.domain.dao.*;
import com.wangxiang.datacollectorserver.domain.entity.RentInfo2Model;
import com.wangxiang.datacollectorserver.domain.entity.SellRentModel;
import com.wangxiang.datacollectorserver.domain.entity.TradeInfo1Model;
import com.wangxiang.datacollectorserver.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SellRentController {

    @Autowired
    private SellRentRepository sellRentRepository;
    @Autowired
    private RentInfo2Repository rentInfo2Repository;
    @Autowired
    private RentInfo4Repository rentInfo4Repository;
    @Autowired
    private TradeInfo1Repository tradeInfo1Repository;
    @Autowired
    private TradeInfo3Repositorty tradeInfo3Repositorty;
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/save")
    public User save(String name, String email) {
        User user = new User();
        user.setEmail(email);
        user.setName(name);
        userRepository.save(user);
        return user;
    }

    @RequestMapping("/query")
    public User query() {
        return userRepository.findById(1);
    }

    @RequestMapping("/get/user")
    public User getUser(String json) {
        User user = JSON.parseObject(json, User.class);
        System.out.println(json);
        System.out.println(user.getEmail());
        System.out.println(user.getName());
        return user;
    }

}
