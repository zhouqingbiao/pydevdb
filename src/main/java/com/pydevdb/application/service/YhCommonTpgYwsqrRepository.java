package com.pydevdb.application.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pydevdb.application.domain.YhCommonTpgYwsqr;

public interface YhCommonTpgYwsqrRepository extends CrudRepository<YhCommonTpgYwsqr, Long> {
	List<YhCommonTpgYwsqr> findBySqrmcLikeOrZjhm(String sqrmc, String zjhm);
}