package com.pydevdb.application.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pydevdb.application.domain.CaCommonTpuYwsqr;
import com.pydevdb.application.service.CaCommonTpuYwsqrRepository;

@Controller
public class CaCommonTpuYwsqrController {

    @Autowired
    private CaCommonTpuYwsqrRepository caCommonTpuYwsqrRepository;

    @GetMapping("/CaCommonTpuYwsqr")
    public String caCommonTpuYwsqrGet(Model model, @ModelAttribute CaCommonTpuYwsqr caCommonTpuYwsqr) {

        if (StringUtils.isEmpty(caCommonTpuYwsqr.getSqrmc()) && StringUtils.isEmpty(caCommonTpuYwsqr.getZjhm())) {
            return "CaCommonTpuYwsqr";
        } else {
            List<CaCommonTpuYwsqr> listCaCommonTpuYwsqr = caCommonTpuYwsqrRepository
                    .findBySqrmcLikeOrZjhm(caCommonTpuYwsqr.getSqrmc(), caCommonTpuYwsqr.getZjhm());

            model.addAttribute("listCaCommonTpuYwsqr", listCaCommonTpuYwsqr);
        }

        return "CaCommonTpuYwsqr";
    }

    @PostMapping("/CaCommonTpuYwsqr")
    public String caCommonTpuYwsqrPost(Model model, @ModelAttribute CaCommonTpuYwsqr caCommonTpuYwsqr) {

        caCommonTpuYwsqrRepository.save(caCommonTpuYwsqr);
        Optional<CaCommonTpuYwsqr> optionalCaCommonTpuYwsqr = caCommonTpuYwsqrRepository
                .findById(caCommonTpuYwsqr.getId());
        model.addAttribute("listCaCommonTpuYwsqr", optionalCaCommonTpuYwsqr.get());
        return "CaCommonTpuYwsqr";
    }
}
