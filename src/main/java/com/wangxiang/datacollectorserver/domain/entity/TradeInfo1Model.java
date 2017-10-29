package com.wangxiang.datacollectorserver.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by xiang on 2017/9/9.
 * 商品房出售价格调查表 中的买卖情况
 */

@Entity
public class TradeInfo1Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String tradeIn;       //买方
    private String tradeOut;       //卖方
    private int tradeType;      //买卖方式
    private int loanYear;       //按揭年限
    private String tradeLevel;      //买卖层次
    private String tradeTime;       //商品房出售时间
    private String useage;           //房屋用途
    private String plotRatePlaned;  //规划容积率
    private float area;             //卖建面积
    private float price;        //房屋交易总价格
    private float shareLandArea;//分摊土地面积

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTradeIn() {
        return tradeIn;
    }

    public void setTradeIn(String tradeIn) {
        this.tradeIn = tradeIn;
    }

    public String getTradeOut() {
        return tradeOut;
    }

    public void setTradeOut(String tradeOut) {
        this.tradeOut = tradeOut;
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

    public String getPlotRatePlaned() {
        return plotRatePlaned;
    }

    public void setPlotRatePlaned(String plotRatePlaned) {
        this.plotRatePlaned = plotRatePlaned;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getShareLandArea() {
        return shareLandArea;
    }

    public void setShareLandArea(float shareLandArea) {
        this.shareLandArea = shareLandArea;
    }
}

