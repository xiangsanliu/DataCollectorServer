package com.wangxiang.datacollectorserver.web;

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

    @RequestMapping("/save")
    public String save() {
        SellRentModel sellRentModel = new SellRentModel();
        sellRentModel.setModelType(1);
        sellRentModel.setResearcher("项健健");
        TradeInfo1Model tradeInfo1Model = new TradeInfo1Model();
        tradeInfo1Model.setArea(111);
        tradeInfo1Model.setTradeIn("xiangjianjian");
        tradeInfo1Repository.save(tradeInfo1Model);
        sellRentModel.setTradeInfo1Model(tradeInfo1Model);
        sellRentRepository.save(sellRentModel);
        return "成功";
    }

    @RequestMapping("/query")
    public SellRentModel query() {
        List<SellRentModel> sellRentModels = sellRentRepository.findAllByResearcher("项健健");
        System.out.println("id: " + sellRentModels.get(0).getTradeInfo1Model().getId());
        System.out.println("name: " +sellRentModels.get(0).getResearcher());
        return sellRentModels.get(0);
    }

}
