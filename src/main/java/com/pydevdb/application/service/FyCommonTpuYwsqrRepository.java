package com.pydevdb.application.service;

import com.pydevdb.application.domain.FyCommonTpuYwsqr;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FyCommonTpuYwsqrRepository extends CrudRepository<FyCommonTpuYwsqr, Long> {
    List<FyCommonTpuYwsqr> findBySqrmcLikeOrZjhm(String sqrmc, String zjhm);
}