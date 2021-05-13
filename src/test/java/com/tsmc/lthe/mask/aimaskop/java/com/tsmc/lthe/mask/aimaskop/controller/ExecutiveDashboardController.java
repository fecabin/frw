package com.tsmc.lthe.mask.aimaskop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tsmc.lthe.mask.aimaskop.model.CaseSummaryVo;
import com.tsmc.lthe.mask.aimaskop.model.ChartVo;
import com.tsmc.lthe.mask.aimaskop.model.ExecDashboardVo;
import com.tsmc.lthe.mask.aimaskop.model.PrpData;
import com.tsmc.lthe.mask.aimaskop.service.CaseCenterService;
import com.tsmc.lthe.mask.aimaskop.service.ExecutiveDashboardService;

@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/report/exedashboard")
public class ExecutiveDashboardController {
	@Autowired
	private ExecutiveDashboardService executiveDashboardService;
	
	@GetMapping("/execdashboard")
	public List<PrpData> getCaseSummaries() {
		System.out.print("get ");
		return executiveDashboardService.queryKPIByWeek();
	     
	}
	
	@GetMapping("/prpWeeklyTrend")
	public ChartVo getPrpWeeklyTrend() {
		
		return executiveDashboardService.getPrpWeeklyTrend();
	     
	}
	@GetMapping("/qryExecDashboard")
	public ExecDashboardVo qryExecDashboard(@RequestParam String qryDtFrom,
			@RequestParam String qryDtTo) {
		
		return executiveDashboardService.getExecDashboard(null, null);
	     
	}
	
}
