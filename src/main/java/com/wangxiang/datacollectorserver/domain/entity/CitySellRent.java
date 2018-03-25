package com.wangxiang.datacollectorserver.domain.entity;



import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by StormPhoenix on 17-9-11.
 * StormPhoenix is a intelligent Android developer.
 */

@Entity
public class CitySellRent {

    public CitySellRent(Long userId, int modelType) {
        this.userId = userId;
        this.modelType = modelType;
    }

    // 主键 id
    @Id
    private Long id;

    //土地基本信息
    private String landLoacation;
    //宗地位置

    private String landRange;
    //土地四至

    private String nearbyStreetName;
    //所临道路名称

    private int crossRoadSituation;
    //交叉路口形式

    private int landShape;
    //宗地形状

    private String landLength;
    //宗地长度

    private String landWidth;
    //宗地宽度

    private int landDevelopingSituation;
    //土地开发状况

    private int buildingDirection;
    //建筑朝向

    private int nearbyStreetSituation;
    //临界状况

    private String distToCornor;
    //至拐角距离

    private String widthToStreet;
    //临街宽度

    private String depthToStreet;
    //临街深度

    private boolean gore;
    //是否是畸零地

    private String buildingPlotRate;
    //建筑容积率

    private String authorizedTime;
    //使用权限取得时间

    private String landServiceableLife;
    //土地使用年限

    //房屋信息
    private String houseLocation;
    //房屋位置/柜台具体位置

    private int structureType;
    //房屋结构

    private int qualityLevel;
    //质量等级

    private String buildingArea;
    //建筑面积

    private String houseArea;
    //房屋建筑面积

    private String detail;
    //详细说明

    private double longitude;
    //经度

    private double latitude;
    //维度

    private String researcher;
    //调查人

    private Date researcherTime;
    //调查时间

    private Long userId;
    //用户id

    private int modelType;

    public CitySellRent() {
    }

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

    public String getDistToCornor() {
        return distToCornor;
    }

    public void setDistToCornor(String distToCornor) {
        this.distToCornor = distToCornor;
    }

    public String getWidthToStreet() {
        return widthToStreet;
    }

    public void setWidthToStreet(String widthToStreet) {
        this.widthToStreet = widthToStreet;
    }

    public String getDepthToStreet() {
        return depthToStreet;
    }

    public void setDepthToStreet(String depthToStreet) {
        this.depthToStreet = depthToStreet;
    }

    public boolean isGore() {
        return gore;
    }

    public void setGore(boolean gore) {
        this.gore = gore;
    }

    public String getBuildingPlotRate() {
        return buildingPlotRate;
    }

    public void setBuildingPlotRate(String buildingPlotRate) {
        this.buildingPlotRate = buildingPlotRate;
    }

    public String getAuthorizedTime() {
        return authorizedTime;
    }

    public void setAuthorizedTime(String authorizedTime) {
        this.authorizedTime = authorizedTime;
    }

    public String getLandServiceableLife() {
        return landServiceableLife;
    }

    public void setLandServiceableLife(String landServiceableLife) {
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

    public String getBuildingArea() {
        return buildingArea;
    }

    public void setBuildingArea(String buildingArea) {
        this.buildingArea = buildingArea;
    }

    public String getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(String houseArea) {
        this.houseArea = houseArea;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getResearcher() {
        return researcher;
    }

    public void setResearcher(String researcher) {
        this.researcher = researcher;
    }

    public Date getResearcherTime() {
        return researcherTime;
    }

    public void setResearcherTime(Date researcherTime) {
        this.researcherTime = researcherTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getModelType() {
        return modelType;
    }

    public void setModelType(int modelType) {
        this.modelType = modelType;
    }
}
