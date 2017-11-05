package com.wangxiang.datacollectorserver.domain.entity;

public class ShopRentModel extends BaseSellRent {

    private int useageActual;   //实际用途
    private int useagePlande;   //规划用途

    private int nearByLandType;     //周围土地类型

    //房屋情况
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

}
