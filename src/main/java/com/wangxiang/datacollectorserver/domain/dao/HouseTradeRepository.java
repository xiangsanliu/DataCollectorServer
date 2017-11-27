package com.wangxiang.datacollectorserver.domain.dao;

import com.wangxiang.datacollectorserver.domain.entity.HouseTradeModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HouseTradeRepository extends JpaRepository<HouseTradeModel, Long> {
    HouseTradeModel findHouseTradeModelById(Long id);
}
