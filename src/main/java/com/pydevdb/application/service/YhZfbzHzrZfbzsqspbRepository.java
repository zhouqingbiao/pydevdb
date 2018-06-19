package com.pydevdb.application.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pydevdb.application.domain.YhZfbzHzrZfbzsqspb;

public interface YhZfbzHzrZfbzsqspbRepository extends CrudRepository<YhZfbzHzrZfbzsqspb, Long> {
    List<YhZfbzHzrZfbzsqspb> findByBusinessid(Long businessid);
}