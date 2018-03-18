package com.wangxiang.datacollectorserver.utils;

import com.wangxiang.datacollectorserver.domain.dao.*;
import com.wangxiang.datacollectorserver.domain.entity.*;
import com.wangxiang.datacollectorserver.share.Constants;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.font.ShapeGraphicAttribute;
import java.io.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiang
 */

@Component
public class ExcelUtil {

    private final CitySellRentRepository citySellRentRepository;

    private final CommercialHouseTradeRepository commercialHouseTradeRepository;

    private final HouseRentRepository houseRentRepository;

    private final HouseTradeRepository houseTradeRepository;

    private final ShopRentRepository shopRentRepository;

    @Autowired
    public ExcelUtil(CitySellRentRepository citySellRentRepository, CommercialHouseTradeRepository commercialHouseTradeRepository, HouseRentRepository houseRentRepository, HouseTradeRepository houseTradeRepository, ShopRentRepository shopRentRepository) {
        this.citySellRentRepository = citySellRentRepository;
        this.commercialHouseTradeRepository = commercialHouseTradeRepository;
        this.houseRentRepository = houseRentRepository;
        this.houseTradeRepository = houseTradeRepository;
        this.shopRentRepository = shopRentRepository;
    }

    /**
     * 导出商品房买卖
     */
    public void exportCommercial(Date startTime, Date endTime) {
        ArrayList<ArrayList<Object>> data = new ArrayList<>();
        data.add(getHeadLineForCommercial());
        List<CitySellRent> citySellRents = citySellRentRepository
                .findCitySellRentsByResearcherTimeBetweenAndModelType(startTime, endTime, Constants.COMMERCIAL_HOUSE_TRADE);
        for (CitySellRent citySellRent : citySellRents) {
            CommercialHouseTradeModel model = commercialHouseTradeRepository.findCommercialHouseTradeModelById(citySellRent.getId());
            ArrayList<Object> singleDate = new ArrayList<>();
            singleDate.add(citySellRent.getLandLoacation());
            singleDate.add(citySellRent.getLandRange());
            singleDate.add(citySellRent.getNearbyStreetName());
            singleDate.add(Constants.CROSS_LOAD_TYPE[citySellRent.getCrossRoadSituation()]);
            singleDate.add(Constants.LAND_SHAPE[citySellRent.getLandShape()]);
            singleDate.add(citySellRent.getLandLength());
            singleDate.add(citySellRent.getLandWidth());
            singleDate.add(Constants.LAND_DEVELOPING_SITUATION[citySellRent.getLandDevelopingSituation()]);
            singleDate.add(Constants.BUILDING_DIRECTION[citySellRent.getLandDevelopingSituation()]);
            singleDate.add(Constants.NEARBY_STREET_SITUATION[citySellRent.getNearbyStreetSituation()]);
            singleDate.add(citySellRent.getDistToCornor());
            singleDate.add(citySellRent.getWidthToStreet());
            singleDate.add(citySellRent.getDepthToStreet());
            singleDate.add(citySellRent.getBuildingPlotRate());
            singleDate.add(citySellRent.isGore() ? "是": "否");
            singleDate.add(Constants.USAGE[model.getUseagePlande()]);
            singleDate.add(Constants.USAGE[model.getUseageActual()]);
            singleDate.add(citySellRent.getAuthorizedTime());
            singleDate.add(citySellRent.getLandServiceableLife());
            singleDate.add(citySellRent.getHouseLocation());
            singleDate.add(model.getFloorNum());
            singleDate.add(model.getTradeLevel());
            singleDate.add(Constants.STRUCTURE_TYPE[citySellRent.getStructureType()]);
            singleDate.add(Constants.QUALITY_LEVEL[citySellRent.getQualityLevel()]);
            singleDate.add(citySellRent.getBuildingArea());
            singleDate.add(citySellRent.getHouseArea());
            singleDate.add(model.getHouseStandardPrice());
            singleDate.add(model.getBuildingProjectPrice());
            singleDate.add(model.getServiceFee());
            singleDate.add(model.getOtherDirectFee());
            singleDate.add(model.getManageFeeAndProfit());
            singleDate.add(model.getUnPredictedFee());
            singleDate.add(model.getLandCompensateFee());
            singleDate.add(model.getAgentFee());
            singleDate.add(model.getCityBigSuiteFee());
            singleDate.add(model.getOtherFee());
            singleDate.add(model.getDeveloper());
            singleDate.add(model.getTradeIn());
            singleDate.add(Constants.TRADE_TYPE[model.getTradeType()]);
            singleDate.add(model.getLoanYear());
            singleDate.add(model.getTradeLevel());
            singleDate.add(model.getTradeTime());
            singleDate.add(model.getUseage());
            singleDate.add(model.getPlotRatePlaned());
            singleDate.add(model.getBuildingDensity());
            singleDate.add(model.getWholeBuildingPrice());
            singleDate.add(model.getWholeBuildingFee());
            singleDate.add(model.getInterest());
            singleDate.add(model.getProfitOfDeveloper());
            singleDate.add(model.getPrice());
            singleDate.add(model.getTax());
            singleDate.add(model.getLandPricePerSquare());
            singleDate.add(model.getShareLandArea());
            singleDate.add(citySellRent.getDetail());
            singleDate.add(citySellRent.getLongitude());
            singleDate.add(citySellRent.getLatitude());
            data.add(singleDate);
        }
        writeExcel(data, "C:\\Users\\xiang\\OneDrive\\文档\\xiang.xls");
    }

