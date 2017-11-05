package com.wangxiang.datacollectorserver.web;

import com.alibaba.fastjson.JSON;
import com.wangxiang.datacollectorserver.domain.dao.*;
import com.wangxiang.datacollectorserver.domain.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/sellrent")
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
    private TradeInfo3Repository tradeInfo3Repository;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/save/sellrent")
    public void saveSellRent(String sellRentJson) {
        BaseSellRent baseSellRent = JSON.parseObject(sellRentJson, BaseSellRent.class);
        baseSellRent.changeId();
        sellRentRepository.save(baseSellRent);
    }

    @GetMapping("/save/rentinfo2")
    public void saveRentInfo2(String rentInfo2Json) {
        RentInfo2Model rentInfo2Model = JSON.parseObject(rentInfo2Json, RentInfo2Model.class);
        rentInfo2Model.changeId();
        rentInfo2Repository.save(rentInfo2Model);
    }

    @GetMapping("/save/rentinfo4")
    public void saveRentInfo4(String rentInfo4Json) {
        RentInfo4Model rentInfo4Model = JSON.parseObject(rentInfo4Json, RentInfo4Model.class);
        rentInfo4Model.changeId();
        rentInfo4Repository.save(rentInfo4Model);
    }

    @GetMapping("/save/tradeinfo1")
    public void saveTradeInfo1(String tradeInfo1Json) {
        TradeInfo1Model tradeInfo1Model = JSON.parseObject(tradeInfo1Json, TradeInfo1Model.class);
        tradeInfo1Model.changeId();
        tradeInfo1Repository.save(tradeInfo1Model);
    }

    @GetMapping("/save/tradeinfo3")
    public void saveTradeInfo3(String tradeInfo3Json) {
        TradeInfo3Model tradeInfo3Model = JSON.parseObject(tradeInfo3Json, TradeInfo3Model.class);
        tradeInfo3Model.changeId();
        tradeInfo3Repository.save(tradeInfo3Model);
    }

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
        userRepository.save(user);
        System.out.println(user.getId());
        System.out.println(user.getId());
        System.out.println(json);
        return user;
    }

}
