package com.pydevdb.application.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(schema = "FY_COMMON", name = "TPU_YWSQR")
public class FyCommonTpuYwsqr implements Serializable {

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
}
