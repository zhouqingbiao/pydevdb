package com.pydevdb.application.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pydevdb.application.domain.VClfhtTpeZrhtqd;

public interface VClfhtTpeZrhtqdRepository extends JpaRepository<VClfhtTpeZrhtqd, Long> {
	List<VClfhtTpeZrhtqd> findByHtqdsjBetweenOrderByHtqdsjDesc(LocalDate HtqdsjAfter, LocalDate HtqdsjBefore);

	List<VClfhtTpeZrhtqd> findByFwzlLikeOrderByHtqdsjDesc(String fwzl);
}