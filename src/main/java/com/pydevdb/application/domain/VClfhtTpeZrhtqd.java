package com.pydevdb.application.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "SCOTT", name = "V_CLFHT_TPE_ZRHTQD")
public class VClfhtTpeZrhtqd implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String fwzl;

	@Column
	private Double htmj;

	@Column
	private Double htje;

	@Column
	private Double dj;

	@Column
	private LocalDate htqdsj;

	@Column
	private String xzqh;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFwzl() {
		return fwzl;
	}

	public void setFwzl(String fwzl) {
		this.fwzl = fwzl;
	}

	public Double getHtmj() {
		return htmj;
	}

	public void setHtmj(Double htmj) {
		this.htmj = htmj;
	}

	public Double getHtje() {
		return htje;
	}

	public void setHtje(Double htje) {
		this.htje = htje;
	}

	public Double getDj() {
		return dj;
	}

	public void setDj(Double dj) {
		this.dj = dj;
	}

	public LocalDate getHtqdsj() {
		return htqdsj;
	}

	public void setHtqdsj(LocalDate htqdsj) {
		this.htqdsj = htqdsj;
	}

	public String getXzqh() {
		return xzqh;
	}

	public void setXzqh(String xzqh) {
		this.xzqh = xzqh;
	}
}