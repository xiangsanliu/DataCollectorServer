package com.wangxiang.datacollectorserver.domain.dao;

import com.wangxiang.datacollectorserver.domain.entity.ShopRentModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShopRentRepository extends JpaRepository<ShopRentModel, Long> {
    List<ShopRentModel> findShopRentModelsByUserId(Long user_id);
}
