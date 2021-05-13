package com.tsmc.lthe.mask.aimaskop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tsmc.lthe.mask.aimaskop.model.CaseSummaryVo;
import com.tsmc.lthe.mask.aimaskop.service.CaseCenterService;


@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/report/casecenter")
public class CaseCenterController {

	@Autowired
	private CaseCenterService caseCenterService;
	
	@GetMapping("/casesummaries")
	public List<CaseSummaryVo> getCaseSummaries() {
		System.out.println("get ");
		return caseCenterService.getAllCaseSummaries();
	     
	}
	@GetMapping("/casesummariescond")
	public List<CaseSummaryVo> casesummariescond(@RequestParam String qryDtFrom,
			@RequestParam String qryDtTo,
			@RequestParam String qryMask)  {
		System.out.println("casesummariescond "+qryDtFrom);
		System.out.println("casesummariescond "+qryDtTo);
		System.out.println("casesummariescond "+qryMask);
		return caseCenterService.getAllCaseSummariesByCond(qryDtFrom,qryDtTo,qryMask);
	     
	}
	
	
	@GetMapping("/casesummariescondAfeter")
	public List<CaseSummaryVo> casesummariescondAfeter(@RequestParam String qryDtFrom,
			@RequestParam String qryDtTo,
			@RequestParam String qryMask)  {
		System.out.println("casesummariescondAfeter "+qryDtFrom);
		System.out.println("casesummariescondAfeter "+qryDtTo);
		System.out.println("casesummariescondAfeter "+qryMask);
		return caseCenterService.getAllCaseSummariesByCondAfter(qryDtFrom,qryDtTo,qryMask);
	     
	}
	
	@GetMapping("/updateDefectInfo")
	public boolean updateDefectInfo(@RequestParam String maskId,
			@RequestParam String inspStartDt,
			@RequestParam String defectId,
			@RequestParam String defectSize,
			@RequestParam String elementPredict,
			@RequestParam String elementActual,
			@RequestParam String isPrpDefect)  {
		
		 caseCenterService.updateDefect(maskId,inspStartDt,defectId,defectSize,elementPredict,elementActual,isPrpDefect);
	     return true;
	}
}
