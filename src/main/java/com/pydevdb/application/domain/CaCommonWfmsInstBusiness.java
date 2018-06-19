package com.pydevdb.application.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "CA_COMMON", name = "WFMS_INST_BUSINESS")
public class CaCommonWfmsInstBusiness implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String instprocessid;

    @Column
    private String businesstitle;

    @Column
    private String acceptcode;

    @Column
    private Date accepttime;

    @Column
    private String bpcategorycode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstprocessid() {
        return instprocessid;
    }

    public void setInstprocessid(String instprocessid) {
        this.instprocessid = instprocessid;
    }

    public String getBusinesstitle() {
        return businesstitle;
    }

    public void setBusinesstitle(String businesstitle) {
        this.businesstitle = businesstitle;
    }

    public String getAcceptcode() {
        return acceptcode;
    }

    public void setAcceptcode(String acceptcode) {
        this.acceptcode = acceptcode;
    }

    public Date getAccepttime() {
        return accepttime;
    }

    public void setAccepttime(Date accepttime) {
        this.accepttime = accepttime;
    }

    public String getBpcategorycode() {
        return bpcategorycode;
    }

    public void setBpcategorycode(String bpcategorycode) {
        this.bpcategorycode = bpcategorycode;
    }
}
