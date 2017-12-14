package com.wangxiang.datacollectorserver.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ShopRentModel{

    @Id
    private Long id;

    private int useageActual;   //实际用途
    private int useagePlaned;   //规划用途

    private int nearByLandType;     //周围土地类型

    //房屋情况
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

    //出租情况
    private String rentOut;         //出租人
    private String rentIn;          //承租人
    private String rentTime;        //出租时间
    private String rentMethod;      //出租方式
    private String useage;          //出租用途
    private String rentDeadline;    //出租期限
    private String totalTrdeArea;    //总营业面积
    private String counterTradeArea; //出租柜台营业面积
    private String totalRentPrice;      //出租房地产总费用
    private String fixFee;           //其中维修费
    private String oldFee;               //折旧费
    private String insuranceFee;         //保险费
    private String manageFree;           //管理费
    private String taxFee;               //税费
    private String otherFee;             //其它费用
    private String counterSharedLandArea;    //出租柜台分摊土地面积
    private String counterSharedLandFee;    //出租柜台分摊总费
    private String counterFeeOfYear;         //出租柜台年租金
    private String buildinglandPrice;        //楼面地价
    private String pricePer;                 //单位地价

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

    public String getRentOut() {
        return rentOut;
    }

    public void setRentOut(String rentOut) {
        this.rentOut = rentOut;
    }

    public String getRentIn() {
        return rentIn;
    }

    public void setRentIn(String rentIn) {
        this.rentIn = rentIn;
    }

    public String getRentTime() {
        return rentTime;
    }

    public void setRentTime(String rentTime) {
        this.rentTime = rentTime;
    }

    public String getRentMethod() {
        return rentMethod;
    }

    public void setRentMethod(String rentMethod) {
        this.rentMethod = rentMethod;
    }

    public String getUseage() {
        return useage;
    }

    public void setUseage(String useage) {
        this.useage = useage;
    }

    public String getRentDeadline() {
        return rentDeadline;
    }

    public void setRentDeadline(String rentDeadline) {
        this.rentDeadline = rentDeadline;
    }

    public String getTotalTrdeArea() {
        return totalTrdeArea;
    }

    public void setTotalTrdeArea(String totalTrdeArea) {
        this.totalTrdeArea = totalTrdeArea;
    }

    public String getCounterTradeArea() {
        return counterTradeArea;
    }

    public void setCounterTradeArea(String counterTradeArea) {
        this.counterTradeArea = counterTradeArea;
    }

    public String getTotalRentPrice() {
        return totalRentPrice;
    }

    public void setTotalRentPrice(String totalRentPrice) {
        this.totalRentPrice = totalRentPrice;
    }

    public String getFixFee() {
        return fixFee;
    }

    public void setFixFee(String fixFee) {
        this.fixFee = fixFee;
    }

    public String getOldFee() {
        return oldFee;
    }

    public void setOldFee(String oldFee) {
        this.oldFee = oldFee;
    }

    public String getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(String insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    public String getManageFree() {
        return manageFree;
    }

    public void setManageFree(String manageFree) {
        this.manageFree = manageFree;
    }

    public String getTaxFee() {
        return taxFee;
    }

    public void setTaxFee(String taxFee) {
        this.taxFee = taxFee;
    }

    public String getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(String otherFee) {
        this.otherFee = otherFee;
    }

    public String getCounterSharedLandArea() {
        return counterSharedLandArea;
    }

    public void setCounterSharedLandArea(String counterSharedLandArea) {
        this.counterSharedLandArea = counterSharedLandArea;
    }

    public String getCounterSharedLandFee() {
        return counterSharedLandFee;
    }

    public void setCounterSharedLandFee(String counterSharedLandFee) {
        this.counterSharedLandFee = counterSharedLandFee;
    }

    public String getCounterFeeOfYear() {
        return counterFeeOfYear;
    }

    public void setCounterFeeOfYear(String counterFeeOfYear) {
        this.counterFeeOfYear = counterFeeOfYear;
    }

    public String getBuildinglandPrice() {
        return buildinglandPrice;
    }

    public void setBuildinglandPrice(String buildinglandPrice) {
        this.buildinglandPrice = buildinglandPrice;
    }

    public String getPricePer() {
        return pricePer;
    }

    public void setPricePer(String pricePer) {
        this.pricePer = pricePer;
    }
}
