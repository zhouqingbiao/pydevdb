package com.pydevdb.application.web;

import com.pydevdb.application.domain.VSpfhtTpnYxshtqd;
import com.pydevdb.application.service.VSpfhtTpnYxshtqdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
public class VSpfhtTpnYxshtqdController {

    @Autowired
    private VSpfhtTpnYxshtqdRepository vSpfhtTpnYxshtqdRepository;

    @GetMapping("/VSpfhtTpnYxshtqd")
    public String vSpfhtTpnYxshtqdGet(Model model, String fwzl) {

        List<VSpfhtTpnYxshtqd> listVSpfhtTpnYxshtqd;

        if (StringUtils.isEmpty(fwzl)) {
            listVSpfhtTpnYxshtqd = vSpfhtTpnYxshtqdRepository
                    .findByHtqdsjBetweenOrderByHtqdsjDesc(LocalDate.now().minusWeeks(1), LocalDate.now().plusDays(1));
        } else {
            listVSpfhtTpnYxshtqd = vSpfhtTpnYxshtqdRepository.findByFwzlLikeOrderByHtqdsjDesc("%" + fwzl + "%");
        }

        model.addAttribute("fwzl", fwzl);
        model.addAttribute("listVSpfhtTpnYxshtqd", listVSpfhtTpnYxshtqd);

        return "VSpfhtTpnYxshtqd";
    }
}