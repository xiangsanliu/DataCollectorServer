package com.wangxiang.datacollectorserver.domain.dao;

import com.wangxiang.datacollectorserver.domain.entity.CommercialHouseTradeModel;
import com.wangxiang.datacollectorserver.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommercialHouseTradeRepository extends JpaRepository<CommercialHouseTradeModel, Long> {

    /**
     * 查询Model
     * @param id id
     * @return Models
     */
    CommercialHouseTradeModel findCommercialHouseTradeModelById(Long id);

}
