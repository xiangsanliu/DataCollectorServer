package com.wangxiang.datacollectorserver.domain.entity;

public class HouseRentModel extends BaseSellRent {
    private int nearByLandType;     //周围土地类型

    //房屋情况
    private int floorNum;               //楼层数
    private String rentLevel;          //买卖层次
    private int lightAirType;           //采光通风状况
    private float houseStandardPrice;    //房屋标准造价
    private float totalArea;            //总占地面积
    private float houseResetToalPrice;      //房屋重置总价
    private float houseResetPerPrice;      //房屋重置单价
    private float houseTodayValue;      //房屋现值
    private float subbuildingTodayValue;    //其它附属建筑物现值
    private int yearRobust;             //耐用年限
    private int yearUsed;               //已用年限

    //出租情况
    private String rentOut;         //出租人
    private String rentIn;          //承租人
    private String rentTime;        //出租时间
    private String rentMethod;      //出租方式
    private String houseNomalProfit;    //房屋正常收益
    private String houseNomalTotalFee;  //房屋正常总费用
    private float priceOfYear;      //其中年租金
    private float fixFee;       //其中维修费
    private float interestOfDeposit;        //押金利息
    private float oldFee;               //折旧费
    private float insuranceFee;         //保险费
    private float otherProfit;          //其它收益
    private float manageFree;           //管理费
    private float taxFee;               //税费
    private float housePureProfit;      //房地纯收益
    private float landNormalPrice;      //土地正常价格

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

    public float getHouseResetToalPrice() {
        return houseResetToalPrice;
    }

    public void setHouseResetToalPrice(float houseResetToalPrice) {
        this.houseResetToalPrice = houseResetToalPrice;
    }

    public float getHouseResetPerPrice() {
        return houseResetPerPrice;
    }

    public void setHouseResetPerPrice(float houseResetPerPrice) {
        this.houseResetPerPrice = houseResetPerPrice;
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

    public String getHouseNomalProfit() {
        return houseNomalProfit;
    }

    public void setHouseNomalProfit(String houseNomalProfit) {
        this.houseNomalProfit = houseNomalProfit;
    }

    public String getHouseNomalTotalFee() {
        return houseNomalTotalFee;
    }

    public void setHouseNomalTotalFee(String houseNomalTotalFee) {
        this.houseNomalTotalFee = houseNomalTotalFee;
    }

    public float getPriceOfYear() {
        return priceOfYear;
    }

    public void setPriceOfYear(float priceOfYear) {
        this.priceOfYear = priceOfYear;
    }

    public float getFixFee() {
        return fixFee;
    }

    public void setFixFee(float fixFee) {
        this.fixFee = fixFee;
    }

    public float getInterestOfDeposit() {
        return interestOfDeposit;
    }

    public void setInterestOfDeposit(float interestOfDeposit) {
        this.interestOfDeposit = interestOfDeposit;
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

    public float getOtherProfit() {
        return otherProfit;
    }

    public void setOtherProfit(float otherProfit) {
        this.otherProfit = otherProfit;
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

    public float getHousePureProfit() {
        return housePureProfit;
    }

    public void setHousePureProfit(float housePureProfit) {
        this.housePureProfit = housePureProfit;
    }

    public float getLandNormalPrice() {
        return landNormalPrice;
    }

    public void setLandNormalPrice(float landNormalPrice) {
        this.landNormalPrice = landNormalPrice;
    }
}
