/**
 * 
 */
package com.tsmc.lthe.mask.aimaskop.model;

import java.util.List;

/**
 * @author fecabin
 *
 */
public class ExecDashboardVo {

	
	private List<HighlightVo> highLightList;
	
	private List<ChartVo> prpChartList;

	public List<HighlightVo> getHighLightList() {
		return highLightList;
	}

	public void setHighLightList(List<HighlightVo> highLightList) {
		this.highLightList = highLightList;
	}

	public List<ChartVo> getPrpChartList() {
		return prpChartList;
	}

	public void setPrpChartList(List<ChartVo> prpChartList) {
		this.prpChartList = prpChartList;
	}
	
	
}
