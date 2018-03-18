package com.wangxiang.datacollectorserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.sql.Date;

@SpringBootApplication
@ComponentScan("com.wangxiang.datacollectorserver")
public class DataCollectorServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataCollectorServerApplication.class, args);
	}

}
