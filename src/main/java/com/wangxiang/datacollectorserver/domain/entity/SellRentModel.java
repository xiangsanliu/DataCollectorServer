package com.wangxiang.datacollectorserver.domain.entity;

import javax.persistence.*;

/**
 * Created by StormPhoenix on 17-9-11.
 * StormPhoenix is a intelligent Android developer.
 */

@Entity
public class SellRentModel {

    // 主键 id
    @Id
    Long id;

    // 表类型，定义在constant里面
    @Column(nullable = false)
    int modelType;

    
    int nearbyLandType;             //周围土地类型
    
    String landLoacation;       //宗地位置
    
    String landRange;           //土地四至
    
    String nearbyStreetName;    //所临道路名称
    
    int crossRoadSituation;  //交叉路口形式
    
    int landShape;           //宗地形状
    
    String landLength;          //宗地长度
    
    String landDepth;           //宗地宽度
    
    int landDevelopingSituation; //土地开发状况
    
    int buildingDirection;       //建筑朝向
    
    int nearbyStreetSituation;      //临界状况
    
    float distToCornor;             //至拐角距离
    
    float widthToStreet;             //临街宽度
    
    float depthToStreet;            //临街深度
    
    boolean isGore;                 //是否是畸零地
    
    float buildingPlotRate;         //建筑容积率
    
    int usagePlaned;                //规划用途
    
    int usageActual;              //实际用途
    
    String authorizedTime;          //使用权限取得时间
    
    String landServiceableLife;         //土地使用年限
    
    String buildingNum;     //楼宇编号
    
    String buildingName;    //楼宇名称
    
    int decorationType;     //装修标准
    
    int structureType;      //房屋结构
    
    int qualityLevel;       //质量等级
    
    int lightAirType;       //采光通风状况
    
    float buildingArea;     //总建筑面积
    
    float coverArea;        //总占地面积
    
    int floorNum;           //楼层数
    
    int yearUsed;           //已使用年限
    
    String detail;              //详细说明
    
    float longitude;        //经度
    
    float latitude;         //维度
    
    String researcher;      //调查人
    
    String researcherTime;  //调查时间

    Long  userId;              //登陆的用户

    // 以下四个model根据 modelType 字段确定
    

    @OneToOne
    @JoinColumn(name = "ri2ForeignKey", nullable = true)
    RentInfo2Model rentInfo2Model;

    @OneToOne
    @JoinColumn(name = "ri4ForeignKey", nullable = true)
    RentInfo4Model rentInfo4Model;

    
    @OneToOne
    @JoinColumn(name = "ti1ForeignKey", nullable = true)
    TradeInfo1Model tradeInfo1Model;

    @OneToOne
    @JoinColumn(name = "ti3ForeignKey", nullable = true)
    TradeInfo3Model tradeInfo3Model;

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

    public int getModelType() {
        return modelType;
    }

    public void setModelType(int modelType) {
        this.modelType = modelType;
    }

    public int getNearbyLandType() {
        return nearbyLandType;
    }

    public void setNearbyLandType(int nearbyLandType) {
        this.nearbyLandType = nearbyLandType;
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

    public String getLandDepth() {
        return landDepth;
    }

    public void setLandDepth(String landDepth) {
        this.landDepth = landDepth;
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

    public int getUsagePlaned() {
        return usagePlaned;
    }

    public void setUsagePlaned(int usagePlaned) {
        this.usagePlaned = usagePlaned;
    }

    public int getUsageActual() {
        return usageActual;
    }

    public void setUsageActual(int usageActual) {
        this.usageActual = usageActual;
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

    public String getBuildingNum() {
        return buildingNum;
    }

    public void setBuildingNum(String buildingNum) {
        this.buildingNum = buildingNum;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public int getDecorationType() {
        return decorationType;
    }

    public void setDecorationType(int decorationType) {
        this.decorationType = decorationType;
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

    public int getLightAirType() {
        return lightAirType;
    }

    public void setLightAirType(int lightAirType) {
        this.lightAirType = lightAirType;
    }

    public float getBuildingArea() {
        return buildingArea;
    }

    public void setBuildingArea(float buildingArea) {
        this.buildingArea = buildingArea;
    }

    public float getCoverArea() {
        return coverArea;
    }

    public void setCoverArea(float coverArea) {
        this.coverArea = coverArea;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    public int getYearUsed() {
        return yearUsed;
    }

    public void setYearUsed(int yearUsed) {
        this.yearUsed = yearUsed;
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

    public RentInfo2Model getRentInfo2Model() {
        return rentInfo2Model;
    }

    public void setRentInfo2Model(RentInfo2Model rentInfo2Model) {
        this.rentInfo2Model = rentInfo2Model;
    }

    public RentInfo4Model getRentInfo4Model() {
        return rentInfo4Model;
    }

    public void setRentInfo4Model(RentInfo4Model rentInfo4Model) {
        this.rentInfo4Model = rentInfo4Model;
    }

    public TradeInfo1Model getTradeInfo1Model() {
        return tradeInfo1Model;
    }

    public void setTradeInfo1Model(TradeInfo1Model tradeInfo1Model) {
        this.tradeInfo1Model = tradeInfo1Model;
    }

    public TradeInfo3Model getTradeInfo3Model() {
        return tradeInfo3Model;
    }

    public void setTradeInfo3Model(TradeInfo3Model tradeInfo3Model) {
        this.tradeInfo3Model = tradeInfo3Model;
    }

    public void changeId() {
        id += userId;
    }

}
