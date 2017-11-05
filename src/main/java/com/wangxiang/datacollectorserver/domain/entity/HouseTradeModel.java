package com.wangxiang.datacollectorserver.domain.entity;

public class HouseTradeModel {
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

}
