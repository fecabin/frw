/**
 * 
 */
package com.tsmc.lthe.mask.aimaskop.model;

/**
 * @author fecabin
 *
 */
public class PrpInsp {

	private String maskId;
	private String inspDt;
	private String lastInspDt;
	private String weekNo;
	private String monthNo;
	private int defect1CCnt;
	private int defect2CCnt;
	private String inspTool;
	private String elementConfirm;
	private String elementPredict;
	private String prpTool;
	private int prpDefectCnt;
	private int waferMove;

	public String getMaskId() {
		return maskId;
	}

	public void setMaskId(String maskId) {
		this.maskId = maskId;
	}

	public String getInspDt() {
		return inspDt;
	}

	public void setInspDt(String inspDt) {
		this.inspDt = inspDt;
	}

	public String getLastInspDt() {
		return lastInspDt;
	}

	public void setLastInspDt(String lastInspDt) {
		this.lastInspDt = lastInspDt;
	}

	public String getWeekNo() {
		return weekNo;
	}

	public void setWeekNo(String weekNo) {
		this.weekNo = weekNo;
	}

	public String getMonthNo() {
		return monthNo;
	}

	public void setMonthNo(String monthNo) {
		this.monthNo = monthNo;
	}

	public int getDefect1CCnt() {
		return defect1CCnt;
	}

	public void setDefect1CCnt(int defect1cCnt) {
		defect1CCnt = defect1cCnt;
	}

	public int getDefect2CCnt() {
		return defect2CCnt;
	}

	public void setDefect2CCnt(int defect2cCnt) {
		defect2CCnt = defect2cCnt;
	}

	public String getInspTool() {
		return inspTool;
	}

	public void setInspTool(String inspTool) {
		this.inspTool = inspTool;
	}

	public String getElementPredict() {
		return elementPredict;
	}

	public void setElementPredict(String elementPredict) {
		this.elementPredict = elementPredict;
	}

	public String getPrpTool() {
		return prpTool;
	}

	public void setPrpTool(String prpTool) {
		this.prpTool = prpTool;
	}

	public int getPrpDefectCnt() {
		return prpDefectCnt;
	}

	public void setPrpDefectCnt(int prpDefectCnt) {
		this.prpDefectCnt = prpDefectCnt;
	}

	public int getWaferMove() {
		return waferMove;
	}

	public void setWaferMove(int waferMove) {
		this.waferMove = waferMove;
	}
	
	
	
}

