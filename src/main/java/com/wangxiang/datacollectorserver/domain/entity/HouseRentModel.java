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
public class HouseRentModel{

    @Id
    private Long id;

    private int nearByLandType;
    //周围土地类型

    //房屋情况

    private String floorNum;
    //楼层数

    private String rentLevel;
    //买卖层次

    private int lightAirType;
    //采光通风状况

    private String houseStandardPrice;
    //房屋标准造价

    private String totalArea;
    //总占地面积

    private String houseResetToalPrice;
    //房屋重置总价

    private String houseResetPerPrice;
    //房屋重置单价

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

    private String houseNormalProfit;
    //房屋正常收益

    private String houseNormalTotalFee;
    //房屋正常总费用

    private String priceOfYear;
    //其中年租金

    private String fixFee;
    //其中维修费

    private String interestOfDeposit;
    //押金利息

    private String oldFee;
    //折旧费

    private String insuranceFee;
    //保险费

    private String otherProfit;
    //其它收益

    private String manageFree;
    //管理费

    private String taxFee;
    //税费

    private String housePureProfit;
    //房地纯收益

    private String landNormalPrice;
    //土地正常价格

}
