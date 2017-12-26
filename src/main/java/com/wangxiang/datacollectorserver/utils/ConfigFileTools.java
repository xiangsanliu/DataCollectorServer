package com.wangxiang.datacollectorserver.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Developer on 17-12-25.
 *
 * 这是一个用来读取项目各种配置文件的工具
 */
public class ConfigFileTools {
    // 这是一个文件的路径，这个文件用来存储APK的信息
    private static final String APK_INFO_FILE_PATH;
    // 这是新版本APK存放文件夹的位置
    private static final String APK_DIR_PATH;
    private static final String APPLICATION_PRO = "application.properties";

    // 存储读取到的apk的信息
    private static final Properties APK_PROPERTIES;

    private static final String VERSION_NAME = "versionName";
    private static final String VERSION_CODE = "versionCode";
    private static final String APK_NAME = "apkName";

    static {
        // 初始化信息，项目迁移时候，将下面两行的代码更改掉
        APK_INFO_FILE_PATH = new File(ConfigFileTools.class.getClassLoader().getResource(APPLICATION_PRO).getPath()).getParent();
        APK_DIR_PATH = new File(ConfigFileTools.class.getClassLoader().getResource(APPLICATION_PRO).getPath()).getParent();

        // 读取一个文件，这个文件用来存储APK的信息
        APK_PROPERTIES = new Properties();
        try {
            FileInputStream apkInfoFileStream = new FileInputStream(APK_INFO_FILE_PATH);
            APK_PROPERTIES.load(apkInfoFileStream);
            apkInfoFileStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getApkVersionName() {
        return APK_PROPERTIES.getProperty(VERSION_NAME);
    }

    public static String getApkVersionCode() {
        return APK_PROPERTIES.getProperty(VERSION_CODE);
    }

    public static String getApkName() {
        return APK_PROPERTIES.getProperty(VERSION_NAME);
    }

    public static File getApkFile() {
        File file = new File(APK_DIR_PATH, getApkName());
        return file;
    }
}
