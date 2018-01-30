package com.wangxiang.datacollectorserver.domain.dao;

import com.wangxiang.datacollectorserver.domain.entity.ActiveCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * @author xiang
 */
public interface ActiveCodeRepository extends JpaRepository<ActiveCode, Long> {
    /**
     * 返回激活码信息
     * @param activeCode 激活码
     * @return 激活码
     */
    ActiveCode findActiveCodeByActiveCode(Long activeCode);

    @Modifying
    @Query("update ActiveCode set leftTime = :leftTime where activeCode = :activeCode")
    void updateLeftTime(int leftTime, Long activeCode);
}
