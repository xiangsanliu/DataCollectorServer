package com.wangxiang.datacollectorserver.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by xiang on 2017/9/9.
 * 房屋买卖价格调查表 中的买卖情况
 */

@Entity
public class TradeInfo3Model {

    @Id
    private Long id;

    private String tradeIn;       //买方
    private String tradeOut;       //卖方
    private int tradeType;      //买卖方式
    private String tradeTime;       //买卖时间
    private String tradeLevel;      //买卖层次
    private float area;             //卖建面积
    private float shareLandArea;//分摊土地面积
    private String usageBefore;           //买卖前用途
    private String usageAfter;          //买卖后用途
    private float tax;              //房屋交易税费
    private float price;        //房屋交易总价格
    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
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

    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getTradeLevel() {
        return tradeLevel;
    }

    public void setTradeLevel(String tradeLevel) {
        this.tradeLevel = tradeLevel;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getShareLandArea() {
        return shareLandArea;
    }

    public void setShareLandArea(float shareLandArea) {
        this.shareLandArea = shareLandArea;
    }

    public String getUsageBefore() {
        return usageBefore;
    }

    public void setUsageBefore(String usageBefore) {
        this.usageBefore = usageBefore;
    }

    public String getUsageAfter() {
        return usageAfter;
    }

    public void setUsageAfter(String usageAfter) {
        this.usageAfter = usageAfter;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void changeId() {
        id += userId;
    }

}

