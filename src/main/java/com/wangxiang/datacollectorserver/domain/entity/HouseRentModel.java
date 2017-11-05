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
    private float priceOfFix;       //其中维修费
    private float interestOfDeposit;        //押金利息
    private float oldFee;               //折旧费
    private float insuranceFee;         //保险费
    private float otherProfit;          //其它收益
    private float manageFree;           //管理费
    private float taxFee;               //税费
    private float housePureProfit;      //房地纯收益
    private float landNormalPrice;      //土地正常价格
}
