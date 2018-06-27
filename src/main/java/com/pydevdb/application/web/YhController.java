package com.pydevdb.application.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class YhController {

    @GetMapping("/Yh")
    public String controller(Model model, HttpServletRequest request) {

        return "Yh";
    }
}
