package com.wangxiang.datacollectorserver.share;

public class Constants {

    public static final int COMMERCIAL_HOUSE_TRADE = 0;
    public static final int SHOP_RENT = 1;
    public static final int HOUSE_SELL = 2;
    public static final int HOUSE_RENT = 3;

    // 用户登录失败
    public static final int USER_LOGIN_SUCCESS = 101;
    // 用户登录成功
    public static final int USER_LOGIN_FAILED = 102;
    // user upload success
    public static final int UPLOAD_MODEL_SUCCESS = 200;
    // user upload failed
    public static final int UPLOAD_MODEL_FAILED = 201;

    public static final String[] CROSS_LOAD_TYPE = {" ","十字路口", "丁字路口", "环形路口", "人形立交"};
    public static final String[] LAND_SHAPE = {" ","长方形", "梯形", "多边形", "正三角形", "倒三角形"};
    public static final String[] LAND_DEVELOPING_SITUATION = {" ","生地", "三通一平", "五通一平", "六通一平", "七通一平"};
    public static final String[] BUILDING_DIRECTION = {" ","东", "南", "西", "北", "东南", "西北", "东北", "西南"};
    public static final String[] NEARBY_STREET_SITUATION = {" ","沿街", "离街", "拐角"};
    public static final String[] NEARBY_LAND_TYPE = {" ","商业用地", "住宅用地", "工业用地", "办公用地", "文教、卫生用地", "交通用地", "其他用地"};
    public static final String[] USAGE = {" ","商业用地", "住宅用地", "工业用地", "其他用地"};
    public static final String[] DECORATION_TYPE = {" ","豪华", "较好", "一般", "无装修"};
    public static final String[] STRUCTURE_TYPE = {" ","钢", "钢、钢混", "钢混", "混和", "砖木", "其他"};
    public static final String[] QUALITY_LEVEL = {" ","完好", "基本完好", "一般损坏", "严重损坏", "危房"};
    public static final String[] LIGHT_AIR_TYPE = {" ","好", "较好", "一般", "较差", "差"};
    public static final String[] TRADE_TYPE = {" ","一次性付还", "按揭"};

}
