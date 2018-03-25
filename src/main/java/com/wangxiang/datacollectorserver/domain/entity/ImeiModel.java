package com.wangxiang.datacollectorserver.domain.entity;





import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class ImeiModel {

    @Id
    @Column(name = "imei", nullable = false, length = 15)
    private String imei;

    public ImeiModel(String imei) {
        this.imei = imei;
    }

    public ImeiModel() {
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }
}
