package com.pydevdb.application.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pydevdb.application.domain.CaZfbzTpgZbzg;

public interface CaZfbzTpgZbzgRepository extends CrudRepository<CaZfbzTpgZbzg, Long> {
	List<CaZfbzTpgZbzg> findBySqrxmLikeOrSqrsfzh(String sqrxm, String sqrsfzh);

	List<CaZfbzTpgZbzg> findByBusinessid(Long businessid);
}