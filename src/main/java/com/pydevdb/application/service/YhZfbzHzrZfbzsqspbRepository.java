package com.pydevdb.application.service;

import com.pydevdb.application.domain.YhZfbzHzrZfbzsqspb;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface YhZfbzHzrZfbzsqspbRepository extends CrudRepository<YhZfbzHzrZfbzsqspb, Long> {
    List<YhZfbzHzrZfbzsqspb> findByBusinessid(Long businessid);
}