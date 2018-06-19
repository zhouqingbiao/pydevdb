package com.pydevdb.application.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pydevdb.application.domain.CaCommonTpuYwsqr;

public interface CaCommonTpuYwsqrRepository extends CrudRepository<CaCommonTpuYwsqr, Long> {
    List<CaCommonTpuYwsqr> findBySqrmcLikeOrZjhm(String sqrmc, String zjhm);
}