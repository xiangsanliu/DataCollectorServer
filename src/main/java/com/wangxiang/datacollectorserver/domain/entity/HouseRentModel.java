package com.wangxiang.datacollectorserver.domain.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HouseRentModel{

    @Id
    Long id;

    private int nearByLandType;     //周围土地类型

    //房屋情况
    private String floorNum;               //楼层数
    private String rentLevel;          //买卖层次
    private int lightAirType;           //采光通风状况
    private String houseStandardPrice;    //房屋标准造价
    private String totalArea;            //总占地面积
    private String houseResetToalPrice;      //房屋重置总价
    private String houseResetPerPrice;      //房屋重置单价
    private String houseTodayValue;      //房屋现值
    private String subbuildingTodayValue;    //其它附属建筑物现值
    private String yearRobust;             //耐用年限
    private String yearUsed;               //已用年限

    //出租情况
    private String rentOut;         //出租人
    private String rentIn;          //承租人
    private String rentTime;        //出租时间
    private String rentMethod;      //出租方式
    private String houseNormalProfit;    //房屋正常收益
    private String houseNormalTotalFee;  //房屋正常总费用
    private String priceOfYear;      //其中年租金
    private String fixFee;       //其中维修费
    private String interestOfDeposit;        //押金利息
    private String oldFee;               //折旧费
    private String insuranceFee;         //保险费
    private String otherProfit;          //其它收益
    private String manageFree;           //管理费
    private String taxFee;               //税费
    private String housePureProfit;      //房地纯收益
    private String landNormalPrice;      //土地正常价格

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getRentLevel() {
        return rentLevel;
    }

    public void setRentLevel(String rentLevel) {
        this.rentLevel = rentLevel;
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

    public String getHouseResetToalPrice() {
        return houseResetToalPrice;
    }

    public void setHouseResetToalPrice(String houseResetToalPrice) {
        this.houseResetToalPrice = houseResetToalPrice;
    }

    public String getHouseResetPerPrice() {
        return houseResetPerPrice;
    }

    public void setHouseResetPerPrice(String houseResetPerPrice) {
        this.houseResetPerPrice = houseResetPerPrice;
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

    public String getHouseNormalProfit() {
        return houseNormalProfit;
    }

    public void setHouseNormalProfit(String houseNormalProfit) {
        this.houseNormalProfit = houseNormalProfit;
    }

    public String getHouseNormalTotalFee() {
        return houseNormalTotalFee;
    }

    public void setHouseNormalTotalFee(String houseNormalTotalFee) {
        this.houseNormalTotalFee = houseNormalTotalFee;
    }

    public String getPriceOfYear() {
        return priceOfYear;
    }

    public void setPriceOfYear(String priceOfYear) {
        this.priceOfYear = priceOfYear;
    }

    public String getFixFee() {
        return fixFee;
    }

    public void setFixFee(String fixFee) {
        this.fixFee = fixFee;
    }

    public String getInterestOfDeposit() {
        return interestOfDeposit;
    }

    public void setInterestOfDeposit(String interestOfDeposit) {
        this.interestOfDeposit = interestOfDeposit;
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

    public String getOtherProfit() {
        return otherProfit;
    }

    public void setOtherProfit(String otherProfit) {
        this.otherProfit = otherProfit;
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

    public String getHousePureProfit() {
        return housePureProfit;
    }

    public void setHousePureProfit(String housePureProfit) {
        this.housePureProfit = housePureProfit;
    }

    public String getLandNormalPrice() {
        return landNormalPrice;
    }

    public void setLandNormalPrice(String landNormalPrice) {
        this.landNormalPrice = landNormalPrice;
    }
}
