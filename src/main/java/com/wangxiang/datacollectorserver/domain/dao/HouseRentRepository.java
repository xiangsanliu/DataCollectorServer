package com.wangxiang.datacollectorserver.domain.dao;

import com.wangxiang.datacollectorserver.domain.entity.HouseRentModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author xiang
 */
public interface HouseRentRepository extends JpaRepository<HouseRentModel, Long> {

    /**
     * 查询出Model
     *
     * @param id id
     * @return Models
     */
    HouseRentModel findHouseRentModelById(Long id);

}