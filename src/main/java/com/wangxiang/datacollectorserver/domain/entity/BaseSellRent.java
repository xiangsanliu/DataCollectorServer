package com.wangxiang.datacollectorserver.domain.entity;

import javax.persistence.*;

/**
 * Created by StormPhoenix on 17-9-11.
 * StormPhoenix is a intelligent Android developer.
 */

@Entity
public class BaseSellRent {

    // 主键 id
    @Id
    private Long id;

    //土地基本信息
    private String landLoacation;       //宗地位置
    
    private String landRange;           //土地四至
    
    private String nearbyStreetName;    //所临道路名称
    
    private int crossRoadSituation;  //交叉路口形式
    
    private int landShape;           //宗地形状
    
    private String landLength;          //宗地长度
    
    private String landWidth;           //宗地宽度
    
    private int landDevelopingSituation; //土地开发状况
    
    private int buildingDirection;       //建筑朝向
    
    private int nearbyStreetSituation;      //临界状况
    
    private float distToCornor;             //至拐角距离
    
    private float widthToStreet;             //临街宽度
    
    private float depthToStreet;            //临街深度
    
    private boolean isGore;                 //是否是畸零地
    
    private float buildingPlotRate;         //建筑容积率

    private String authorizedTime;          //使用权限取得时间
    
    private float landServiceableLife;         //土地使用年限

    //房屋信息
    private String houseLocation;        //房屋位置/柜台具体位置

    private int structureType;      //房屋结构
    
    private int qualityLevel;       //质量等级

    private float buindingArea;     //建筑面积

    private float houseArea;             //房屋建筑面积

    private String detail;              //详细说明
    
    private float longitude;        //经度
    
    private float latitude;         //维度
    
    private String researcher;      //调查人
    
    private String researcherTime;  //调查时间

    private Long  userId;              //登陆的用户

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLandLoacation() {
        return landLoacation;
    }

    public void setLandLoacation(String landLoacation) {
        this.landLoacation = landLoacation;
    }

    public String getLandRange() {
        return landRange;
    }

    public void setLandRange(String landRange) {
        this.landRange = landRange;
    }

    public String getNearbyStreetName() {
        return nearbyStreetName;
    }

    public void setNearbyStreetName(String nearbyStreetName) {
        this.nearbyStreetName = nearbyStreetName;
    }

    public int getCrossRoadSituation() {
        return crossRoadSituation;
    }

    public void setCrossRoadSituation(int crossRoadSituation) {
        this.crossRoadSituation = crossRoadSituation;
    }

    public int getLandShape() {
        return landShape;
    }

    public void setLandShape(int landShape) {
        this.landShape = landShape;
    }

    public String getLandLength() {
        return landLength;
    }

    public void setLandLength(String landLength) {
        this.landLength = landLength;
    }

    public String getLandWidth() {
        return landWidth;
    }

    public void setLandWidth(String landWidth) {
        this.landWidth = landWidth;
    }

    public int getLandDevelopingSituation() {
        return landDevelopingSituation;
    }

    public void setLandDevelopingSituation(int landDevelopingSituation) {
        this.landDevelopingSituation = landDevelopingSituation;
    }

    public int getBuildingDirection() {
        return buildingDirection;
    }

    public void setBuildingDirection(int buildingDirection) {
        this.buildingDirection = buildingDirection;
    }

    public int getNearbyStreetSituation() {
        return nearbyStreetSituation;
    }

    public void setNearbyStreetSituation(int nearbyStreetSituation) {
        this.nearbyStreetSituation = nearbyStreetSituation;
    }

    public float getDistToCornor() {
        return distToCornor;
    }

    public void setDistToCornor(float distToCornor) {
        this.distToCornor = distToCornor;
    }

    public float getWidthToStreet() {
        return widthToStreet;
    }

    public void setWidthToStreet(float widthToStreet) {
        this.widthToStreet = widthToStreet;
    }

    public float getDepthToStreet() {
        return depthToStreet;
    }

    public void setDepthToStreet(float depthToStreet) {
        this.depthToStreet = depthToStreet;
    }

    public boolean isGore() {
        return isGore;
    }

    public void setGore(boolean gore) {
        isGore = gore;
    }

    public float getBuildingPlotRate() {
        return buildingPlotRate;
    }

    public void setBuildingPlotRate(float buildingPlotRate) {
        this.buildingPlotRate = buildingPlotRate;
    }

    public String getAuthorizedTime() {
        return authorizedTime;
    }

    public void setAuthorizedTime(String authorizedTime) {
        this.authorizedTime = authorizedTime;
    }

    public float getLandServiceableLife() {
        return landServiceableLife;
    }

    public void setLandServiceableLife(float landServiceableLife) {
        this.landServiceableLife = landServiceableLife;
    }

    public String getHouseLocation() {
        return houseLocation;
    }

    public void setHouseLocation(String houseLocation) {
        this.houseLocation = houseLocation;
    }

    public int getStructureType() {
        return structureType;
    }

    public void setStructureType(int structureType) {
        this.structureType = structureType;
    }

    public int getQualityLevel() {
        return qualityLevel;
    }

    public void setQualityLevel(int qualityLevel) {
        this.qualityLevel = qualityLevel;
    }

    public float getBuindingArea() {
        return buindingArea;
    }

    public void setBuindingArea(float buindingArea) {
        this.buindingArea = buindingArea;
    }

    public float getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(float houseArea) {
        this.houseArea = houseArea;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public String getResearcher() {
        return researcher;
    }

    public void setResearcher(String researcher) {
        this.researcher = researcher;
    }

    public String getResearcherTime() {
        return researcherTime;
    }

    public void setResearcherTime(String researcherTime) {
        this.researcherTime = researcherTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void changeId() {
        id += userId;
    }

}
