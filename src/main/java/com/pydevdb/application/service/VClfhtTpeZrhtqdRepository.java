package com.pydevdb.application.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pydevdb.application.domain.VClfhtTpeZrhtqd;

public interface VClfhtTpeZrhtqdRepository extends JpaRepository<VClfhtTpeZrhtqd, Long> {
	List<VClfhtTpeZrhtqd> findByFwzlLikeOrderByHtqdsjDesc(String fwzl);
}