    /**
     * 导出房屋出租
     */
    public void exportHouseRent(Date startTime, Date endTime) {
        ArrayList<ArrayList<Object>> data = new ArrayList<>();
        data.add(getHeadLineForHouseRent());
        List<CitySellRent> citySellRents = citySellRentRepository
                .findCitySellRentsByResearcherTimeBetweenAndModelType(startTime, endTime, Constants.HOUSE_RENT);
        for (CitySellRent citySellRent : citySellRents) {
            HouseRentModel model = houseRentRepository.findHouseRentModelById(citySellRent.getId());
            ArrayList<Object> singleDate = new ArrayList<>();
            singleDate.add(citySellRent.getLandLoacation());
            singleDate.add(citySellRent.getLandRange());
            singleDate.add(citySellRent.getNearbyStreetName());
            singleDate.add(Constants.CROSS_LOAD_TYPE[citySellRent.getCrossRoadSituation()]);
            singleDate.add(Constants.LAND_SHAPE[citySellRent.getLandShape()]);
            singleDate.add(citySellRent.getLandLength());
            singleDate.add(citySellRent.getLandWidth());
            singleDate.add(Constants.LAND_DEVELOPING_SITUATION[citySellRent.getLandDevelopingSituation()]);
            singleDate.add(Constants.BUILDING_DIRECTION[citySellRent.getLandDevelopingSituation()]);
            singleDate.add(Constants.NEARBY_STREET_SITUATION[citySellRent.getNearbyStreetSituation()]);
            singleDate.add(citySellRent.getDistToCornor());
            singleDate.add(citySellRent.getWidthToStreet());
            singleDate.add(citySellRent.getDepthToStreet());
            singleDate.add(citySellRent.getBuildingPlotRate());
            singleDate.add(citySellRent.isGore() ? "是": "否");
            singleDate.add(Constants.NEARBY_LAND_TYPE[model.getNearByLandType()]);
            singleDate.add(citySellRent.getAuthorizedTime());
            singleDate.add(citySellRent.getLandServiceableLife());
            singleDate.add(citySellRent.getHouseLocation());
            singleDate.add(model.getFloorNum());
            singleDate.add(model.getRentLevel());
            singleDate.add(Constants.STRUCTURE_TYPE[citySellRent.getStructureType()]);
            singleDate.add(Constants.QUALITY_LEVEL[citySellRent.getQualityLevel()]);
            singleDate.add(Constants.LIGHT_AIR_TYPE[model.getLightAirType()]);
            singleDate.add(citySellRent.getBuildingArea());
            singleDate.add(citySellRent.getHouseArea());
            singleDate.add(model.getHouseStandardPrice());
            singleDate.add(model.getTotalArea());
            singleDate.add(model.getHouseResetToalPrice());
            singleDate.add(model.getHouseResetPerPrice());
            singleDate.add(model.getHouseTodayValue());
            singleDate.add(model.getSubbuildingTodayValue());
            singleDate.add(model.getYearRobust());
            singleDate.add(model.getYearUsed());
            singleDate.add(model.getRentOut());
            singleDate.add(model.getRentIn());
            singleDate.add(model.getRentTime());
            singleDate.add(model.getRentMethod());
            singleDate.add("  ");
            singleDate.add("  ");
            singleDate.add(model.getHouseNormalProfit());
            singleDate.add(model.getHouseNormalTotalFee());
            singleDate.add(model.getPriceOfYear());
            singleDate.add(model.getFixFee());
            singleDate.add(model.getInterestOfDeposit());
            singleDate.add(model.getOldFee());
            singleDate.add(model.getInsuranceFee());
            singleDate.add(model.getOtherProfit());
            singleDate.add(model.getManageFree());
            singleDate.add(model.getTaxFee());
            singleDate.add(model.getHousePureProfit());
            singleDate.add(model.getLandNormalPrice());
            singleDate.add(citySellRent.getDetail());
            singleDate.add(citySellRent.getLongitude());
            singleDate.add(citySellRent.getLatitude());
            data.add(singleDate);
        }
        writeExcel(data, "");
    }

