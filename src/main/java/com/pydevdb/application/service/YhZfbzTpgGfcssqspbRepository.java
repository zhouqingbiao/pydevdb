package com.pydevdb.application.service;

import com.pydevdb.application.domain.YhZfbzTpgGfcssqspb;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface YhZfbzTpgGfcssqspbRepository extends CrudRepository<YhZfbzTpgGfcssqspb, Long> {
    List<YhZfbzTpgGfcssqspb> findByBusinessid(Long businessid);
}