package com.pydevdb.application.web;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;

import com.pydevdb.application.domain.VClfhtTpeZrhtqd;
import com.pydevdb.application.service.VClfhtTpeZrhtqdRepository;

@Controller
public class VClfhtTpeZrhtqdController {

	@Autowired
	private VClfhtTpeZrhtqdRepository vClfhtTpeZrhtqdRepository;

	@GetMapping("/VClfhtTpeZrhtqd")
	public String vClfhtTpeZrhtqdGet(Model model, String fwzl) {

		List<VClfhtTpeZrhtqd> listVClfhtTpeZrhtqd;

		if (StringUtils.isEmpty(fwzl)) {
			listVClfhtTpeZrhtqd = vClfhtTpeZrhtqdRepository
					.findByHtqdsjBetweenOrderByHtqdsjDesc(LocalDate.now().minusWeeks(1), LocalDate.now().plusDays(1));
		} else {
			listVClfhtTpeZrhtqd = vClfhtTpeZrhtqdRepository.findByFwzlLikeOrderByHtqdsjDesc("%" + fwzl + "%");
		}

		model.addAttribute("fwzl", fwzl);
		model.addAttribute("listVClfhtTpeZrhtqd", listVClfhtTpeZrhtqd);

		return "VClfhtTpeZrhtqd";
	}

}
