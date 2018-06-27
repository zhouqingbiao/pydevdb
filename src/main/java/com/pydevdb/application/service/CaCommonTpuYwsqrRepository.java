package com.pydevdb.application.service;

import com.pydevdb.application.domain.CaCommonTpuYwsqr;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CaCommonTpuYwsqrRepository extends CrudRepository<CaCommonTpuYwsqr, Long> {
    List<CaCommonTpuYwsqr> findBySqrmcLikeOrZjhm(String sqrmc, String zjhm);
}