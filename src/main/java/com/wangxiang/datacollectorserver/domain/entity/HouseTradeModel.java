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
public class HouseTradeModel{

    @Id
    private Long id;

    //土地基本状况


    private int useageActual;
    //实际用途

    private int useagePlaned;
    //规划用途

    private int nearByLandType;
    //周围土地类型


    //房屋情况

    private String floorNum;
    //楼层数

    private String tradeLevel;
    //买卖层次

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


    //买卖情况

    private String tradeOut;
    //转让人

    private String tradeIn;
    //承让人

    private String tradeTime;
    //买卖时间

    private String tradeMethod;
    //买卖方式

    private String useageBeforeTrade;
    //买卖前用途

    private String useageAfterTrade;
    //买卖后用途

    private String tradeBuildingArea;
    //出卖建筑面积

    private String buildingTradeSharedLandArea;
    //出卖建筑分摊土地面积

    private String houseTradeTotalPrice;
    //房屋交易总价

    private String houseTradeTax;
    //房屋交易税费

    private String landTradeTotalPirce;
    //土地交易总价

    private String landPricePerSquare;
    //单位面积地价
}
