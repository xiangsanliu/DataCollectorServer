package com.wangxiang.datacollectorserver.domain.dao;

import com.wangxiang.datacollectorserver.domain.entity.IMEI;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMEIRepository extends JpaRepository<IMEI, Long>{

}
