package com.wangxiang.datacollectorserver.web;

import com.wangxiang.datacollectorserver.share.Constants;
import com.wangxiang.datacollectorserver.utils.ExcelUtil;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Date;


/**
 * @author xiang
 * 用来导出数据的Controller
 */

@RestController
@RequestMapping("/export")
public class ExportController {


    private final ExcelUtil excelUtil;

    @Autowired
    public ExportController(ExcelUtil excelUtil) {
        this.excelUtil = excelUtil;
    }

    @Value("${file_folder}")
    private String fileFolder;

    @RequestMapping(value = "/download_file/{file_name}")
    public void downloadFile(@PathVariable(name = "file_name") String fileName,
                             HttpServletResponse response) {
        File file = new File(fileFolder, fileName + Constants.XLS_SUFFIX);

        if (file.exists()) {
            try {
                response.setContentType("application/octet-stream");
                response.setHeader("Content-Disposition", "attachment;filename=" + file.getName());
                IOUtils.copy(new FileInputStream(file), response.getOutputStream());
                response.flushBuffer();
                //              file.delete();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            // nothing
        }
    }

    /**
     * 导出表格
     */
    @RequestMapping(value = "/download", method = RequestMethod.POST)
    public void export(String start, String end, String type,
                       HttpServletResponse response) throws IOException {
        Date startTime, endTime;
        startTime = excelUtil.resolveDate(start);
        endTime = excelUtil.resolveDate(end);
        String fileName = null;
        switch (type) {
            case "商品房出售调查表":
                fileName = excelUtil.exportCommercial(startTime, endTime);
                break;
            case "房屋出租租金调查表":
                fileName = excelUtil.exportHouseRent(startTime, endTime);
                break;
            case "房屋买卖价格调查表":
                fileName = excelUtil.exportHouseTrade(startTime, endTime);
                break;
            case "柜台（商铺）出租租金调查表":
                fileName = excelUtil.exportShopRent(startTime, endTime);
                break;
            default:
                fileName = null;
        }
        response.sendRedirect("download_file/" + fileName);
    }


}
