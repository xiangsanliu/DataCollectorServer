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

}
