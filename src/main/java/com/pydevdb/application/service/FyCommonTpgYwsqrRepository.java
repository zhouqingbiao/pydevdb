package com.pydevdb.application.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pydevdb.application.domain.FyCommonTpgYwsqr;

public interface FyCommonTpgYwsqrRepository extends CrudRepository<FyCommonTpgYwsqr, Long> {
	List<FyCommonTpgYwsqr> findBySqrmcLikeOrZjhm(String sqrmc, String zjhm);
}