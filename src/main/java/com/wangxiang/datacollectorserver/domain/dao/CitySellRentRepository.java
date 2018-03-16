package com.wangxiang.datacollectorserver.domain.dao;

import com.wangxiang.datacollectorserver.domain.entity.CitySellRent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author xiang
 * {@link CitySellRent}
 */
public interface CitySellRentRepository extends JpaRepository<CitySellRent, Long> {
    /**
     * 从数据库中获取CitySelLRent
     * @param id CitySellRentModel的id
     * @return CitySellRENT
     */
    CitySellRent findCitySellRentById(Long id);

    /**
     * 从数据库中获取CitySelLRent
     * @param userId userId
     * @param modelType modelType
     * @return CitySellRents
     */
    List<CitySellRent> findCitySellRentsByUserIdAndModelType(Long userId, int modelType);

    /**
     * 查询出对应时间段的Model
     * @param low 开始时间
     * @param high 结束时间
     * @return Models
     */
    List<CitySellRent> findCitySellRentsByIdBetween(Long low, Long high);

}
