package com.tsmc.lthe.mask.aimaskop.model;

import java.util.List;

public class PrpData {

	
	private String title;//PRP (APE301)
	private String subTitle;//(APE301)
	private List<String> waferMove;
	private List<String> prp;
	private List<String> weekNo;
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
	public List<String> getWaferMove() {
		return waferMove;
	}
	public void setWaferMove(List<String> waferMove) {
		this.waferMove = waferMove;
	}
	public List<String> getPrp() {
		return prp;
	}
	public void setPrp(List<String> prp) {
		this.prp = prp;
	}
	public List<String> getWeekNo() {
		return weekNo;
	}
	public void setWeekNo(List<String> weekNo) {
		this.weekNo = weekNo;
	}
	
	
	
}
