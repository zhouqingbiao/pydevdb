package com.pydevdb.application.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FyController {

    @GetMapping("/Fy")
    public String controller(Model model, HttpServletRequest request) {

        return "Fy";
    }
}
