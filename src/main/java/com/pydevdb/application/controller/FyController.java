package com.pydevdb.application.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FyController {

	@GetMapping(path = "/Fy")
	public String Controller(Model model, HttpServletRequest request) {

		return "Fy";
	}
}