    /**
     * 导出房屋买卖
     */
    public void exportHouseTrade(Date startTime, Date endTime) {
        ArrayList<ArrayList<Object>> data = new ArrayList<>();
        data.add(getHeadLineForHouseTrade());
        List<CitySellRent> citySellRents = citySellRentRepository
                .findCitySellRentsByResearcherTimeBetweenAndModelType(startTime, endTime, Constants.HOUSE_SELL);
        for (CitySellRent citySellRent : citySellRents) {
            HouseTradeModel model = houseTradeRepository.findHouseTradeModelById(citySellRent.getId());
            ArrayList<Object> singleDate = new ArrayList<>();
            singleDate.add(citySellRent.getLandLoacation());
            singleDate.add(citySellRent.getLandRange());
            singleDate.add(citySellRent.getNearbyStreetName());
            singleDate.add(Constants.CROSS_LOAD_TYPE[citySellRent.getCrossRoadSituation()]);
            singleDate.add(Constants.LAND_SHAPE[citySellRent.getLandShape()]);
            singleDate.add(citySellRent.getLandLength());
            singleDate.add(citySellRent.getLandWidth());
            singleDate.add(Constants.LAND_DEVELOPING_SITUATION[citySellRent.getLandDevelopingSituation()]);
            singleDate.add(Constants.BUILDING_DIRECTION[citySellRent.getLandDevelopingSituation()]);
            singleDate.add(Constants.NEARBY_STREET_SITUATION[citySellRent.getNearbyStreetSituation()]);
            singleDate.add(citySellRent.getDistToCornor());
            singleDate.add(citySellRent.getWidthToStreet());
            singleDate.add(citySellRent.getDepthToStreet());
            singleDate.add(citySellRent.getBuildingPlotRate());
            singleDate.add(citySellRent.isGore() ? "是": "否");
            singleDate.add(Constants.NEARBY_LAND_TYPE[model.getNearByLandType()]);
            singleDate.add(Constants.USAGE[model.getUseagePlaned()]);
            singleDate.add(Constants.USAGE[model.getUseageActual()]);
            singleDate.add(citySellRent.getAuthorizedTime());
            singleDate.add(citySellRent.getLandServiceableLife());
            singleDate.add(citySellRent.getHouseLocation());
            singleDate.add(model.getFloorNum());
            singleDate.add(model.getTradeLevel());
            singleDate.add(Constants.STRUCTURE_TYPE[citySellRent.getStructureType()]);
            singleDate.add(Constants.DECORATION_TYPE[model.getDecorationType()]);
            singleDate.add(Constants.QUALITY_LEVEL[citySellRent.getQualityLevel()]);
            singleDate.add(Constants.LIGHT_AIR_TYPE[model.getLightAirType()]);
            singleDate.add(citySellRent.getBuildingArea());
            singleDate.add(citySellRent.getHouseArea());
            singleDate.add(model.getHouseStandardPrice());
            singleDate.add(model.getTotalArea());
            singleDate.add(model.getHouseResetTotalPrice());
            singleDate.add(model.getSubbuildingResetPrice());
            singleDate.add(model.getHouseTodayValue());
            singleDate.add(model.getSubbuildingTodayValue());
            singleDate.add(model.getYearRobust());
            singleDate.add(model.getYearUsed());
            singleDate.add(model.getTradeOut());
            singleDate.add(model.getTradeIn());
            singleDate.add(model.getTradeTime());
            singleDate.add(model.getTradeMethod());
            singleDate.add(model.getUseageBeforeTrade());
            singleDate.add(model.getUseageAfterTrade());
            singleDate.add(model.getTradeBuildingArea());
            singleDate.add(model.getBuildingTradeSharedLandArea());
            singleDate.add(model.getHouseTradeTotalPrice());
            singleDate.add(model.getHouseTradeTax());
            singleDate.add(model.getLandTradeTotalPirce());
            singleDate.add(model.getLandPricePerSquare());
            singleDate.add(citySellRent.getDetail());
            singleDate.add(citySellRent.getLongitude());
            singleDate.add(citySellRent.getLatitude());
            data.add(singleDate);
        }
        writeExcel(data, "");
    }

