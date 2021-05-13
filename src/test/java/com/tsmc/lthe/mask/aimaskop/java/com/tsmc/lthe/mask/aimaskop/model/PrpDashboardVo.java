/**
 * 
 */
package com.tsmc.lthe.mask.aimaskop.model;

import java.util.List;

/**
 * @author fecabin
 *
 */
public class PrpDashboardVo {

	List<PrpInsp> inspData;
	
	PrpStatVo prpData;
	
	ChartVo prpMonthlyChart;
	ChartVo prpWeeklyChart;
	ChartVo eleOverviewChart;
	ChartVo eleWeeklyChart;
	
	List<ChartVo> prpByToolChart;
	

	public List<PrpInsp> getInspData() {
		return inspData;
	}

	public void setInspData(List<PrpInsp> inspData) {
		this.inspData = inspData;
	}


	public PrpStatVo getPrpData() {
		return prpData;
	}

	public void setPrpData(PrpStatVo prpData) {
		this.prpData = prpData;
	}

	public ChartVo getPrpMonthlyChart() {
		return prpMonthlyChart;
	}

	public void setPrpMonthlyChart(ChartVo prpMonthlyChart) {
		this.prpMonthlyChart = prpMonthlyChart;
	}

	public ChartVo getPrpWeeklyChart() {
		return prpWeeklyChart;
	}

	public void setPrpWeeklyChart(ChartVo prpWeeklyChart) {
		this.prpWeeklyChart = prpWeeklyChart;
	}

	public ChartVo getEleOverviewChart() {
		return eleOverviewChart;
	}

	public void setEleOverviewChart(ChartVo eleOverviewChart) {
		this.eleOverviewChart = eleOverviewChart;
	}

	public ChartVo getEleWeeklyChart() {
		return eleWeeklyChart;
	}

	public void setEleWeeklyChart(ChartVo eleWeeklyChart) {
		this.eleWeeklyChart = eleWeeklyChart;
	}

	public List<ChartVo> getPrpByToolChart() {
		return prpByToolChart;
	}

	public void setPrpByToolChart(List<ChartVo> prpByToolChart) {
		this.prpByToolChart = prpByToolChart;
	}


}

