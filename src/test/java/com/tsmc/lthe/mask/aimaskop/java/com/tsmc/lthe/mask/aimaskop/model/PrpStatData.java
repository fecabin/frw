package com.tsmc.lthe.mask.aimaskop.model;

public class PrpStatData {

	private String toolId;
	private String timeBlock;
	private String prp;
	private String criticalDftCnt;
	private String waferMove;
	private String scan;
	private String hitRate;
	private String hitCnt;
	public String getToolId() {
		return toolId;
	}
	public void setToolId(String toolId) {
		this.toolId = toolId;
	}
	public String getTimeBlock() {
		return timeBlock;
	}
	public void setTimeBlock(String timeBlock) {
		this.timeBlock = timeBlock;
	}
	public String getPrp() {
		return prp;
	}
	public void setPrp(String prp) {
		this.prp = prp;
	}
	public String getCriticalDftCnt() {
		return criticalDftCnt;
	}
	public void setCriticalDftCnt(String criticalDftCnt) {
		this.criticalDftCnt = criticalDftCnt;
	}
	public String getWaferMove() {
		return waferMove;
	}
	public void setWaferMove(String waferMove) {
		this.waferMove = waferMove;
	}
	public String getScan() {
		return scan;
	}
	public void setScan(String scan) {
		this.scan = scan;
	}
	public String getHitRate() {
		return hitRate;
	}
	public void setHitRate(String hitRate) {
		this.hitRate = hitRate;
	}
	public String getHitCnt() {
		return hitCnt;
	}
	public void setHitCnt(String hitCnt) {
		this.hitCnt = hitCnt;
	}
	
}
