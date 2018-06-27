package com.pydevdb.application.service;

import com.pydevdb.application.domain.VClfhtTpeZrhtqd;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface VClfhtTpeZrhtqdRepository extends JpaRepository<VClfhtTpeZrhtqd, Long> {
    List<VClfhtTpeZrhtqd> findByHtqdsjBetweenOrderByHtqdsjDesc(LocalDate HtqdsjAfter, LocalDate HtqdsjBefore);

    List<VClfhtTpeZrhtqd> findByFwzlLikeOrderByHtqdsjDesc(String fwzl);
}