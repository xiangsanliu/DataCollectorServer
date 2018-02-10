package com.wangxiang.datacollectorserver.domain.dao;

import com.wangxiang.datacollectorserver.domain.entity.CitySellRent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author xiang
 */
public interface CitySellRentRepository extends JpaRepository<CitySellRent, Long> {
    /**
     * 从数据库中获取CitySelLRent
     *
     * @param id CitySellRentModel的id
     * @return CitySellRENT
     */
    CitySellRent findCitySellRentById(Long id);

    /**
     * 从数据库中获取CitySelLRent
     *
     * @param userId    userId
     * @param modelType modelType
     * @return CitySellRents
     */
    List<CitySellRent> findCitySellRentsByUserIdAndModelType(Long userId, int modelType);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "select new CitySellRent(city.userId,city.modelType) from CitySellRent city ",
            countQuery = "select count(city) from CitySellRent city")
    Page<CitySellRent> findCitySellRentsPageable(Pageable page);
}
