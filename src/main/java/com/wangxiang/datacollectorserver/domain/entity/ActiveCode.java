package com.wangxiang.datacollectorserver.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author xiang
 */

@Getter
@Setter
@NoArgsConstructor
@Entity
public class ActiveCode {
    @Id
    private Long activeCode;
    private int leftTime;

    //激活
    public boolean active() {
        if (leftTime>0) {
            leftTime --;
            return true;
        } else {
            return false;
        }
    }
}
