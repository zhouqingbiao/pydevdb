package com.pydevdb.application.service;

import com.pydevdb.application.domain.CaZfbzTpgZbzg;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CaZfbzTpgZbzgRepository extends CrudRepository<CaZfbzTpgZbzg, Long> {
    List<CaZfbzTpgZbzg> findBySqrxmLikeOrSqrsfzh(String sqrxm, String sqrsfzh);

    List<CaZfbzTpgZbzg> findByBusinessid(Long businessid);
}