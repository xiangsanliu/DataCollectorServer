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
public class CommercialHouseTradeModel{

    @Id
    private Long id;

    private int useageActual;
    //实际用途

    private int useagePlande;
    //规划用途

    //房屋情况


    private String floorNum;
    //楼层数

    private String houseStandardPrice;
    //房屋标准造价
    private String buildingProjectPrice;
    //建筑工程造价

    private String serviceFee;
    //小区公共设施配套费

    private String otherDirectFee;
    //其他建房直接费用

    private String manageFeeAndProfit;
    //管理费和利润

    private String unPredictedFee;
    //不可预见费

    private String landCompensateFee;
    //土地征收补偿费

    private String agentFee;
    //代收费用

    private String cityBigSuiteFee;
    //城市大配套费用

    private String otherFee;
    //其他费用


    //买卖情况

    private String developer;
    //商品房开发单位

    private String tradeIn;
    //买方

    private int tradeType;
    //买卖方式

    private String loanYear;
    //按揭年限

    private String tradeLevel;
    //买卖层次

    private String tradeTime;
    //商品房出售时间

    private String useage;
    //房屋用途

    private String plotRatePlaned;
    //规划容积率

    private String buildingDensity;
    //建筑面积

    private String wholeBuildingPrice;
    //整栋商品楼总售价

    private String wholeBuildingFee;
    //整栋商品楼总造价

    private String interest;
    //占用资金应付利息sp

    private String profitOfDeveloper;
    //开发公司利润

    private String price;
    //房屋交易总价格

    private String tax;
    //房屋交易税费

    private String landPricePerSquare;
    //单位面积地价

    private String shareLandArea;
    //分摊土地面积

}
