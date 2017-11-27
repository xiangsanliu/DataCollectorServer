package com.wangxiang.datacollectorserver.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ShopRentModel{

    @Id
    private Long id;

    private int useageActual;   //实际用途
    private int useagePlande;   //规划用途

    private int nearByLandType;     //周围土地类型

    //房屋情况
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

    //出租情况
    private String rentOut;         //出租人
    private String rentIn;          //承租人
    private String rentTime;        //出租时间
    private String rentMethod;      //出租方式
    private String useage;          //出租用途
    private String rentDeadline;    //出租期限
    private float totalTrdeArea;    //总营业面积
    private float counterTradeArea; //出租柜台营业面积
    private float totalRentPrice;      //出租房地产总费用
    private float fixFee;           //其中维修费
    private float oldFee;               //折旧费
    private float insuranceFee;         //保险费
    private float manageFree;           //管理费
    private float taxFee;               //税费
    private float otherFee;             //其它费用
    private float counterSharedLandArea;    //出租柜台分摊土地面积
    private float counterSharedLandFee;    //出租柜台分摊总费
    private float counterFeeOfYear;         //出租柜台年租金
    private float buildinglandPrice;        //楼面地价
    private float pricePer;                 //单位地价 

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

    public float getTotalTrdeArea() {
        return totalTrdeArea;
    }

    public void setTotalTrdeArea(float totalTrdeArea) {
        this.totalTrdeArea = totalTrdeArea;
    }

    public float getCounterTradeArea() {
        return counterTradeArea;
    }

    public void setCounterTradeArea(float counterTradeArea) {
        this.counterTradeArea = counterTradeArea;
    }

    public float getTotalRentPrice() {
        return totalRentPrice;
    }

    public void setTotalRentPrice(float totalRentPrice) {
        this.totalRentPrice = totalRentPrice;
    }

    public float getFixFee() {
        return fixFee;
    }

    public void setFixFee(float fixFee) {
        this.fixFee = fixFee;
    }

    public float getOldFee() {
        return oldFee;
    }

    public void setOldFee(float oldFee) {
        this.oldFee = oldFee;
    }

    public float getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(float insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    public float getManageFree() {
        return manageFree;
    }

    public void setManageFree(float manageFree) {
        this.manageFree = manageFree;
    }

    public float getTaxFee() {
        return taxFee;
    }

    public void setTaxFee(float taxFee) {
        this.taxFee = taxFee;
    }

    public float getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(float otherFee) {
        this.otherFee = otherFee;
    }

    public float getCounterSharedLandArea() {
        return counterSharedLandArea;
    }

    public void setCounterSharedLandArea(float counterSharedLandArea) {
        this.counterSharedLandArea = counterSharedLandArea;
    }

    public float getCounterSharedLandFee() {
        return counterSharedLandFee;
    }

    public void setCounterSharedLandFee(float counterSharedLandFee) {
        this.counterSharedLandFee = counterSharedLandFee;
    }

    public float getCounterFeeOfYear() {
        return counterFeeOfYear;
    }

    public void setCounterFeeOfYear(float counterFeeOfYear) {
        this.counterFeeOfYear = counterFeeOfYear;
    }

    public float getBuildinglandPrice() {
        return buildinglandPrice;
    }

    public void setBuildinglandPrice(float buildinglandPrice) {
        this.buildinglandPrice = buildinglandPrice;
    }

    public float getPricePer() {
        return pricePer;
    }

    public void setPricePer(float pricePer) {
        this.pricePer = pricePer;
    }
}
