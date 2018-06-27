package com.pydevdb.application.web;

import com.pydevdb.application.domain.YhZfbzHzrZfbzsqspb;
import com.pydevdb.application.service.YhZfbzHzrZfbzsqspbRepository;
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
public class YhZfbzHzrZfbzsqspbController {

    @Autowired
    private YhZfbzHzrZfbzsqspbRepository yhZfbzHzrZfbzsqspbRepository;

    @GetMapping("/YhZfbzHzrZfbzsqspb")
    public String yhZfbzHzrZfbzsqspbGet(Model model, Long businessid) {

        if (StringUtils.isEmpty(businessid)) {
            return "YhZfbzHzrZfbzsqspb";
        } else {
            List<YhZfbzHzrZfbzsqspb> listYhZfbzHzrZfbzsqspb = yhZfbzHzrZfbzsqspbRepository.findByBusinessid(businessid);
            model.addAttribute("listYhZfbzHzrZfbzsqspb", listYhZfbzHzrZfbzsqspb);
        }

        return "YhZfbzHzrZfbzsqspb";
    }

    @PostMapping("/YhZfbzHzrZfbzsqspb")
    public String yhZfbzHzrZfbzsqspbPost(Model model, @ModelAttribute YhZfbzHzrZfbzsqspb YhZfbzHzrZfbzsqspb) {

        yhZfbzHzrZfbzsqspbRepository.save(YhZfbzHzrZfbzsqspb);
        Optional<YhZfbzHzrZfbzsqspb> optionalYhZfbzHzrZfbzsqspb = yhZfbzHzrZfbzsqspbRepository
                .findById(YhZfbzHzrZfbzsqspb.getId());
        model.addAttribute("listYhZfbzHzrZfbzsqspb", optionalYhZfbzHzrZfbzsqspb.get());
        return "YhZfbzHzrZfbzsqspb";
    }
}
