package com.wangxiang.datacollectorserver;

import com.wangxiang.datacollectorserver.domain.dao.SellRentRepository;
import com.wangxiang.datacollectorserver.domain.dao.TradeInfo1Repository;
import com.wangxiang.datacollectorserver.domain.entity.SellRentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.wangxiang.datacollectorserver")
public class DataCollectorServerApplication {


	public static void main(String[] args) {
		SpringApplication.run(DataCollectorServerApplication.class, args);

	}


}
