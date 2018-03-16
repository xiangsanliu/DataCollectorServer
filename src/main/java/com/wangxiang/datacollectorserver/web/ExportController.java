package com.wangxiang.datacollectorserver.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xiang
 * 用来导出数据的Controller
 */

@Controller
@RequestMapping("/export")
public class ExportController {

    /**
     * 导出商品房出售
     */
    @RequestMapping(value = "/commercial", method = RequestMethod.GET)
    public void exportCommercialHouseTrade() {

    }

    /**
     * 导出房屋出租
     */
    @RequestMapping(value = "/houserent", method = RequestMethod.GET)
    public void exportHouseRent() {

    }

    /**
     * 导出房屋买卖
     */
    @RequestMapping(value = "/housesell", method = RequestMethod.GET)
    public void exportHouseSell() {

    }

    /**
     * 导出商铺出租
     */
    @RequestMapping(value = "/shoprent", method = RequestMethod.GET)
    public void exportShopRent() {

    }

}
