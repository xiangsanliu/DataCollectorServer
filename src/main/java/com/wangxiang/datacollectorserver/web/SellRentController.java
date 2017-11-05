package com.wangxiang.datacollectorserver.web;

import com.alibaba.fastjson.JSON;
import com.wangxiang.datacollectorserver.domain.dao.*;
import com.wangxiang.datacollectorserver.domain.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/get")
@RestController
public class SellRentController {

    @Autowired
    CommercialHouseRepository commercialHouseRepository;
    @Autowired
    HouseRentRepository houseRentRepository;
    @Autowired
    HouseTradeRepository houseTradeRepository;
    @Autowired
    ShopRentRepository shopRentRepository;
    @Autowired
    UserRepository userRepository;

    @GetMapping("/commercial")
    public List<CommercialHouseTradeModel> getCommercialHouseTradeByUserId(Long userId) {
        return commercialHouseRepository.findAllByUserId(userId);
    }

    @GetMapping("/houserent")
    public List<HouseRentModel> getHouseRent(Long userId) {
        return houseRentRepository.findAllByUserId(userId);
    }

    @GetMapping("/housetrade")
    public List<HouseTradeModel> getHouseTrade(Long userId) {
        return houseTradeRepository.findAllByUserId(userId);
    }

    @GetMapping("/shoprent")
    public List<ShopRentModel> getShopRent(Long userId) {
        return shopRentRepository.findAllByUserId(userId);
    }
}
