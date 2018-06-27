package com.pydevdb.application.service;

import com.pydevdb.application.domain.VSpfhtTpnYxshtqd;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface VSpfhtTpnYxshtqdRepository extends JpaRepository<VSpfhtTpnYxshtqd, Long> {
    List<VSpfhtTpnYxshtqd> findByHtqdsjBetweenOrderByHtqdsjDesc(LocalDate HtqdsjAfter,
                                                                LocalDate HtqdsjBefore);

    List<VSpfhtTpnYxshtqd> findByFwzlLikeOrderByHtqdsjDesc(String fwzl);
}