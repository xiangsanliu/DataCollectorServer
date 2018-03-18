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
import java.sql.Date;
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
     * 导出商品房买卖
     */
    public void exportCommercial(Date startTime, Date endTime) {
        ArrayList<ArrayList<Object>> data = new ArrayList<>();
        data.add(getHeadLineForCommercial());
        writeExcel(data, "");
    }

    /**
     * 导出房屋出租
     */
    public void exportHouseRent(Date startTime, Date endTime) {
        ArrayList<ArrayList<Object>> data = new ArrayList<>();
        data.add(getHeadLineForHouseRent());
        writeExcel(data, "");
    }

    /**
     * 导出房屋买卖
     */
    public void exportHouseTrade(Date startTime, Date endTime) {
        ArrayList<ArrayList<Object>> data = new ArrayList<>();
        data.add(getHeadLineForHouseTrade());
        writeExcel(data, "");
    }

    /**
     * 导出商铺出租
     */
    public void exportShopRent(Date startTime, Date endTime) {
        ArrayList<ArrayList<Object>> data = new ArrayList<>();
        data.add(getHeadLineForShopRent());
        writeExcel(data, "");
    }

    /**
     * 根据传入的字符串解析成date
     * @param dateString 换入的字符串
     * @return 返回的Date格式数据
     */
    public Date resolveDate(String dateString) {
        if (dateString.length() != 10) {
            return new Date(0, 0, 0);
        } else {
            int year = Integer.valueOf(dateString.substring(0, 4));
            int month = Integer.valueOf(dateString.substring(5, 7));
            int date = Integer.valueOf(dateString.substring(8, 10));
            return new Date(year, month, date);
        }
    }

    /**
     * 设置商品房出售的第一行
     * @return 商品房的第一行
     */
    private ArrayList<Object> getHeadLineForCommercial() {
        ArrayList<Object> headLine = new ArrayList<>();
        headLine.add("宗地位置");
        headLine.add("土地四至");
        headLine.add("所临道路名称");
        headLine.add("交叉路口形式");
        headLine.add("宗地形状");
        headLine.add("宗地长度");
        headLine.add("宗地宽度");
        headLine.add("土地开发状况");
        headLine.add("建筑朝向");
        headLine.add("临街状况");
        headLine.add("至拐角距离");
        headLine.add("临街宽度");
        headLine.add("临街深度");
        headLine.add("建筑容积率");
        headLine.add("是否是畸零地");
        headLine.add("规划用途");
        headLine.add("实际用途");
        headLine.add("使用权取得时间");
        headLine.add("土地使用年限");
        headLine.add("房屋位置");
        headLine.add("楼层数");
        headLine.add("买卖层次");
        headLine.add("房屋结构");
        headLine.add("质量等级");
        headLine.add("建筑面积");
        headLine.add("房屋建筑面积");
        headLine.add("房屋标准造价");
        headLine.add("建筑工程造价");
        headLine.add("小区公共设施配套费");
        headLine.add("其它建房直接费用");
        headLine.add("管理费及利润");
        headLine.add("不可预见费");
        headLine.add("土地征收补偿费");
        headLine.add("代收费用");
        headLine.add("城市大配套费用");
        headLine.add("其他费用");
        headLine.add("商品房开发单位");
        headLine.add("买方");
        headLine.add("买卖方式");
        headLine.add("按揭年限");
        headLine.add("买卖层次");
        headLine.add("商品房出售时间");
        headLine.add("房屋用途");
        headLine.add("容积率");
        headLine.add("建筑密度");
        headLine.add("整栋商品楼总售价");
        headLine.add("整栋商品楼总造价");
        headLine.add("占用资金应付利息");
        headLine.add("开发公司利润");
        headLine.add("房屋交易总价");
        headLine.add("房屋交易税费");
        headLine.add("单位面积地价");
        headLine.add("分摊土地面积");
        headLine.add("详情说明");
        headLine.add("经度");
        headLine.add("维度");
        return headLine;
    }

    /**
     * 设置商铺出租的第一行
     * @return 商铺出租的第一行
     */
    private ArrayList<Object> getHeadLineForShopRent() {
        ArrayList<Object> headLine = new ArrayList<>();
        headLine.add("宗地位置");
        headLine.add("土地四至");
        headLine.add("所临道路名称");
        headLine.add("交叉路口形式");
        headLine.add("宗地形状");
        headLine.add("宗地长度");
        headLine.add("宗地宽度");
        headLine.add("土地开发状况");
        headLine.add("建筑朝向");
        headLine.add("临街状况");
        headLine.add("至拐角距离");
        headLine.add("临街宽度");
        headLine.add("临街深度");
        headLine.add("建筑容积率");
        headLine.add("是否是畸零地");
        headLine.add("周围土地利用类型");
        headLine.add("规划用途");
        headLine.add("实际用途");
        headLine.add("使用权取得时间");
        headLine.add("土地使用年限");
        headLine.add("柜台具体位置");
        headLine.add("装修标准");
        headLine.add("房屋结构");
        headLine.add("采光通风状况");
        headLine.add("建筑面积");
        headLine.add("房屋建筑面积");
        headLine.add("房屋标准造价");
        headLine.add("总占地面积");
        headLine.add("房屋重置总价");
        headLine.add("其他附属建筑物重置总价");
        headLine.add("房屋现值");
        headLine.add("其他附属建筑物现值");
        headLine.add("耐用年限");
        headLine.add("已使用年限");
        headLine.add("出租人");
        headLine.add("承租人");
        headLine.add("出租方式");
        headLine.add("出租时间");
        headLine.add("出租用途");
        headLine.add("出租期限");
        headLine.add("总营业面积");
        headLine.add("出租柜台营业面积");
        headLine.add("出租房地产总费用");
        headLine.add("其中维修费");
        headLine.add("折旧费");
        headLine.add("管理费");
        headLine.add("保险费");
        headLine.add("税费");
        headLine.add("其他费用");
        headLine.add("出租柜台分摊土地面积");
        headLine.add("出租柜台分摊总费");
        headLine.add("出租柜台年租金");
        headLine.add("露面地价");
        headLine.add("单位地价");
        headLine.add("详细说明");
        headLine.add("经度");
        headLine.add("维度");
        return headLine;
    }

    /**
     * 设置房屋买卖的第一行
     * @return 房屋买卖的第一行
     */
    private ArrayList<Object> getHeadLineForHouseTrade() {
        ArrayList<Object> headLine = new ArrayList<>();
        headLine.add("宗地位置");
        headLine.add("土地四至");
        headLine.add("所临道路名称");
        headLine.add("交叉路口形式");
        headLine.add("宗地形状");
        headLine.add("宗地长度");
        headLine.add("宗地宽度");
        headLine.add("土地开发状况");
        headLine.add("建筑朝向");
        headLine.add("临街状况");
        headLine.add("至拐角距离");
        headLine.add("临街宽度");
        headLine.add("临街深度");
        headLine.add("建筑容积率");
        headLine.add("是否是畸零地");
        headLine.add("周围土地类型");
        headLine.add("规划用途");
        headLine.add("实际用途");
        headLine.add("使用权取得时间");
        headLine.add("土地使用年限");
        headLine.add("房屋位置");
        headLine.add("楼层数");
        headLine.add("买卖层次");
        headLine.add("装修标准");
        headLine.add("房屋结构");
        headLine.add("质量等级");
        headLine.add("采光通风状况");
        headLine.add("建筑面积");
        headLine.add("房屋建筑面积");
        headLine.add("房屋标准造价");
        headLine.add("总占地面积");
        headLine.add("房屋重置总价");
        headLine.add("其他附属建筑物重置总价");
        headLine.add("房屋现值");
        headLine.add("其他附属建筑物现值");
        headLine.add("耐用年限");
        headLine.add("已使用年限");
        headLine.add("转让人");
        headLine.add("承让人");
        headLine.add("买卖时间");
        headLine.add("买卖方式");
        headLine.add("买卖前用途");
        headLine.add("买卖后用途");
        headLine.add("出卖建筑物面积");
        headLine.add("出卖建筑物分摊土地面积");
        headLine.add("房屋交易总价");
        headLine.add("房屋交易税费");
        headLine.add("土地交易总价");
        headLine.add("单位面积地价");
        headLine.add("详细说明");
        headLine.add("经度");
        headLine.add("维度");
        return headLine;
    }

    /**
     * 设置房屋出租的第一行
     * @return 房屋出租的第一行
     */
    private ArrayList<Object> getHeadLineForHouseRent() {
        ArrayList<Object> headLine = new ArrayList<>();
        headLine.add("宗地位置");
        headLine.add("土地四至");
        headLine.add("所临道路名称");
        headLine.add("临路口形式");
        headLine.add("宗地形状");
        headLine.add("宗地长度");
        headLine.add("宗地宽度");
        headLine.add("土地开发状况");
        headLine.add("建筑朝向");
        headLine.add("临街状况");
        headLine.add("至拐角距离");
        headLine.add("临街宽度");
        headLine.add("临街深度");
        headLine.add("建筑容积率");
        headLine.add("是否是畸零地");
        headLine.add("周围土地类型");
        headLine.add("使用权取得时间");
        headLine.add("土地使用年限");
        headLine.add("房屋位置");
        headLine.add("楼层数");
        headLine.add("出租层次");
        headLine.add("房屋结构");
        headLine.add("质量等级");
        headLine.add("采光通风状况");
        headLine.add("建筑面积");
        headLine.add("房屋建筑面积");
        headLine.add("房屋标准造价");
        headLine.add("总占地面积");
        headLine.add("房屋重置总价");
        headLine.add("房屋重置单价");
        headLine.add("房屋现值");
        headLine.add("其他附属建筑物现值");
        headLine.add("耐用年限");
        headLine.add("已使用年限");
        headLine.add("出租人");
        headLine.add("承租人");
        headLine.add("出租时间");
        headLine.add("出租方式");
        headLine.add("出租用途");
        headLine.add("出租期限");
        headLine.add("房屋正常总收益");
        headLine.add("房屋正常总费用");
        headLine.add("其中年租金");
        headLine.add("其中维修费");
        headLine.add("押金利息");
        headLine.add("折旧费");
        headLine.add("保险费");
        headLine.add("其他收益");
        headLine.add("管理费");
        headLine.add("税费");
        headLine.add("房地纯收益");
        headLine.add("土地正常价格");
        headLine.add("详情说明");
        headLine.add("经度");
        headLine.add("维度");
        return headLine;
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
