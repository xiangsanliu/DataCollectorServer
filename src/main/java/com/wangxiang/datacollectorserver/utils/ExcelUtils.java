package com.wangxiang.datacollectorserver.utils;

import com.wangxiang.datacollectorserver.domain.dao.*;
import com.wangxiang.datacollectorserver.domain.entity.CitySellRent;
import com.wangxiang.datacollectorserver.domain.entity.CommercialHouseTradeModel;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiang
 */

@Component
public class ExcelUtils {

    private final CitySellRentRepository citySellRentRepository;

    private final CommercialHouseTradeRepository commercialHouseTradeRepository;

    private final HouseRentRepository houseRentRepository;

    private final HouseTradeRepository houseTradeRepository;

    private final ShopRentRepository shopRentRepository;

    @Autowired
    public ExcelUtils(CitySellRentRepository citySellRentRepository, CommercialHouseTradeRepository commercialHouseTradeRepository, HouseRentRepository houseRentRepository, HouseTradeRepository houseTradeRepository, ShopRentRepository shopRentRepository) {
        this.citySellRentRepository = citySellRentRepository;
        this.commercialHouseTradeRepository = commercialHouseTradeRepository;
        this.houseRentRepository = houseRentRepository;
        this.houseTradeRepository = houseTradeRepository;
        this.shopRentRepository = shopRentRepository;
    }

    public void linkCommercialHouseTrade(List<CitySellRent> citySellRents) {
        List<CommercialHouseTradeModel> commercialHouseTradeModels = commercialHouseTradeRepository.findAll();

    }

    /**
     * 创建excel表格
     * @param data 导入表格的数据
     * @param path 表格存储路径
     */
    private void writeExcel(ArrayList<ArrayList<Object>> data, String path) {
        if (data == null) {
            return;
        }
        //创建工作表
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("sheet");
        //插入数据
        for (int i = 0; i < data.size(); i++) {
            HSSFRow row = sheet.createRow(i);
            if (data.get(i) != null) {
                for (int j = 0; j < data.get(i).size(); j++) {
                    HSSFCell cell = row.createCell(j);
                    cell.setCellValue(data.get(i).get(j).toString());
                }
            }
        }
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        //保存到文件
        try {
            wb.write(os);
            byte[] content = os.toByteArray();
            File file = new File(path);
            OutputStream fos = new FileOutputStream(file);
            fos.write(content);
            os.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
