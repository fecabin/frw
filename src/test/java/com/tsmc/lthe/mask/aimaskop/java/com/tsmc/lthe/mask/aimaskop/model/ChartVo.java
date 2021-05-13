/**
 * 
 */
package com.tsmc.lthe.mask.aimaskop.model;

import java.util.List;

/**
 * @author fecabin
 *
 */
public class ChartVo {

	private String title;
	private String subTitle;
	private List<String> x;
	private List<List<String>> y;
	private List<String> yName;
	private String yMax;
	private String yMin;
	
	public List<String> getX() {
		return x;
	}
	public void setX(List<String> x) {
		this.x = x;
	}
	
	public List<List<String>> getY() {
		return y;
	}
	public void setY(List<List<String>> y) {
		this.y = y;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public String getyMax() {
		return yMax;
	}
	public void setyMax(String yMax) {
		this.yMax = yMax;
	}
	public String getyMin() {
		return yMin;
	}
	public void setyMin(String yMin) {
		this.yMin = yMin;
	}
	public List<String> getyName() {
		return yName;
	}
	public void setyName(List<String> yName) {
		this.yName = yName;
	}
	
	
}



