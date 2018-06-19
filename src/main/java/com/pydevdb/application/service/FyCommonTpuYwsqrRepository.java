package com.pydevdb.application.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pydevdb.application.domain.FyCommonTpuYwsqr;

public interface FyCommonTpuYwsqrRepository extends CrudRepository<FyCommonTpuYwsqr, Long> {
    List<FyCommonTpuYwsqr> findBySqrmcLikeOrZjhm(String sqrmc, String zjhm);
}