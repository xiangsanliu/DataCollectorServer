package com.wangxiang.datacollectorserver.domain.entity;

import javax.persistence.*;

/**
 * Created by xiang on 2017/9/9.
 * 商铺出租租金调查表中的出租
 */

@Entity
public class RentInfo2Model {

    @Id
    private Long id;

    @Column(nullable = true)
    private String rentOut;     //出租人

    @Column(nullable = true)
    private String rentIn;      //承租人

    @Column(nullable = true)
    private String rentType;    //出租方式

    @Column(nullable = true)
    private String appointTime; //定约时间

    @Column(nullable = true)
    private String rentDeadline;//出租期限

    @Column(nullable = true)
    private String useage;         //出租用途

    @Column(nullable = true)
    private String rentLayer;   //出租层次

    @Column(nullable = true)
    private float buildingArea; //出租用途

    @Column(nullable = true)
    private float tradeArea;    //营业面积

    @Column(nullable = true)
    private float shareLandArea;//分摊土地面积

    @Column(nullable = true)
    private float feeOfYear;   //年租金

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

    public String getUseage() {
        return useage;
    }

    public void setUseage(String useage) {
        this.useage = useage;
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

    public float getFeeOfYear() {
        return feeOfYear;
    }

    public void setFeeOfYear(float feeOfYear) {
        this.feeOfYear = feeOfYear;
    }

    public void changeId() {
        id += userId;
    }
}
