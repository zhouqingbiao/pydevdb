package com.pydevdb.application.web;

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

		if (StringUtils.isEmpty(fwzl)) {
			return "VClfhtTpeZrhtqd";
		} else {
			List<VClfhtTpeZrhtqd> listVClfhtTpeZrhtqd = vClfhtTpeZrhtqdRepository
					.findByFwzlLikeOrderByHtqdsjDesc("%" + fwzl + "%");

			model.addAttribute("fwzl", fwzl);
			model.addAttribute("listVClfhtTpeZrhtqd", listVClfhtTpeZrhtqd);
		}

		return "VClfhtTpeZrhtqd";
	}

}
