package com.pydevdb.application.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SlashController {

	@GetMapping(path = "/")
	public String Controller(Model model, HttpServletRequest request) {

		// IP
		model.addAttribute("RA", request.getRemoteAddr());

		return "Slash";
	}
}
