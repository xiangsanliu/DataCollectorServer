package com.wangxiang.datacollectorserver.web;

import com.wangxiang.datacollectorserver.utils.ConfigFileTools;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by Developer on 17-12-25.
 */


@RestController
@RequestMapping("/update")
public class AppUpdateController {

    @RequestMapping("/version_code")
    public String getAppVersionCode() {
        return ConfigFileTools.getApkVersionCode();
    }

    @RequestMapping("/version_name")
    public String getAppVersionName() {
        return ConfigFileTools.getApkVersionName();
    }

    @RequestMapping(value = "/download_apk", method = RequestMethod.GET)
    public void downloadApk(HttpServletRequest request,
                            HttpServletResponse response) throws IOException {
        File file = ConfigFileTools.getApkFile();
        String mimeType = request.getServletContext().getMimeType(file.getAbsolutePath());
        int fileLength = (int) file.length();
        if (mimeType == null) {
            mimeType = "application/octet-stream";
        }
        response.setContentType(mimeType);
        response.setContentLength(fileLength);
        response.setHeader("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getName()));

        try {
            InputStream myStream = new FileInputStream(file.getAbsolutePath());
            IOUtils.copy(myStream, response.getOutputStream());
            response.flushBuffer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
