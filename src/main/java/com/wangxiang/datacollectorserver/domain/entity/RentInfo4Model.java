package com.wangxiang.datacollectorserver.domain.entity;

import javax.persistence.*;

/**
 * Created by xiang on 17-9-8.
 * 房屋出租租金调查表中的出租情况
 */
@Entity
public class RentInfo4Model {

    @Id
    private Long id;
    private String rentOut;     //出租人
    private String rentIn;      //承租人
    private String rentType;    //出租方式
    private String appointTime; //定约时间
    private String rentDeadline;//出租期限
    private String useage;         //出租用途
    private String rentLayer;   //出租层次
    private float buildingArea; //出租用途
    private float tradeArea;    //营业面积
    private float shareLandArea;//分摊土地面积
    private float feeOfMoney;   //月租金
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

    public String getRentOut() {
        return rentOut;
    }

    public void setRentOut(String rentOut) {
        this.rentOut = rentOut;
    }

    public String getRentIn() {
        return rentIn;
    }

    public void setRentIn(String rentIn) {
        this.rentIn = rentIn;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public String getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(String appointTime) {
        this.appointTime = appointTime;
    }

    public String getRentDeadline() {
        return rentDeadline;
    }

    public void setRentDeadline(String rentDeadline) {
        this.rentDeadline = rentDeadline;
    }

    public String getUseage() {
        return useage;
    }

    public void setUseage(String useage) {
        this.useage = useage;
    }

    public String getRentLayer() {
        return rentLayer;
    }

    public void setRentLayer(String rentLayer) {
        this.rentLayer = rentLayer;
    }

    public float getBuildingArea() {
        return buildingArea;
    }

    public void setBuildingArea(float buildingArea) {
        this.buildingArea = buildingArea;
    }

    public float getTradeArea() {
        return tradeArea;
    }

    public void setTradeArea(float tradeArea) {
        this.tradeArea = tradeArea;
    }

    public float getShareLandArea() {
        return shareLandArea;
    }

    public void setShareLandArea(float shareLandArea) {
        this.shareLandArea = shareLandArea;
    }

    public float getFeeOfMoney() {
        return feeOfMoney;
    }

    public void setFeeOfMoney(float feeOfMoney) {
        this.feeOfMoney = feeOfMoney;
    }

    public void changeId() {
        id += userId;
    }

}

