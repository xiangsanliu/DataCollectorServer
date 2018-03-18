package com.wangxiang.datacollectorserver.domain.dao;

import com.wangxiang.datacollectorserver.domain.entity.HouseTradeModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author xiang
 */
public interface HouseTradeRepository extends JpaRepository<HouseTradeModel, Long> {

    /**
     * 查询出Models
     * @param id id
     * @return Models
     */
    HouseTradeModel findHouseTradeModelById(Long id);

}
