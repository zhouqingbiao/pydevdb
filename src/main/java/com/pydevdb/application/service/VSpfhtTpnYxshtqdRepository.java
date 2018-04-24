package com.pydevdb.application.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pydevdb.application.domain.VSpfhtTpnYxshtqd;

public interface VSpfhtTpnYxshtqdRepository extends JpaRepository<VSpfhtTpnYxshtqd, Long> {
	List<VSpfhtTpnYxshtqd> findByFwzlLikeOrderByHtqdsjDesc(String fwzl);
}