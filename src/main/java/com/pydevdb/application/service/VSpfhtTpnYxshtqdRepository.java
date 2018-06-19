package com.pydevdb.application.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pydevdb.application.domain.VSpfhtTpnYxshtqd;

public interface VSpfhtTpnYxshtqdRepository extends JpaRepository<VSpfhtTpnYxshtqd, Long> {
    List<VSpfhtTpnYxshtqd> findByHtqdsjBetweenOrderByHtqdsjDesc(LocalDate HtqdsjAfter,
                                                                LocalDate HtqdsjBefore);

    List<VSpfhtTpnYxshtqd> findByFwzlLikeOrderByHtqdsjDesc(String fwzl);
}