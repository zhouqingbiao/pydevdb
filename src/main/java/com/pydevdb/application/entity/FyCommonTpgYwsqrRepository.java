package com.pydevdb.application.entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface FyCommonTpgYwsqrRepository extends CrudRepository<FyCommonTpgYwsqr, Long> {
	List<FyCommonTpgYwsqr> findBySqrmcOrZjhm(String sqrmc, String zjhm);

}
