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

import com.pydevdb.application.domain.YhCommonTpgYwsqr;
import com.pydevdb.application.service.YhCommonTpgYwsqrRepository;

@Controller
public class YhCommonTpuYwsqrController {

	@Autowired
	private YhCommonTpgYwsqrRepository yhCommonTpgYwsqrRepository;

	@GetMapping("/YhCommonTpuYwsqr")
	public String yhCommonTpgYwsqrGet(Model model, @ModelAttribute YhCommonTpgYwsqr yhCommonTpgYwsqr) {

		if (StringUtils.isEmpty(yhCommonTpgYwsqr.getSqrmc()) && StringUtils.isEmpty(yhCommonTpgYwsqr.getZjhm())) {
			return "YhCommonTpuYwsqr";
		} else {
			List<YhCommonTpgYwsqr> listYhCommonTpgYwsqr = yhCommonTpgYwsqrRepository
					.findBySqrmcLikeOrZjhm(yhCommonTpgYwsqr.getSqrmc(), yhCommonTpgYwsqr.getZjhm());

			model.addAttribute("listYhCommonTpgYwsqr", listYhCommonTpgYwsqr);

		}

		return "YhCommonTpuYwsqr";
	}

	@PostMapping("/YhCommonTpuYwsqr")
	public String yhCommonTpgYwsqrPost(Model model, @ModelAttribute YhCommonTpgYwsqr yhCommonTpgYwsqr) {

		yhCommonTpgYwsqrRepository.save(yhCommonTpgYwsqr);
		Optional<YhCommonTpgYwsqr> optionalYhCommonTpgYwsqr = yhCommonTpgYwsqrRepository
				.findById(yhCommonTpgYwsqr.getId());
		model.addAttribute("listYhCommonTpgYwsqr", optionalYhCommonTpgYwsqr.get());
		return "YhCommonTpuYwsqr";
	}
}
