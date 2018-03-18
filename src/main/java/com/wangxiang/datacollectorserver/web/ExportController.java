package com.wangxiang.datacollectorserver.web;

import com.wangxiang.datacollectorserver.utils.ExcelUtil;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;


/**
 * @author xiang
 *         用来导出数据的Controller
 */

@RestController
@RequestMapping("/export")
public class ExportController {


    private final ExcelUtil excelUtil;

    @Autowired
    public ExportController(ExcelUtil excelUtil) {
        this.excelUtil = excelUtil;
    }

    /**
     * 导出表格
     */
    @RequestMapping(value = "/download", method = RequestMethod.POST)
    public void export(String start, String end, String type,
                       HttpServletResponse response) throws FileNotFoundException {
        Date startTime, endTime;
        startTime = excelUtil.resolveDate(start);
        endTime = excelUtil.resolveDate(end);
        String filePath = null;
        switch (type) {
            case "商品房出售调查表":
                filePath = excelUtil.exportCommercial(startTime, endTime);
                break;
            case "房屋出租租金调查表":
                filePath = excelUtil.exportHouseRent(startTime, endTime);
                break;
            case "房屋买卖价格调查表":
                filePath = excelUtil.exportHouseTrade(startTime, endTime);
                break;
            case "柜台（商铺）出租租金调查表":
                filePath = excelUtil.exportShopRent(startTime, endTime);
                break;
            default:
                filePath = null;
        }
        if (filePath != null) {
            File file = new File(filePath);
            try {
                IOUtils.copy(new FileInputStream(file), response.getOutputStream());
                response.flushBuffer();
                file.delete();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            // nothing
        }
    }
}
