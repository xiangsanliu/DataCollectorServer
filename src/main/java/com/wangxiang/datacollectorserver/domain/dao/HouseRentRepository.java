package com.wangxiang.datacollectorserver.domain.dao;

import com.wangxiang.datacollectorserver.domain.entity.HouseRentModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HouseRentRepository extends JpaRepository<HouseRentModel, Long> {
    List<HouseRentModel> findHouseRentModelsByUserId(Long user_id);
}
