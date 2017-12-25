package com.wangxiang.datacollectorserver.domain.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by StormPhoenix on 17-9-11.
 * StormPhoenix is a intelligent Android developer.
 */

@Getter
@Setter
@NoArgsConstructor
@Entity
public class CitySellRent {

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

    private String researcherTime;
    //调查时间

    private Long userId;
    //用户id

    private int modelType;

}
