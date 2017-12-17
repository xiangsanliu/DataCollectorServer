package com.wangxiang.datacollectorserver.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class ShopRentModel {

    @Id
    private Long id;

    private int useageActual;
    //实际用途

    private int useagePlaned;
    //规划用途

    private int nearByLandType;
    //周围土地类型


    //房屋情况

    private int decorationType;
    //装修标准

    private int lightAirType;
    //采光通风状况

    private String houseStandardPrice;
    //房屋标准造价

    private String totalArea;
    //总占地面积

    private String houseResetTotalPrice;
    //房屋重置总价

    private String subbuildingResetPrice;
    //其它附属建筑物重置总价

    private String houseTodayValue;
    //房屋现值

    private String subbuildingTodayValue;
    //其它附属建筑物现值

    private String yearRobust;
    //耐用年限

    private String yearUsed;
    //已用年限


    //出租情况

    private String rentOut;
    //出租人

    private String rentIn;
    //承租人

    private String rentTime;
    //出租时间

    private String rentMethod;
    //出租方式

    private String useage;
    //出租用途

    private String rentDeadline;
    //出租期限

    private String totalTrdeArea;
    //总营业面积

    private String counterTradeArea;
    //出租柜台营业面积

    private String totalRentPrice;
    //出租房地产总费用

    private String fixFee;
    //其中维修费

    private String oldFee;
    //折旧费

    private String insuranceFee;
    //保险费

    private String manageFree;
    //管理费

    private String taxFee;
    //税费

    private String otherFee;
    //其它费用

    private String counterSharedLandArea;
    //出租柜台分摊土地面积

    private String counterSharedLandFee;
    //出租柜台分摊总费

    private String counterFeeOfYear;
    //出租柜台年租金

    private String buildinglandPrice;
    //楼面地价

    private String pricePer;
    //单位地价
}