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

import com.pydevdb.application.domain.YhZfbzTpgGfcssqspb;
import com.pydevdb.application.service.YhZfbzTpgGfcssqspbRepository;

@Controller
public class YhZfbzTpgGfcssqspbController {

    @Autowired
    private YhZfbzTpgGfcssqspbRepository yhZfbzTpgGfcssqspbRepository;

    @GetMapping("/YhZfbzTpgGfcssqspb")
    public String yhZfbzTpgGfcssqspbGet(Model model, Long businessid) {

        if (StringUtils.isEmpty(businessid)) {
            return "YhZfbzTpgGfcssqspb";
        } else {
            List<YhZfbzTpgGfcssqspb> listYhZfbzTpgGfcssqspb = yhZfbzTpgGfcssqspbRepository.findByBusinessid(businessid);
            model.addAttribute("listYhZfbzTpgGfcssqspb", listYhZfbzTpgGfcssqspb);
        }

        return "YhZfbzTpgGfcssqspb";
    }

    @PostMapping("/YhZfbzTpgGfcssqspb")
    public String yhZfbzTpgGfcssqspbPost(Model model, @ModelAttribute YhZfbzTpgGfcssqspb YhZfbzTpgGfcssqspb) {

        yhZfbzTpgGfcssqspbRepository.save(YhZfbzTpgGfcssqspb);
        Optional<YhZfbzTpgGfcssqspb> optionalYhZfbzTpgGfcssqspb = yhZfbzTpgGfcssqspbRepository
                .findById(YhZfbzTpgGfcssqspb.getId());
        model.addAttribute("listYhZfbzTpgGfcssqspb", optionalYhZfbzTpgGfcssqspb.get());
        return "YhZfbzTpgGfcssqspb";
    }
}
