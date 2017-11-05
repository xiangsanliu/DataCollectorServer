package com.wangxiang.datacollectorserver.domain.dao;

import com.wangxiang.datacollectorserver.domain.entity.BaseSellRent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SellRentRepository extends JpaRepository<BaseSellRent, Long> {
    List<BaseSellRent> findAllByUserId(String userId);
}
