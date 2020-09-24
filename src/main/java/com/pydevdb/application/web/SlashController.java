package com.pydevdb.application.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;

import com.pydevdb.application.PasswordGenerator;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SlashController {

	@GetMapping("/")
	public String controller(Model model, HttpServletRequest request, Boolean shift, Integer passwordLength) {

		// IP
		model.addAttribute("RA", request.getRemoteAddr());

		if (StringUtils.isEmpty(passwordLength)) {
			passwordLength = 20;
		}
		if (StringUtils.isEmpty(shift)) {
			shift = false;
		}

		// PASSWORD
		model.addAttribute("password", PasswordGenerator.getPassword(shift, passwordLength));

		model.addAttribute("shift", shift);

		model.addAttribute("passwordLength", passwordLength);

		return "Slash";
	}
}
