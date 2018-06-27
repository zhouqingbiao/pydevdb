package com.pydevdb.application.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(schema = "YH_ZFBZ", name = "HZR_ZFBZSQSPB")
public class YhZfbzHzrZfbzsqspb implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Long businessid;

    @Column
    private Integer yxdk;

    @Column
    private Integer ywlb;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Long businessid) {
        this.businessid = businessid;
    }

    public Integer getYxdk() {
        return yxdk;
    }

    public void setYxdk(Integer yxdk) {
        this.yxdk = yxdk;
    }

    public Integer getYwlb() {
        return ywlb;
    }

    public void setYwlb(Integer ywlb) {
        this.ywlb = ywlb;
    }
}