package com.pydevdb.application.service;

import com.pydevdb.application.domain.YhZfbzTpgYcxzfbt;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface YhZfbzTpgYcxzfbtRepository extends CrudRepository<YhZfbzTpgYcxzfbt, Long> {
    List<YhZfbzTpgYcxzfbt> findByBusinessid(Long businessid);
}