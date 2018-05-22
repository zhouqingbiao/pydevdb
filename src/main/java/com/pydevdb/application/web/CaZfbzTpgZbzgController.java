package com.pydevdb.application.web;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pydevdb.application.domain.CaCommonTpuYwsqr;
import com.pydevdb.application.domain.CaCommonWfmsInstBusiness;
import com.pydevdb.application.domain.CaZfbzTpgZbzg;
import com.pydevdb.application.service.CaCommonTpuYwsqrRepository;
import com.pydevdb.application.service.CaCommonWfmsInstBusinessRepository;
import com.pydevdb.application.service.CaZfbzTpgZbzgRepository;

@Controller
public class CaZfbzTpgZbzgController {

	@Autowired
	private CaCommonTpuYwsqrRepository caCommonTpuYwsqrRepository;

	@Autowired
	private CaZfbzTpgZbzgRepository caZfbzTpgZbzgRepository;

	@Autowired
	private CaCommonWfmsInstBusinessRepository caCommonWfmsInstBusinessRepository;

	@GetMapping("/CaZfbzTpgZbzg")
	public String caZfbzTpgZbzgGet(Model model, @ModelAttribute CaZfbzTpgZbzg caZfbzTpgZbzg) {

		if (StringUtils.isEmpty(caZfbzTpgZbzg.getSqrxm()) && StringUtils.isEmpty(caZfbzTpgZbzg.getSqrsfzh())) {
			return "CaZfbzTpgZbzg";
		} else {
			List<CaZfbzTpgZbzg> listCaZfbzTpgZbzg = caZfbzTpgZbzgRepository
					.findBySqrxmLikeOrSqrsfzh(caZfbzTpgZbzg.getSqrxm(), caZfbzTpgZbzg.getSqrsfzh());

			model.addAttribute("listCaZfbzTpgZbzg", listCaZfbzTpgZbzg);
		}

		return "CaZfbzTpgZbzg";
	}

	@PostMapping("/CaZfbzTpgZbzg")
	public String caZfbzTpgZbzgPost(Model model, @ModelAttribute CaZfbzTpgZbzg caZfbzTpgZbzg) {

		caZfbzTpgZbzgRepository.save(caZfbzTpgZbzg);
		Optional<CaZfbzTpgZbzg> optionalCaZfbzTpgZbzg = caZfbzTpgZbzgRepository.findById(caZfbzTpgZbzg.getId());
		model.addAttribute("listCaZfbzTpgZbzg", optionalCaZfbzTpgZbzg.get());
		return "CaZfbzTpgZbzg";
	}

	@GetMapping("/CaZfbzTpgZbzgInsert")
	public String caZfbzTpgZbzgInsert(Model model, Long id, Long businessid) {

		List<CaZfbzTpgZbzg> listCaZfbzTpgZbzg = caZfbzTpgZbzgRepository.findByBusinessid(businessid);
		if (listCaZfbzTpgZbzg.isEmpty()) {
			CaZfbzTpgZbzg caZfbzTpgZbzg = new CaZfbzTpgZbzg();

			CaCommonWfmsInstBusiness caCommonWfmsInstBusiness = caCommonWfmsInstBusinessRepository.findById(businessid)
					.get();
			CaCommonTpuYwsqr caCommonTpuYwsqr = caCommonTpuYwsqrRepository.findById(id).get();

			caZfbzTpgZbzg.setZgzh(businessid.toString());
			caZfbzTpgZbzg.setBusinessid(businessid);
			caZfbzTpgZbzg.setZgzlb(caCommonWfmsInstBusiness.getBpcategorycode());
			caZfbzTpgZbzg.setSqrid(caCommonTpuYwsqr.getId());
			caZfbzTpgZbzg.setGszt(3);
			caZfbzTpgZbzg.setSfls(0);
			caZfbzTpgZbzg.setCjsj(new Date());
			caZfbzTpgZbzg.setSlrq(caCommonWfmsInstBusiness.getAccepttime());
			caZfbzTpgZbzg.setSqrxm(caCommonTpuYwsqr.getSqrmc());
			caZfbzTpgZbzg.setSqrsfzh(caCommonTpuYwsqr.getZjhm());

			model.addAttribute("listCaZfbzTpgZbzg", caZfbzTpgZbzgRepository.save(caZfbzTpgZbzg));

			String message = "资格证信息已生成！";
			model.addAttribute("message", message);
		} else {
			String message = "资格证信息已存在！";
			model.addAttribute("message", message);
		}

		return "CaZfbzTpgZbzg";
	}
}
