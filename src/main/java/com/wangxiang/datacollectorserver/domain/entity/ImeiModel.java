package com.wangxiang.datacollectorserver.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ImeiModel {

    @Id
    @Column(name = "imei", nullable = false, length = 15)
    private String imei;

    public ImeiModel(String imei) {
        this.imei = imei;
    }
}
