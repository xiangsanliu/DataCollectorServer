package com.wangxiang.datacollectorserver.domain.dao;

import com.wangxiang.datacollectorserver.domain.entity.SellRentModel;
import com.wangxiang.datacollectorserver.domain.entity.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SellRentRepository extends JpaRepository<SellRentModel, Long> {
    List<SellRentModel> findAllByUserId(String userId);
}
