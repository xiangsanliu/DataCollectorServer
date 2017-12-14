package com.wangxiang.datacollectorserver.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CommercialHouseTradeModel{

    @Id
    private Long id;

    private int useageActual;   //实际用途
    private int useagePlande;   //规划用途

    //房屋情况
    private String floorNum;               //楼层数
//    private String tradeLevel;          //买卖层次
    private String houseStandardPrice;    //房屋标准造价
    private String buildingProjectPrice;     //建筑工程造价
    private String serviceFee;               //小区公共设施配套费
    private String otherDirectFee;           //其他建房直接费用
    private String manageFeeAndProfit;       //管理费和利润
    private String unPredictedFee;           //不可预见费
    private String landCompensateFee;        //土地征收补偿费
    private String agentFee;                 //代收费用
    private String cityBigSuiteFee;          //城市大配套费用
    private String otherFee;                     //其他费用

    //买卖情况
    private String developer;           //商品房开发单位
    private String tradeIn;             //买方
    private int tradeType;              //买卖方式
    private String loanYear;       //按揭年限
    private String tradeLevel;      //买卖层次
    private String tradeTime;       //商品房出售时间
    private String useage;           //房屋用途
    private String plotRatePlaned;  //规划容积率
    private String buildingDensity;  //建筑面积
    private String wholeBuildingPrice;   //整栋商品楼总售价
    private String wholeBuildingFee;     //整栋商品楼总造价
    private String interest;             //占用资金应付利息sp
    private String profitOfDeveloper;    //开发公司利润
    private String price;        //房屋交易总价格
    private String tax;          //房屋交易税费
    private String landPricePerSquare;   //单位面积地价
    private String shareLandArea;//分摊土地面积

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

    public int getUseagePlande() {
        return useagePlande;
    }

    public void setUseagePlande(int useagePlande) {
        this.useagePlande = useagePlande;
    }

    public String getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(String floorNum) {
        this.floorNum = floorNum;
    }

    public String getHouseStandardPrice() {
        return houseStandardPrice;
    }

    public void setHouseStandardPrice(String houseStandardPrice) {
        this.houseStandardPrice = houseStandardPrice;
    }

    public String getBuildingProjectPrice() {
        return buildingProjectPrice;
    }

    public void setBuildingProjectPrice(String buildingProjectPrice) {
        this.buildingProjectPrice = buildingProjectPrice;
    }

    public String getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(String serviceFee) {
        this.serviceFee = serviceFee;
    }

    public String getOtherDirectFee() {
        return otherDirectFee;
    }

    public void setOtherDirectFee(String otherDirectFee) {
        this.otherDirectFee = otherDirectFee;
    }

    public String getManageFeeAndProfit() {
        return manageFeeAndProfit;
    }

    public void setManageFeeAndProfit(String manageFeeAndProfit) {
        this.manageFeeAndProfit = manageFeeAndProfit;
    }

    public String getUnPredictedFee() {
        return unPredictedFee;
    }

    public void setUnPredictedFee(String unPredictedFee) {
        this.unPredictedFee = unPredictedFee;
    }

    public String getLandCompensateFee() {
        return landCompensateFee;
    }

    public void setLandCompensateFee(String landCompensateFee) {
        this.landCompensateFee = landCompensateFee;
    }

    public String getAgentFee() {
        return agentFee;
    }

    public void setAgentFee(String agentFee) {
        this.agentFee = agentFee;
    }

    public String getCityBigSuiteFee() {
        return cityBigSuiteFee;
    }

    public void setCityBigSuiteFee(String cityBigSuiteFee) {
        this.cityBigSuiteFee = cityBigSuiteFee;
    }

    public String getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(String otherFee) {
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

    public String getLoanYear() {
        return loanYear;
    }

    public void setLoanYear(String loanYear) {
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

    public String getPlotRatePlaned() {
        return plotRatePlaned;
    }

    public void setPlotRatePlaned(String plotRatePlaned) {
        this.plotRatePlaned = plotRatePlaned;
    }

    public String getBuildingDensity() {
        return buildingDensity;
    }

    public void setBuildingDensity(String buildingDensity) {
        this.buildingDensity = buildingDensity;
    }

    public String getWholeBuildingPrice() {
        return wholeBuildingPrice;
    }

    public void setWholeBuildingPrice(String wholeBuildingPrice) {
        this.wholeBuildingPrice = wholeBuildingPrice;
    }

    public String getWholeBuildingFee() {
        return wholeBuildingFee;
    }

    public void setWholeBuildingFee(String wholeBuildingFee) {
        this.wholeBuildingFee = wholeBuildingFee;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getProfitOfDeveloper() {
        return profitOfDeveloper;
    }

    public void setProfitOfDeveloper(String profitOfDeveloper) {
        this.profitOfDeveloper = profitOfDeveloper;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getLandPricePerSquare() {
        return landPricePerSquare;
    }

    public void setLandPricePerSquare(String landPricePerSquare) {
        this.landPricePerSquare = landPricePerSquare;
    }

    public String getShareLandArea() {
        return shareLandArea;
    }

    public void setShareLandArea(String shareLandArea) {
        this.shareLandArea = shareLandArea;
    }
}
