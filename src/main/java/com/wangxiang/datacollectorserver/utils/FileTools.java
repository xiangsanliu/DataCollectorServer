package com.wangxiang.datacollectorserver.utils;

import java.io.File;

/**
 * Created by Developer on 17-12-25.
 */
public class FileTools {
    private static final String APP_FILE_PATH;
    private static final String APPLICATION_PRO = "application.properties";

    static {
        APP_FILE_PATH = new File(FileTools.class.getClassLoader().getResource(APPLICATION_PRO).getPath()).getParent();
    }

    public static File getApkFile() {
        File file = new File(APP_FILE_PATH, "app-release");
        return file;
    }
}
