package com.pydevdb.application.web;

import com.pydevdb.application.domain.YhCommonTpuYwsqr;
import com.pydevdb.application.service.YhCommonTpuYwsqrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class YhCommonTpuYwsqrController {

    @Autowired
    private YhCommonTpuYwsqrRepository yhCommonTpuYwsqrRepository;

    @GetMapping("/YhCommonTpuYwsqr")
    public String yhCommonTpuYwsqrGet(Model model, @ModelAttribute YhCommonTpuYwsqr yhCommonTpuYwsqr) {

        if (StringUtils.isEmpty(yhCommonTpuYwsqr.getSqrmc()) && StringUtils.isEmpty(yhCommonTpuYwsqr.getZjhm())) {
            return "YhCommonTpuYwsqr";
        } else {
            List<YhCommonTpuYwsqr> listYhCommonTpuYwsqr = yhCommonTpuYwsqrRepository
                    .findBySqrmcLikeOrZjhm(yhCommonTpuYwsqr.getSqrmc(), yhCommonTpuYwsqr.getZjhm());

            model.addAttribute("listYhCommonTpuYwsqr", listYhCommonTpuYwsqr);

        }

        return "YhCommonTpuYwsqr";
    }

    @PostMapping("/YhCommonTpuYwsqr")
    public String yhCommonTpuYwsqrPost(Model model, @ModelAttribute YhCommonTpuYwsqr yhCommonTpuYwsqr) {

        yhCommonTpuYwsqrRepository.save(yhCommonTpuYwsqr);
        Optional<YhCommonTpuYwsqr> optionalYhCommonTpuYwsqr = yhCommonTpuYwsqrRepository
                .findById(yhCommonTpuYwsqr.getId());
        model.addAttribute("listYhCommonTpuYwsqr", optionalYhCommonTpuYwsqr.get());
        return "YhCommonTpuYwsqr";
    }
}
