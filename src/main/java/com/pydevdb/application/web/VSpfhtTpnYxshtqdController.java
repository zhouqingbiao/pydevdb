package com.pydevdb.application.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;

import com.pydevdb.application.domain.VSpfhtTpnYxshtqd;
import com.pydevdb.application.service.VSpfhtTpnYxshtqdRepository;

@Controller
public class VSpfhtTpnYxshtqdController {

	@Autowired
	private VSpfhtTpnYxshtqdRepository vSpfhtTpnYxshtqdRepository;

	@GetMapping("/VSpfhtTpnYxshtqd")
	public String vSpfhtTpnYxshtqdGet(Model model, String fwzl) {

		if (StringUtils.isEmpty(fwzl)) {
			return "VSpfhtTpnYxshtqd";
		} else {
			List<VSpfhtTpnYxshtqd> listVSpfhtTpnYxshtqd = vSpfhtTpnYxshtqdRepository
					.findByFwzlLikeOrderByHtqdsjDesc("%" + fwzl + "%");

			model.addAttribute("fwzl", fwzl);
			model.addAttribute("listVSpfhtTpnYxshtqd", listVSpfhtTpnYxshtqd);
		}

		return "VSpfhtTpnYxshtqd";
	}
}