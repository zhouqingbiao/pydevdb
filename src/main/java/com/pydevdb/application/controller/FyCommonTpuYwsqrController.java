package com.pydevdb.application.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pydevdb.application.entity.FyCommonTpgYwsqr;
import com.pydevdb.application.entity.FyCommonTpgYwsqrRepository;

@Controller
public class FyCommonTpuYwsqrController {

	@Autowired
	private FyCommonTpgYwsqrRepository fyCommonTpgYwsqrRepository;

	@GetMapping(path = "/FyCommonTpuYwsqr")
	public String fyCommonTpuYwsqrForm(Model model, @ModelAttribute FyCommonTpgYwsqr fyCommonTpgYwsqr) {

		List<FyCommonTpgYwsqr> listFyCommonTpgYwsqr = fyCommonTpgYwsqrRepository
				.findBySqrmcOrZjhm(fyCommonTpgYwsqr.getSqrmc(), fyCommonTpgYwsqr.getZjhm());

		model.addAttribute("listFyCommonTpgYwsqr", listFyCommonTpgYwsqr);

		return "FyCommonTpuYwsqr";
	}

	@PostMapping(path = "/FyCommonTpuYwsqr")
	public String fyCommonTpuYwsqrUpdate(Model model, @ModelAttribute FyCommonTpgYwsqr fyCommonTpgYwsqr) {

		fyCommonTpgYwsqrRepository.save(fyCommonTpgYwsqr);
		Optional<FyCommonTpgYwsqr> optionalFyCommonTpgYwsqr = fyCommonTpgYwsqrRepository
				.findById(fyCommonTpgYwsqr.getId());
		model.addAttribute("listFyCommonTpgYwsqr", optionalFyCommonTpgYwsqr.get());
		return "FyCommonTpuYwsqr";
	}
}
