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

    /**
     * 查询出对应时间段的Model
     * @param low 开始时间
     * @param high 结束时间
     * @return Models
     */
    List<CommercialHouseTradeModel> findCommercialHouseTradeModelsByIdBetween(Long low, Long high);

}
