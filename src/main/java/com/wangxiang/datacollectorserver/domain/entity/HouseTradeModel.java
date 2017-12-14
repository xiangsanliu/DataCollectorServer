package com.wangxiang.datacollectorserver.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HouseTradeModel{

    @Id
    private Long id;

    //土地基本状况
    private int useageActual;   //实际用途
    private int useagePlaned;   //规划用途
    private int nearByLandType;     //周围土地类型

    //房屋情况
    private String floorNum;               //楼层数
    private String tradeLevel;          //买卖层次
    private int decorationType;         //装修标准
    private int lightAirType;           //采光通风状况
    private String houseStandardPrice;    //房屋标准造价
    private String totalArea;            //总占地面积
    private String houseResetTotalPrice;      //房屋重置总价
    private String subbuildingResetPrice;    //其它附属建筑物重置总价
    private String houseTodayValue;      //房屋现值
    private String subbuildingTodayValue;    //其它附属建筑物现值
    private String yearRobust;             //耐用年限
    private String yearUsed;               //已用年限

    //买卖情况
    private String tradeOut;            //转让人
    private String tradeIn;             //承让人
    private String tradeTime;           //买卖时间
    private String tradeMethod;         //买卖方式
    private String useageBeforeTrade;    //买卖前用途
    private String useageAfterTrade;    //买卖后用途
    private String tradeBuildingArea;    //出卖建筑面积
    private String buildingTradeSharedLandArea;  //出卖建筑分摊土地面积
    private String houseTradeTotalPrice;      //房屋交易总价
    private String houseTradeTax;             //房屋交易税费
    private String landTradeTotalPirce;         //土地交易总价
    private String landPricePerSquare;           //单位面积地价

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getUseageActual() {
        return useageActual;
    }

    public void setUseageActual(int useageActual) {
        this.useageActual = useageActual;
    }

    public int getUseagePlaned() {
        return useagePlaned;
    }

    public void setUseagePlaned(int useagePlaned) {
        this.useagePlaned = useagePlaned;
    }

    public int getNearByLandType() {
        return nearByLandType;
    }

    public void setNearByLandType(int nearByLandType) {
        this.nearByLandType = nearByLandType;
    }

    public String getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(String floorNum) {
        this.floorNum = floorNum;
    }

    public String getTradeLevel() {
        return tradeLevel;
    }

    public void setTradeLevel(String tradeLevel) {
        this.tradeLevel = tradeLevel;
    }

    public int getDecorationType() {
        return decorationType;
    }

    public void setDecorationType(int decorationType) {
        this.decorationType = decorationType;
    }

    public int getLightAirType() {
        return lightAirType;
    }

    public void setLightAirType(int lightAirType) {
        this.lightAirType = lightAirType;
    }

    public String getHouseStandardPrice() {
        return houseStandardPrice;
    }

    public void setHouseStandardPrice(String houseStandardPrice) {
        this.houseStandardPrice = houseStandardPrice;
    }

    public String getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(String totalArea) {
        this.totalArea = totalArea;
    }

    public String getHouseResetTotalPrice() {
        return houseResetTotalPrice;
    }

    public void setHouseResetTotalPrice(String houseResetTotalPrice) {
        this.houseResetTotalPrice = houseResetTotalPrice;
    }

    public String getSubbuildingResetPrice() {
        return subbuildingResetPrice;
    }

    public void setSubbuildingResetPrice(String subbuildingResetPrice) {
        this.subbuildingResetPrice = subbuildingResetPrice;
    }

    public String getHouseTodayValue() {
        return houseTodayValue;
    }

    public void setHouseTodayValue(String houseTodayValue) {
        this.houseTodayValue = houseTodayValue;
    }

    public String getSubbuildingTodayValue() {
        return subbuildingTodayValue;
    }

    public void setSubbuildingTodayValue(String subbuildingTodayValue) {
        this.subbuildingTodayValue = subbuildingTodayValue;
    }

    public String getYearRobust() {
        return yearRobust;
    }

    public void setYearRobust(String yearRobust) {
        this.yearRobust = yearRobust;
    }

    public String getYearUsed() {
        return yearUsed;
    }

    public void setYearUsed(String yearUsed) {
        this.yearUsed = yearUsed;
    }

    public String getTradeOut() {
        return tradeOut;
    }

    public void setTradeOut(String tradeOut) {
        this.tradeOut = tradeOut;
    }

    public String getTradeIn() {
        return tradeIn;
    }

    public void setTradeIn(String tradeIn) {
        this.tradeIn = tradeIn;
    }

    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getTradeMethod() {
        return tradeMethod;
    }

    public void setTradeMethod(String tradeMethod) {
        this.tradeMethod = tradeMethod;
    }

    public String getUseageBeforeTrade() {
        return useageBeforeTrade;
    }

    public void setUseageBeforeTrade(String useageBeforeTrade) {
        this.useageBeforeTrade = useageBeforeTrade;
    }

    public String getUseageAfterTrade() {
        return useageAfterTrade;
    }

    public void setUseageAfterTrade(String useageAfterTrade) {
        this.useageAfterTrade = useageAfterTrade;
    }

    public String getTradeBuildingArea() {
        return tradeBuildingArea;
    }

    public void setTradeBuildingArea(String tradeBuildingArea) {
        this.tradeBuildingArea = tradeBuildingArea;
    }

    public String getBuildingTradeSharedLandArea() {
        return buildingTradeSharedLandArea;
    }

    public void setBuildingTradeSharedLandArea(String buildingTradeSharedLandArea) {
        this.buildingTradeSharedLandArea = buildingTradeSharedLandArea;
    }

    public String getHouseTradeTotalPrice() {
        return houseTradeTotalPrice;
    }

    public void setHouseTradeTotalPrice(String houseTradeTotalPrice) {
        this.houseTradeTotalPrice = houseTradeTotalPrice;
    }

    public String getHouseTradeTax() {
        return houseTradeTax;
    }

    public void setHouseTradeTax(String houseTradeTax) {
        this.houseTradeTax = houseTradeTax;
    }

    public String getLandTradeTotalPirce() {
        return landTradeTotalPirce;
    }

    public void setLandTradeTotalPirce(String landTradeTotalPirce) {
        this.landTradeTotalPirce = landTradeTotalPirce;
    }

    public String getLandPricePerSquare() {
        return landPricePerSquare;
    }

    public void setLandPricePerSquare(String landPricePerSquare) {
        this.landPricePerSquare = landPricePerSquare;
    }
}
