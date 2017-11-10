package com.wangxiang.datacollectorserver.domain.entity;

public class CommercialHouseTradeModel extends BaseSellRent {
    private int useageActual;   //实际用途
    private int useagePlande;   //规划用途

    //房屋情况
    private int floorNum;               //楼层数
//    private String tradeLevel;          //买卖层次
    private float houseStandardPrice;    //房屋标准造价
    private float buildingProjectPrice;     //建筑工程造价
    private float serviceFee;               //小区公共设施配套费
    private float otherDirectFee;           //其他建房直接费用
    private float manageFeeAndProfit;       //管理费和利润
    private float unPredictedFee;           //不可预见费
    private float landCompensateFee;        //土地征收补偿费
    private float agentFee;                 //代收费用
    private float cityBigSuiteFee;          //城市大配套费用
    private float otherFee;                     //其他费用

    //买卖情况
    private String developer;           //商品房开发单位
    private String tradeIn;             //买方
    private int tradeType;              //买卖方式
    private int loanYear;       //按揭年限
    private String tradeLevel;      //买卖层次
    private String tradeTime;       //商品房出售时间
    private String useage;           //房屋用途
    private float plotRatePlaned;  //规划容积率
    private float buildingDensity;  //建筑面积
    private float wholeBuildingPrice;   //整栋商品楼总售价
    private float wholeBuildingFee;     //整栋商品楼总造价
    private float interest;             //占用资金应付利息
    private float profitOfDeveloper;    //开发公司利润
    private float price;        //房屋交易总价格
    private float tax;          //房屋交易税费
    private float landPricePerSquare;   //单位面积地价
    private float shareLandArea;//分摊土地面积

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

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    public float getHouseStandardPrice() {
        return houseStandardPrice;
    }

    public void setHouseStandardPrice(float houseStandardPrice) {
        this.houseStandardPrice = houseStandardPrice;
    }

    public float getBuildingProjectPrice() {
        return buildingProjectPrice;
    }

    public void setBuildingProjectPrice(float buildingProjectPrice) {
        this.buildingProjectPrice = buildingProjectPrice;
    }

    public float getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(float serviceFee) {
        this.serviceFee = serviceFee;
    }

    public float getOtherDirectFee() {
        return otherDirectFee;
    }

    public void setOtherDirectFee(float otherDirectFee) {
        this.otherDirectFee = otherDirectFee;
    }

    public float getManageFeeAndProfit() {
        return manageFeeAndProfit;
    }

    public void setManageFeeAndProfit(float manageFeeAndProfit) {
        this.manageFeeAndProfit = manageFeeAndProfit;
    }

    public float getUnPredictedFee() {
        return unPredictedFee;
    }

    public void setUnPredictedFee(float unPredictedFee) {
        this.unPredictedFee = unPredictedFee;
    }

    public float getLandCompensateFee() {
        return landCompensateFee;
    }

    public void setLandCompensateFee(float landCompensateFee) {
        this.landCompensateFee = landCompensateFee;
    }

    public float getAgentFee() {
        return agentFee;
    }

    public void setAgentFee(float agentFee) {
        this.agentFee = agentFee;
    }

    public float getCityBigSuiteFee() {
        return cityBigSuiteFee;
    }

    public void setCityBigSuiteFee(float cityBigSuiteFee) {
        this.cityBigSuiteFee = cityBigSuiteFee;
    }

    public float getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(float otherFee) {
        this.otherFee = otherFee;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getTradeIn() {
        return tradeIn;
    }

    public void setTradeIn(String tradeIn) {
        this.tradeIn = tradeIn;
    }

    public int getTradeType() {
        return tradeType;
    }

    public void setTradeType(int tradeType) {
        this.tradeType = tradeType;
    }

    public int getLoanYear() {
        return loanYear;
    }

    public void setLoanYear(int loanYear) {
        this.loanYear = loanYear;
    }

    public String getTradeLevel() {
        return tradeLevel;
    }

    public void setTradeLevel(String tradeLevel) {
        this.tradeLevel = tradeLevel;
    }

    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getUseage() {
        return useage;
    }

    public void setUseage(String useage) {
        this.useage = useage;
    }

    public float getPlotRatePlaned() {
        return plotRatePlaned;
    }

    public void setPlotRatePlaned(float plotRatePlaned) {
        this.plotRatePlaned = plotRatePlaned;
    }

    public float getBuildingDensity() {
        return buildingDensity;
    }

    public void setBuildingDensity(float buildingDensity) {
        this.buildingDensity = buildingDensity;
    }

    public float getWholeBuildingPrice() {
        return wholeBuildingPrice;
    }

    public void setWholeBuildingPrice(float wholeBuildingPrice) {
        this.wholeBuildingPrice = wholeBuildingPrice;
    }

    public float getWholeBuildingFee() {
        return wholeBuildingFee;
    }

    public void setWholeBuildingFee(float wholeBuildingFee) {
        this.wholeBuildingFee = wholeBuildingFee;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public float getProfitOfDeveloper() {
        return profitOfDeveloper;
    }

    public void setProfitOfDeveloper(float profitOfDeveloper) {
        this.profitOfDeveloper = profitOfDeveloper;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getLandPricePerSquare() {
        return landPricePerSquare;
    }

    public void setLandPricePerSquare(float landPricePerSquare) {
        this.landPricePerSquare = landPricePerSquare;
    }

    public float getShareLandArea() {
        return shareLandArea;
    }

    public void setShareLandArea(float shareLandArea) {
        this.shareLandArea = shareLandArea;
    }
}
