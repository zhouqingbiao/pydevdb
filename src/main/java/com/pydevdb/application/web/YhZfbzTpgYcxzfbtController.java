package com.pydevdb.application.web;

import com.pydevdb.application.domain.YhZfbzTpgYcxzfbt;
import com.pydevdb.application.service.YhZfbzTpgYcxzfbtRepository;
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
public class YhZfbzTpgYcxzfbtController {

    @Autowired
    private YhZfbzTpgYcxzfbtRepository yhZfbzTpgYcxzfbtRepository;

    @GetMapping("/YhZfbzTpgYcxzfbt")
    public String yhZfbzTpgYcxzfbtGet(Model model, Long businessid) {

        if (StringUtils.isEmpty(businessid)) {
            return "YhZfbzTpgYcxzfbt";
        } else {
            List<YhZfbzTpgYcxzfbt> listYhZfbzTpgYcxzfbt = yhZfbzTpgYcxzfbtRepository.findByBusinessid(businessid);
            model.addAttribute("listYhZfbzTpgYcxzfbt", listYhZfbzTpgYcxzfbt);
        }

        return "YhZfbzTpgYcxzfbt";
    }

    @PostMapping("/YhZfbzTpgYcxzfbt")
    public String yhZfbzTpgYcxzfbtPost(Model model, @ModelAttribute YhZfbzTpgYcxzfbt YhZfbzTpgYcxzfbt) {

        yhZfbzTpgYcxzfbtRepository.save(YhZfbzTpgYcxzfbt);
        Optional<YhZfbzTpgYcxzfbt> optionalYhZfbzTpgYcxzfbt = yhZfbzTpgYcxzfbtRepository
                .findById(YhZfbzTpgYcxzfbt.getId());
        model.addAttribute("listYhZfbzTpgYcxzfbt", optionalYhZfbzTpgYcxzfbt.get());
        return "YhZfbzTpgYcxzfbt";
    }
}
