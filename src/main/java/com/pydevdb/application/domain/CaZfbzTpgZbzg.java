package com.pydevdb.application.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(schema = "CA_ZFBZ", name = "TPG_ZBZG")
public class CaZfbzTpgZbzg implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "TPG_ZBZG_SEQUENCE", strategy = GenerationType.AUTO)
    @SequenceGenerator(schema = "CA_ZFBZ", name = "TPG_ZBZG_SEQUENCE", sequenceName = "TPG_ZBZG_SEQUENCE")
    private Long id;

    @Column
    private String zgzh;

    @Column
    private Long businessid;

    @Column
    private String zgzlb;

    @Column
    private Long sqrid;

    @Column
    private Integer gszt;

    @Column
    private Integer sfls;

    @Column
    private Date cjsj;

    @Column
    private Date slrq;

    @Column
    private String sqrxm;

    @Column
    private String sqrsfzh;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZgzh() {
        return zgzh;
    }

    public void setZgzh(String zgzh) {
        this.zgzh = zgzh;
    }

    public Long getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Long businessid) {
        this.businessid = businessid;
    }

    public String getZgzlb() {
        return zgzlb;
    }

    public void setZgzlb(String zgzlb) {
        this.zgzlb = zgzlb;
    }

    public Long getSqrid() {
        return sqrid;
    }

    public void setSqrid(Long sqrid) {
        this.sqrid = sqrid;
    }

    public Integer getGszt() {
        return gszt;
    }

    public void setGszt(Integer gszt) {
        this.gszt = gszt;
    }

    public Integer getSfls() {
        return sfls;
    }

    public void setSfls(Integer sfls) {
        this.sfls = sfls;
    }

    public Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }

    public Date getSlrq() {
        return slrq;
    }

    public void setSlrq(Date slrq) {
        this.slrq = slrq;
    }

    public String getSqrxm() {
        return sqrxm;
    }

    public void setSqrxm(String sqrxm) {
        this.sqrxm = sqrxm;
    }

    public String getSqrsfzh() {
        return sqrsfzh;
    }

    public void setSqrsfzh(String sqrsfzh) {
        this.sqrsfzh = sqrsfzh;
    }
}