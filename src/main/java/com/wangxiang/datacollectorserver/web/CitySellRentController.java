package com.wangxiang.datacollectorserver.web;

import com.alibaba.fastjson.JSON;
import com.wangxiang.datacollectorserver.domain.dao.*;
import com.wangxiang.datacollectorserver.domain.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/citysellrent")
@RestController
public class CitySellRentController {

    private final
    CitySellRentRepository citySellRentRepository;

    private final
    CommercialHouseTradeRepository commercialHouseTradeRepository;

    private final
    HouseRentRepository houseRentRepository;

    private final
    HouseTradeRepository houseTradeRepository;

    private final
    ShopRentRepository shopRentRepository;

    @Autowired
    public CitySellRentController(CitySellRentRepository citySellRentRepository, CommercialHouseTradeRepository commercialHouseTradeRepository
            , HouseRentRepository houseRentRepository, HouseTradeRepository houseTradeRepository
            , ShopRentRepository shopRentRepository) {
        this.citySellRentRepository = citySellRentRepository;
        this.commercialHouseTradeRepository = commercialHouseTradeRepository;
        this.houseRentRepository = houseRentRepository;
        this.houseTradeRepository = houseTradeRepository;
        this.shopRentRepository = shopRentRepository;
    }

    @PostMapping("/get/citysellrents")
    public List<CitySellRent> getCitySellRents(Long userId) {
        return citySellRentRepository.findCitySellRentsByUserId(userId);
    }

    @PostMapping("/get/citysellrent")
    public CitySellRent getCitySellRent(Long id) {
        return citySellRentRepository.findCitySellRentById(id);
    }

    @PostMapping("/get/commercial")
    public CommercialHouseTradeModel getCommercialHouseTrade(Long id) {
        return commercialHouseTradeRepository.findCommercialHouseTradeModelById(id);
    }

    @PostMapping("/get/houserent")
    public HouseRentModel getHouseRent(Long id) {
        return houseRentRepository.findHouseRentModelById(id);
    }

    @PostMapping("/get/housetrade")
    public HouseTradeModel getHouseTrade(Long id) {
        return houseTradeRepository.findHouseTradeModelById(id);
    }

    @PostMapping("/get/shoprent")
    public ShopRentModel getShopRent(Long id) {
        return shopRentRepository.findShopRentModelById(id);
    }









    @PostMapping("/save/city")
    public void saveCitySellRent(String content) {
        System.out.println(content);
        citySellRentRepository.save(JSON.parseObject(content, CitySellRent.class));
    }

    @PostMapping("/save/commercial")
    public void saveCommercialHouseTrade(String content) {
        commercialHouseTradeRepository.save(JSON.parseObject(content, CommercialHouseTradeModel.class));
    }

    @PostMapping("/save/houserent")
    public void saveHouseRent(String content) {
        houseRentRepository.save(JSON.parseObject(content, HouseRentModel.class));
    }

    @PostMapping("/save/housetrade")
    public void saveHouseTrade(String content) {
        houseTradeRepository.save(JSON.parseObject(content, HouseTradeModel.class));
    }

    @PostMapping("/save/shoprent")
    public void saveShopRent(String content) {
        shopRentRepository.save(JSON.parseObject(content, ShopRentModel.class));
    }

    @PostMapping("/delete/city")
    public void deleteCitySellRent(Long id) {
        citySellRentRepository.delete(id);
        commercialHouseTradeRepository.delete(id);
        houseRentRepository.delete(id);
        shopRentRepository.delete(id);
        houseTradeRepository.delete(id);
    }

    @PostMapping("/test")
    public void test(String xiang) {
        System.out.println(xiang);
        System.out.println("xiangjianjian");
    }

    @PostMapping("/querytest")
    public CitySellRent testquery(String stringId) {
        System.out.println(stringId);
        Long id = Long.valueOf(stringId);
        CitySellRent citySellRent = citySellRentRepository.findCitySellRentById(id);
        System.out.println(JSON.toJSONString(citySellRent));
        return citySellRent;

    }


}
