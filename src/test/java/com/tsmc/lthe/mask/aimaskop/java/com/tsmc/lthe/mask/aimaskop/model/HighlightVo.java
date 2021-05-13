/**
 * 
 */
package com.tsmc.lthe.mask.aimaskop.model;

/**
 * @author fecabin
 *
 */
public class HighlightVo {

	private String item;
	private String almLvl;
	private String val;
	
	private String unit;
	private ChartVo trend;
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getAlmLvl() {
		return almLvl;
	}
	public void setAlmLvl(String almLvl) {
		this.almLvl = almLvl;
	}
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public ChartVo getTrend() {
		return trend;
	}
	public void setTrend(ChartVo trend) {
		this.trend = trend;
	}
	
	
}
