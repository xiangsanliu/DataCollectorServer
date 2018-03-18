package com.wangxiang.datacollectorserver;

import com.wangxiang.datacollectorserver.share.Constants;
import com.wangxiang.datacollectorserver.utils.ExcelUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@ComponentScan("com.wangxiang.datacollectorserver")
public class DataCollectorServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataCollectorServerApplication.class, args);
	}
}
