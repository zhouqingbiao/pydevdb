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

import com.pydevdb.application.domain.FyCommonTpgYwsqr;
import com.pydevdb.application.service.FyCommonTpgYwsqrRepository;

@Controller
public class FyCommonTpuYwsqrController {

	@Autowired
	private FyCommonTpgYwsqrRepository fyCommonTpgYwsqrRepository;

	@GetMapping("/FyCommonTpuYwsqr")
	public String fyCommonTpgYwsqrGet(Model model, @ModelAttribute FyCommonTpgYwsqr fyCommonTpgYwsqr) {

		if (StringUtils.isEmpty(fyCommonTpgYwsqr.getSqrmc()) && StringUtils.isEmpty(fyCommonTpgYwsqr.getZjhm())) {
			return "FyCommonTpuYwsqr";
		} else {
			List<FyCommonTpgYwsqr> listFyCommonTpgYwsqr = fyCommonTpgYwsqrRepository
					.findBySqrmcLikeOrZjhm(fyCommonTpgYwsqr.getSqrmc(), fyCommonTpgYwsqr.getZjhm());

			model.addAttribute("listFyCommonTpgYwsqr", listFyCommonTpgYwsqr);
		}

		return "FyCommonTpuYwsqr";
	}

	@PostMapping("/FyCommonTpuYwsqr")
	public String fyCommonTpgYwsqrPost(Model model, @ModelAttribute FyCommonTpgYwsqr fyCommonTpgYwsqr) {

		fyCommonTpgYwsqrRepository.save(fyCommonTpgYwsqr);
		Optional<FyCommonTpgYwsqr> optionalFyCommonTpgYwsqr = fyCommonTpgYwsqrRepository
				.findById(fyCommonTpgYwsqr.getId());
		model.addAttribute("listFyCommonTpgYwsqr", optionalFyCommonTpgYwsqr.get());
		return "FyCommonTpuYwsqr";
	}
}
