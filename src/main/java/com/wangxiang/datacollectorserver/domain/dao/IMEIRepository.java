package com.wangxiang.datacollectorserver.domain.dao;

import com.wangxiang.datacollectorserver.domain.entity.ImeiModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMEIRepository extends JpaRepository<ImeiModel, String> {
    ImeiModel findImeiModelByImei(String imei);
}
