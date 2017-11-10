package com.wangxiang.datacollectorserver.web;

import com.alibaba.fastjson.JSON;
import com.wangxiang.datacollectorserver.domain.dao.*;
import com.wangxiang.datacollectorserver.domain.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/sellrent")
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

    @GetMapping("/get/commercial")
    public List<CommercialHouseTradeModel> getCommercialHouseTradeByUserId(Long userId) {
        List<CommercialHouseTradeModel> commercialHouseTradeModels =
                commercialHouseRepository.findAllByUserId(userId);
        for (CommercialHouseTradeModel commercialHouseTradeModel: commercialHouseTradeModels) {
            commercialHouseTradeModel.changeId();
        }
        return commercialHouseTradeModels;
    }

    @GetMapping("/get/houserent")
    public List<HouseRentModel> getHouseRent(Long userId) {
        List<HouseRentModel>houseRentModels =  houseRentRepository.findAllByUserId(userId);
        for (HouseRentModel houseRentModel: houseRentModels) {
            houseRentModel.changeId();
        }
        return houseRentModels;
    }

    @GetMapping("/get/housetrade")
    public List<HouseTradeModel> getHouseTrade(Long userId) {
        List<HouseTradeModel> houseTradeModels =  houseTradeRepository.findAllByUserId(userId);
        for (HouseTradeModel houseTradeModel: houseTradeModels) {
            houseTradeModel.changeId();
        }
        return houseTradeModels;
    }

    @GetMapping("/get/shoprent")
    public List<ShopRentModel> getShopRent(Long userId) {
        return shopRentRepository.findAllByUserId(userId);
    }

    @GetMapping("/save/commercial")
    public void saveCommercialHouseTrade(String content) {
        CommercialHouseTradeModel commercialHouseTradeModel = JSON.parseObject(content, CommercialHouseTradeModel.class);
        commercialHouseTradeModel.changeId();
        commercialHouseRepository.save(commercialHouseTradeModel);
    }

    @GetMapping("/save/houserent")
    public void saveHouseRent(String content) {
        HouseRentModel houseRentModel = JSON.parseObject(content, HouseRentModel.class);
        houseRentModel.changeId();
        houseRentRepository.save(houseRentModel);
    }

    @GetMapping("/save/housetrade")
    public void saveHouseTrade(String content) {
        HouseTradeModel houseTradeModel = JSON.parseObject(content, HouseTradeModel.class);
        houseTradeModel.changeId();
        houseTradeRepository.save(houseTradeModel);
    }

    @GetMapping("/save/shoprent")
    public void saveShopRent(String content) {
        ShopRentModel shopRentModel = JSON.parseObject(content, ShopRentModel.class);
        shopRentModel.changeId();
        shopRentRepository.save(shopRentModel);
    }

}
