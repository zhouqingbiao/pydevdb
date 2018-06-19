package com.pydevdb.application.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pydevdb.application.domain.YhZfbzTpgYcxzfbt;

public interface YhZfbzTpgYcxzfbtRepository extends CrudRepository<YhZfbzTpgYcxzfbt, Long> {
    List<YhZfbzTpgYcxzfbt> findByBusinessid(Long businessid);
}