package com.tsmc.lthe.mask.aimaskop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tsmc.lthe.mask.aimaskop.model.PrpDashboardVo;
import com.tsmc.lthe.mask.aimaskop.service.PrpDashboardService;


@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/report/prpDashboard")
public class PrpDashboardController {

	@Autowired
	private PrpDashboardService prpDashboardService;
	
	@GetMapping("/getPrpDashboardByCond")
	public PrpDashboardVo getPrpDashboardByCond(@RequestParam String qryDtFrom,
			@RequestParam String qryDtTo)  {
		System.out.println("casesummariescond "+qryDtFrom);
		System.out.println("casesummariescond "+qryDtTo);
		return prpDashboardService.getPrpDashboardByCond(qryDtFrom,qryDtTo);
	     
	}
	
}
