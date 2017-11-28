package com.wangxiang.datacollectorserver.domain.dao;

import com.wangxiang.datacollectorserver.domain.entity.CitySellRent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CitySellRentRepository extends JpaRepository<CitySellRent, Long> {
    CitySellRent findCitySellRentById(Long id);
    List<CitySellRent> findCitySellRentsByUserId(Long userId);
}
