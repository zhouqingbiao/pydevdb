package com.pydevdb.application.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "YH_COMMON", name = "TPU_YWSQR")
public class YhCommonTpuYwsqr implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String sqrmc;

    @Column
    private String zjhm;

    @Column
    private String lxsjhm;

    @Column
    private String dz;

    @Column
    private String gzdwmc;

    @Column
    private Long businessid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSqrmc() {
        return sqrmc;
    }

    public void setSqrmc(String sqrmc) {
        this.sqrmc = sqrmc;
    }

    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }

    public String getLxsjhm() {
        return lxsjhm;
    }

    public void setLxsjhm(String lxsjhm) {
        this.lxsjhm = lxsjhm;
    }

    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }

    public String getGzdwmc() {
        return gzdwmc;
    }

    public void setGzdwmc(String gzdwmc) {
        this.gzdwmc = gzdwmc;
    }

    public Long getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Long businessid) {
        this.businessid = businessid;
    }
}