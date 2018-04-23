package com.pydevdb.application.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pydevdb.application.domain.YhZfbzTpgGfcssqspb;

public interface YhZfbzTpgGfcssqspbRepository extends CrudRepository<YhZfbzTpgGfcssqspb, Long> {
	List<YhZfbzTpgGfcssqspb> findByBusinessid(Long businessid);
}