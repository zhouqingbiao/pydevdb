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

import com.pydevdb.application.domain.FyCommonTpuYwsqr;
import com.pydevdb.application.service.FyCommonTpuYwsqrRepository;

@Controller
public class FyCommonTpuYwsqrController {

    @Autowired
    private FyCommonTpuYwsqrRepository fyCommonTpuYwsqrRepository;

    @GetMapping("/FyCommonTpuYwsqr")
    public String fyCommonTpuYwsqrGet(Model model, @ModelAttribute FyCommonTpuYwsqr fyCommonTpuYwsqr) {

        if (StringUtils.isEmpty(fyCommonTpuYwsqr.getSqrmc()) && StringUtils.isEmpty(fyCommonTpuYwsqr.getZjhm())) {
            return "FyCommonTpuYwsqr";
        } else {
            List<FyCommonTpuYwsqr> listFyCommonTpuYwsqr = fyCommonTpuYwsqrRepository
                    .findBySqrmcLikeOrZjhm(fyCommonTpuYwsqr.getSqrmc(), fyCommonTpuYwsqr.getZjhm());

            model.addAttribute("listFyCommonTpuYwsqr", listFyCommonTpuYwsqr);
        }

        return "FyCommonTpuYwsqr";
    }

    @PostMapping("/FyCommonTpuYwsqr")
    public String fyCommonTpuYwsqrPost(Model model, @ModelAttribute FyCommonTpuYwsqr fyCommonTpuYwsqr) {

        fyCommonTpuYwsqrRepository.save(fyCommonTpuYwsqr);
        Optional<FyCommonTpuYwsqr> optionalFyCommonTpuYwsqr = fyCommonTpuYwsqrRepository
                .findById(fyCommonTpuYwsqr.getId());
        model.addAttribute("listFyCommonTpuYwsqr", optionalFyCommonTpuYwsqr.get());
        return "FyCommonTpuYwsqr";
    }
}
