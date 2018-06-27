package com.pydevdb.application.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(schema = "YH_ZFBZ", name = "TPG_GFCSSQSPB")
public class YhZfbzTpgGfcssqspb implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Long businessid;

    @Column
    private Integer lsbz;

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

    public Integer getLsbz() {
        return lsbz;
    }

    public void setLsbz(Integer lsbz) {
        this.lsbz = lsbz;
    }
}