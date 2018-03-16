package com.wangxiang.datacollectorserver.domain.dao;

import com.wangxiang.datacollectorserver.domain.entity.ShopRentModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShopRentRepository extends JpaRepository<ShopRentModel, Long> {

    /**
     * 查询Model
     * @param id id
     * @return Models
     */
    ShopRentModel findShopRentModelById(Long id);

    /**
     * 查询出对应时间段的Model
     * @param low 开始时间
     * @param high 结束时间
     * @return Models
     */
    List<ShopRentModel> findShopRentModelsByIdBetween(Long low, Long high);
}
