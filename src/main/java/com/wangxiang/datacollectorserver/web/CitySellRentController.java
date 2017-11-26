package com.wangxiang.datacollectorserver.web;

import com.alibaba.fastjson.JSON;
import com.wangxiang.datacollectorserver.domain.dao.*;
import com.wangxiang.datacollectorserver.domain.entity.CommercialHouseTradeModel;
import com.wangxiang.datacollectorserver.domain.entity.HouseRentModel;
import com.wangxiang.datacollectorserver.domain.entity.HouseTradeModel;
import com.wangxiang.datacollectorserver.domain.entity.ShopRentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/citysellrent")
@RestController
public class CitySellRentController {

    private final
    CommercialHouseRepository commercialHouseRepository;

    private final
    HouseRentRepository houseRentRepository;

    private final
    HouseTradeRepository houseTradeRepository;

    private final
    ShopRentRepository shopRentRepository;

    @Autowired
    public CitySellRentController(CommercialHouseRepository commercialHouseRepository
            , HouseRentRepository houseRentRepository, HouseTradeRepository houseTradeRepository
            , ShopRentRepository shopRentRepository) {
        this.commercialHouseRepository = commercialHouseRepository;
        this.houseRentRepository = houseRentRepository;
        this.houseTradeRepository = houseTradeRepository;
        this.shopRentRepository = shopRentRepository;
    }

    @PostMapping("/get/commercial")
    public List<CommercialHouseTradeModel> getCommercialHouseTrade(Long userId) {
        return commercialHouseRepository.findCommercialHouseTradeModelsByUserId(userId);
    }

    @PostMapping("/get/houserent")
    public List<HouseRentModel> getHouseRent(Long userId) {
        return houseRentRepository.findHouseRentModelsByUserId(userId);
    }

    @PostMapping("/get/housetrade")
    public List<HouseTradeModel> getHouseTrade(Long userId) {
        return houseTradeRepository.findHouseTradeModelsByUserId(userId);
    }

    @PostMapping("/get/shoprent")
    public List<ShopRentModel> getShopRent(Long userId) {
        return shopRentRepository.findShopRentModelsByUserId(userId);
    }

    @PostMapping("/save/commercial")
    public void saveCommercialHouseTrade(String content) {
        CommercialHouseTradeModel commercialHouseTradeModel = JSON.parseObject(content, CommercialHouseTradeModel.class);
        commercialHouseRepository.save(commercialHouseTradeModel);
    }

    @PostMapping("/save/houserent")
    public void saveHouseRent(String content) {
        HouseRentModel houseRentModel = JSON.parseObject(content, HouseRentModel.class);
        houseRentRepository.save(houseRentModel);
    }

    @PostMapping("/save/housetrade")
    public void saveHouseTrade(String content) {
        HouseTradeModel houseTradeModel = JSON.parseObject(content, HouseTradeModel.class);
        houseTradeRepository.save(houseTradeModel);
    }

    @PostMapping("/save/shoprent")
    public void saveShopRent(String content) {
        ShopRentModel shopRentModel = JSON.parseObject(content, ShopRentModel.class);
        shopRentRepository.save(shopRentModel);
    }

    @PostMapping("/delete/commercicl")
    public void deleteCommercicl(Long id) {
        commercialHouseRepository.delete(id);
    }

    @PostMapping("/delete/houserent")
    public void deleteHouserent(Long id) {
        houseRentRepository.delete(id);
    }

    @PostMapping("/delete/housetrade")
    public void deleteHousetrade(Long id) {
        houseTradeRepository.delete(id);
    }

    @PostMapping("/delete/shoprent")
    public void deleteShoprent(Long id) {
        shopRentRepository.delete(id);
    }
    
    @PostMapping("/test")
    public void test(String xiang) {
        System.out.println(xiang);
        System.out.println("xiangjianjian");
    }


}
