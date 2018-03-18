package com.wangxiang.datacollectorserver.web;

import com.alibaba.fastjson.JSON;
import com.wangxiang.datacollectorserver.domain.dao.*;
import com.wangxiang.datacollectorserver.domain.entity.*;
import com.wangxiang.datacollectorserver.share.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/city")
@RestController
public class CitySellRentController {

    private final CitySellRentRepository citySellRentRepository;

    private final CommercialHouseTradeRepository commercialHouseTradeRepository;

    private final HouseRentRepository houseRentRepository;

    private final HouseTradeRepository houseTradeRepository;

    private final ShopRentRepository shopRentRepository;

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

    /**
     * @param userId    用户的IMEI码
     * @param modelType 　数据类型
     * @param index     从第几条数据开始请求
     * @param count     请求多少条数据
     * @return 用户应当收到的数据
     * <p>
     * 注意，数据的顺序应该按照时间顺序排序，最新的数据排在最前面，客户请求的数据都是最新的数据
     */
    @RequestMapping("/get/citysellrents")
    public List<CitySellRent> getCitySellRents(@RequestParam("userId") Long userId,
                                               @RequestParam("modelType") int modelType,
                                               @RequestParam("index") int index,
                                               @RequestParam("count") int count) {
//        Order order = new Order(Sort.Direction.DESC, "researcherTime");
//        PageRequest pageRequest = new PageRequest(index, count, new Sort(order));
//        Page<CitySellRent> citySellRentPage = citySellRentRepository.findCitySellRentsPageable(pageRequest);
//        return citySellRentPage.getContent();
//        return citySellRentRepository.findCitySellRentsByUserIdAndModelType(userId, modelType);
        return citySellRentRepository.findAll();
    }

    @RequestMapping("/get/citysellrent")
    public CitySellRent getCitySellRent(Long id) {
        return citySellRentRepository.findCitySellRentById(id);
    }

    @RequestMapping("/get/commercial")
    public CommercialHouseTradeModel getCommercialHouseTrade(Long id) {
        return commercialHouseTradeRepository.findCommercialHouseTradeModelById(id);
    }

    @RequestMapping("/get/houserent")
    public HouseRentModel getHouseRent(Long id) {
        return houseRentRepository.findHouseRentModelById(id);
    }

    @RequestMapping("/get/housetrade")
    public HouseTradeModel getHouseTrade(Long id) {
        return houseTradeRepository.findHouseTradeModelById(id);
    }

    @RequestMapping("/get/shoprent")
    public ShopRentModel getShopRent(Long id) {
        return shopRentRepository.findShopRentModelById(id);
    }


    @RequestMapping("/save/city")
    public void saveCitySellRent(String content) {
        CitySellRent citySellRent = JSON.parseObject(content, CitySellRent.class);
        if (citySellRentRepository.exists(citySellRent.getId())) {
            citySellRentRepository.delete(citySellRent.getId());
        }
        citySellRentRepository.save(citySellRent);
    }

    @RequestMapping("/save/commercial")
    public void saveCommercialHouseTrade(String content) {
        CommercialHouseTradeModel commercialHouseTradeModel = JSON.parseObject(content, CommercialHouseTradeModel.class);
        if (commercialHouseTradeRepository.exists(commercialHouseTradeModel.getId())) {
            commercialHouseTradeRepository.delete(commercialHouseTradeModel.getId());
        }
        commercialHouseTradeRepository.save(commercialHouseTradeModel);

    }

    @RequestMapping("/save/houserent")
    public void saveHouseRent(String content) {
        HouseRentModel model = JSON.parseObject(content, HouseRentModel.class);
        if (houseRentRepository.exists(model.getId())) {
            houseRentRepository.delete(model.getId());
        }
        houseRentRepository.save(model);
    }

    @RequestMapping("/save/housetrade")
    public void saveHouseTrade(String content) {
        HouseTradeModel model = JSON.parseObject(content, HouseTradeModel.class);
        if (houseTradeRepository.exists(model.getId())) {
            houseTradeRepository.delete(model.getId());
        }
        houseTradeRepository.save(model);
    }

    @RequestMapping("/save/shoprent")
    public void saveShopRent(String content) {
        ShopRentModel model = JSON.parseObject(content, ShopRentModel.class);
        if (shopRentRepository.exists(model.getId())) {
            shopRentRepository.delete(model.getId());
        }
        shopRentRepository.save(model);
    }


    @RequestMapping("/delete/city")
    public void deleteCitySellRent(Long id) {
        if (citySellRentRepository.exists(id)) {
            CitySellRent citySellRent = citySellRentRepository.findCitySellRentById(id);
            switch (citySellRent.getModelType()) {
                case Constants.COMMERCIAL_HOUSE_TRADE:
                    commercialHouseTradeRepository.delete(id);
                    break;
                case Constants.SHOP_RENT:
                    shopRentRepository.delete(id);
                    break;
                case Constants.HOUSE_SELL:
                    houseTradeRepository.delete(id);
                    break;
                case Constants.HOUSE_RENT:
                    houseRentRepository.delete(id);
                    break;
            }
            citySellRentRepository.delete(id);
        }
    }

    @RequestMapping("/test")
    public void test(String xiang) {
        System.out.println(xiang);
        System.out.println("xiangjianjian");
    }

    @RequestMapping("/querytest")
    public CitySellRent testquery(String stringId) {
        System.out.println(stringId);
        Long id = Long.valueOf(stringId);
        CitySellRent citySellRent = citySellRentRepository.findCitySellRentById(id);
        System.out.println(JSON.toJSONString(citySellRent));
        return citySellRent;

    }


}
