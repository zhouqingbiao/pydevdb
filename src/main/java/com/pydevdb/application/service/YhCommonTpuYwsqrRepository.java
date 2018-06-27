package com.pydevdb.application.service;

import com.pydevdb.application.domain.YhCommonTpuYwsqr;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface YhCommonTpuYwsqrRepository extends CrudRepository<YhCommonTpuYwsqr, Long> {
    List<YhCommonTpuYwsqr> findBySqrmcLikeOrZjhm(String sqrmc, String zjhm);
}