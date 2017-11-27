package com.wangxiang.datacollectorserver.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HouseTradeModel {

    @Id
    private Long id;

    //土地基本状况
    private int useageActual;   //实际用途
    private int useagePlande;   //规划用途
    private int nearByLandType;     //周围土地类型

    //房屋情况
    private int floorNum;               //楼层数
    private String tradeLevel;          //买卖层次
    private int decorationType;         //装修标准
    private int lightAirType;           //采光通风状况
    private float houseStandardPrice;    //房屋标准造价
    private float totalArea;            //总占地面积
    private float houseResetTotalPrice;      //房屋重置总价
    private float subbuildingResetPrice;    //其它附属建筑物重置总价
    private float houseTodayValue;      //房屋现值
    private float subbuildingTodayValue;    //其它附属建筑物现值
    private int yearRobust;             //耐用年限
    private int yearUsed;               //已用年限

    //买卖情况
    private String tradeOut;            //转让人
    private String tradeIn;             //承让人
    private String tradeTime;           //买卖时间
    private String tradeMethod;         //买卖方式
    private String useageBeforeTrade;    //买卖前用途
    private String useageAfterTrade;    //买卖后用途
    private float tradeBuildingArea;    //出卖建筑面积
    private float buindingTradeSharedLandArea;  //出卖建筑分摊土地面积
    private float houseTradeTotalPrice;      //房屋交易总价
    private float houseTradeTax;             //房屋交易税费
    private float landTradeTotalPirce;         //土地交易总价
    private float landPricePerSquare;           //单位面积地价

    public int getUseageActual() {
        return useageActual;
    }

    public void setUseageActual(int useageActual) {
        this.useageActual = useageActual;
    }

    public int getUseagePlande() {
        return useagePlande;
    }

    public void setUseagePlande(int useagePlande) {
        this.useagePlande = useagePlande;
    }

    public int getNearByLandType() {
        return nearByLandType;
    }

    public void setNearByLandType(int nearByLandType) {
        this.nearByLandType = nearByLandType;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
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

    public float getHouseStandardPrice() {
        return houseStandardPrice;
    }

    public void setHouseStandardPrice(float houseStandardPrice) {
        this.houseStandardPrice = houseStandardPrice;
    }

    public float getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }

    public float getHouseResetTotalPrice() {
        return houseResetTotalPrice;
    }

    public void setHouseResetTotalPrice(float houseResetTotalPrice) {
        this.houseResetTotalPrice = houseResetTotalPrice;
    }

    public float getSubbuildingResetPrice() {
        return subbuildingResetPrice;
    }

    public void setSubbuildingResetPrice(float subbuildingResetPrice) {
        this.subbuildingResetPrice = subbuildingResetPrice;
    }

    public float getHouseTodayValue() {
        return houseTodayValue;
    }

    public void setHouseTodayValue(float houseTodayValue) {
        this.houseTodayValue = houseTodayValue;
    }

    public float getSubbuildingTodayValue() {
        return subbuildingTodayValue;
    }

    public void setSubbuildingTodayValue(float subbuildingTodayValue) {
        this.subbuildingTodayValue = subbuildingTodayValue;
    }

    public int getYearRobust() {
        return yearRobust;
    }

    public void setYearRobust(int yearRobust) {
        this.yearRobust = yearRobust;
    }

    public int getYearUsed() {
        return yearUsed;
    }

    public void setYearUsed(int yearUsed) {
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

    public float getTradeBuildingArea() {
        return tradeBuildingArea;
    }

    public void setTradeBuildingArea(float tradeBuildingArea) {
        this.tradeBuildingArea = tradeBuildingArea;
    }

    public float getBuindingTradeSharedLandArea() {
        return buindingTradeSharedLandArea;
    }

    public void setBuindingTradeSharedLandArea(float buindingTradeSharedLandArea) {
        this.buindingTradeSharedLandArea = buindingTradeSharedLandArea;
    }

    public float getHouseTradeTotalPrice() {
        return houseTradeTotalPrice;
    }

    public void setHouseTradeTotalPrice(float houseTradeTotalPrice) {
        this.houseTradeTotalPrice = houseTradeTotalPrice;
    }

    public float getHouseTradeTax() {
        return houseTradeTax;
    }

    public void setHouseTradeTax(float houseTradeTax) {
        this.houseTradeTax = houseTradeTax;
    }

    public float getLandTradeTotalPirce() {
        return landTradeTotalPirce;
    }

    public void setLandTradeTotalPirce(float landTradeTotalPirce) {
        this.landTradeTotalPirce = landTradeTotalPirce;
    }

    public float getLandPricePerSquare() {
        return landPricePerSquare;
    }

    public void setLandPricePerSquare(float landPricePerSquare) {
        this.landPricePerSquare = landPricePerSquare;
    }
}
