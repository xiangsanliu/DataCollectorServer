package com.wangxiang.datacollectorserver.domain.dao;

import com.wangxiang.datacollectorserver.domain.entity.CommercialHouseTradeModel;
import com.wangxiang.datacollectorserver.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommercialHouseRepository extends JpaRepository<CommercialHouseTradeModel, Long> {
    List<CommercialHouseTradeModel> findCommercialHouseTradeModelsByUserId(Long user_id);
}
