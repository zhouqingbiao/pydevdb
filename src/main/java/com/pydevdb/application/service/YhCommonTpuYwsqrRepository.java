package com.pydevdb.application.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pydevdb.application.domain.YhCommonTpuYwsqr;

public interface YhCommonTpuYwsqrRepository extends CrudRepository<YhCommonTpuYwsqr, Long> {
    List<YhCommonTpuYwsqr> findBySqrmcLikeOrZjhm(String sqrmc, String zjhm);
}