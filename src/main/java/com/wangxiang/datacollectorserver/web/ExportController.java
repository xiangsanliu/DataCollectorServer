package com.wangxiang.datacollectorserver.web;

import com.wangxiang.datacollectorserver.utils.ExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;


/**
 * @author xiang
 * 用来导出数据的Controller
 */

@RestController
@RequestMapping("/export")
public class ExportController {


    private final ExcelUtils excelUtils;

    @Autowired
    public ExportController(ExcelUtils excelUtils) {
        this.excelUtils = excelUtils;
    }

    /**
     * 导出表格
     */
    @RequestMapping(value = "/download", method = RequestMethod.POST)
    public void export(String start, String end, String type) {
        Date startTime, endTime;
        startTime = new Date(2017, 8, 8);
        endTime = new Date(Date.parse(end));

        switch (type) {
            case "商品房出售调查表":
                excelUtils.exportCommercial(startTime, endTime);
                break;
            case "房屋出租租金调查表":
                excelUtils.exportHouseRent(startTime, endTime);
                break;
            case "房屋买卖价格调查表":
                excelUtils.exportHouseSell(startTime, endTime);
                break;
            case "柜台（商铺）出租租金调查表":
                excelUtils.exportShopRent(startTime, endTime);
                break;
            default:
        }
    }



}