    /**
     * 导出商铺出租
     */
    public void exportShopRent(Date startTime, Date endTime) {
        ArrayList<ArrayList<Object>> data = new ArrayList<>();
        data.add(getHeadLineForShopRent());
        List<CitySellRent> citySellRents = citySellRentRepository
                .findCitySellRentsByResearcherTimeBetweenAndModelType(startTime, endTime, Constants.SHOP_RENT);
        for (CitySellRent citySellRent : citySellRents) {
            ShopRentModel model = shopRentRepository.findShopRentModelById(citySellRent.getId());
            ArrayList<Object> singleDate = new ArrayList<>();
            singleDate.add(citySellRent.getLandLoacation());
            singleDate.add(citySellRent.getLandRange());
            singleDate.add(citySellRent.getNearbyStreetName());
            singleDate.add(Constants.CROSS_LOAD_TYPE[citySellRent.getCrossRoadSituation()]);
            singleDate.add(Constants.LAND_SHAPE[citySellRent.getLandShape()]);
            singleDate.add(citySellRent.getLandLength());
            singleDate.add(citySellRent.getLandWidth());
            singleDate.add(Constants.LAND_DEVELOPING_SITUATION[citySellRent.getLandDevelopingSituation()]);
            singleDate.add(Constants.BUILDING_DIRECTION[citySellRent.getLandDevelopingSituation()]);
            singleDate.add(Constants.NEARBY_STREET_SITUATION[citySellRent.getNearbyStreetSituation()]);
            singleDate.add(citySellRent.getDistToCornor());
            singleDate.add(citySellRent.getWidthToStreet());
            singleDate.add(citySellRent.getDepthToStreet());
            singleDate.add(citySellRent.getBuildingPlotRate());
            singleDate.add(citySellRent.isGore() ? "是": "否");
            singleDate.add(Constants.NEARBY_LAND_TYPE[model.getNearByLandType()]);
            singleDate.add(Constants.USAGE[model.getUseagePlaned()]);
            singleDate.add(Constants.USAGE[model.getUseageActual()]);
            singleDate.add(citySellRent.getAuthorizedTime());
            singleDate.add(citySellRent.getLandServiceableLife());
            singleDate.add(citySellRent.getHouseLocation());
            singleDate.add(Constants.DECORATION_TYPE[model.getDecorationType()]);
            singleDate.add(Constants.STRUCTURE_TYPE[citySellRent.getStructureType()]);
            singleDate.add(Constants.QUALITY_LEVEL[citySellRent.getQualityLevel()]);
            singleDate.add(Constants.LIGHT_AIR_TYPE[model.getLightAirType()]);
            singleDate.add(citySellRent.getBuildingArea());
            singleDate.add(citySellRent.getHouseArea());
            singleDate.add(model.getHouseStandardPrice());
            singleDate.add(model.getTotalArea());
            singleDate.add(model.getHouseResetTotalPrice());
            singleDate.add(model.getSubbuildingResetPrice());
            singleDate.add(model.getHouseTodayValue());
            singleDate.add(model.getSubbuildingTodayValue());
            singleDate.add(model.getYearRobust());
            singleDate.add(model.getYearUsed());
            singleDate.add(model.getRentOut());
            singleDate.add(model.getRentIn());
            singleDate.add(model.getRentMethod());
            singleDate.add(model.getRentTime());
            singleDate.add(model.getUseage());
            singleDate.add(model.getRentDeadline());
            singleDate.add(model.getTotalTrdeArea());
            singleDate.add(model.getCounterTradeArea());
            singleDate.add(model.getTotalRentPrice());
            singleDate.add(model.getFixFee());
            singleDate.add(model.getOldFee());
            singleDate.add(model.getManageFree());
            singleDate.add(model.getInsuranceFee());
            singleDate.add(model.getTaxFee());
            singleDate.add(model.getOtherFee());
            singleDate.add(model.getCounterSharedLandArea());
            singleDate.add(model.getCounterSharedLandFee());
            singleDate.add(model.getCounterFeeOfYear());
            singleDate.add(model.getBuildinglandPrice());
            singleDate.add(model.getPricePer());
            singleDate.add(citySellRent.getDetail());
            singleDate.add(citySellRent.getLongitude());
            singleDate.add(citySellRent.getLatitude());
            data.add(singleDate);
        }
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
            return new Date(year-1900, month-1, date);
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
        headLine.add("房屋结构");
        headLine.add("装修标准");
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
        headLine.add("楼面地价");
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
                    if (data.get(i).get(j)!=null) {
                        cell.setCellValue(data.get(i).get(j).toString());
                    }
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
