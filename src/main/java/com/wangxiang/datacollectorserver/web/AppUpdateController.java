package com.wangxiang.datacollectorserver.web;

import com.wangxiang.datacollectorserver.utils.FileTools;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by Developer on 17-12-25.
 */


@RequestMapping("/update")
@RestController
public class AppUpdateController {

    @RequestMapping("/version_code")
    public String getAppVersionCode() {
        int versionCode = 5;
        return String.valueOf(versionCode);
    }

    @RequestMapping("/version_name")
    public String getAppVersionName() {
        String versionName = "Oreo";
        return versionName;
    }

    @RequestMapping(value = "/download_apk", method = RequestMethod.GET)
    public void downloadApk(HttpServletResponse resp) throws IOException {
        File file = FileTools.getApkFile();
        resp.setHeader("content-type", "application/octet-stream");
        resp.setContentType("application/octet-stream");
        resp.setHeader("Content-Disposition", "attachment;filename=" + "app-release");
        byte[] buff = new byte[1024];
        BufferedInputStream bis = null;
        OutputStream os = null;
        try {
            os = resp.getOutputStream();
            bis = new BufferedInputStream(new FileInputStream(file));
            int i = bis.read(buff);
            while (i != -1) {
                os.write(buff, 0, buff.length);
                os.flush();
                i = bis.read(buff);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
