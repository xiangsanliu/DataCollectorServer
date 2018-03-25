package com.wangxiang.datacollectorserver.domain.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author xiang
 */

@Entity
public class ActiveCode {
    @Id
    private Long activeCode;
    private int leftTime;

    public ActiveCode() {
    }

    //激活
    public boolean active() {
        if (leftTime>0) {
            leftTime --;
            return true;
        } else {
            return false;
        }
    }

    public Long getActiveCode() {
        return activeCode;
    }

    public void setActiveCode(Long activeCode) {
        this.activeCode = activeCode;
    }

    public int getLeftTime() {
        return leftTime;
    }

    public void setLeftTime(int leftTime) {
        this.leftTime = leftTime;
    }
}
