package com.tsmc.lthe.mask.aimaskop.model;

import java.util.List;

public class CaseSummaryVo {

	
	
	
	private String procStatus;
	private int criticalDftCnt;
	
	
	private int onoDftCnt;
	
	private int pellicleDftCnt;
	private int rbiDftCnt;
	private int wiaNtoCnt;
	private int wiaRrCnt;
	private int wiaRequalCnt;
	private int maskOutOfCnt;
	private int pellicleRuptureCnt;
	private int rbiCenterCnt;
	private int rbiEdgeCnt;
	private int rbiBx100Cnt;
	
	
	List<CaseMain> criticalDftCases;
	
	public String getProcStatus() {
		return procStatus;
	}
	public void setProcStatus(String procStatus) {
		this.procStatus = procStatus;
	}
	public int getCriticalDftCnt() {
		return criticalDftCnt;
	}
	public void setCriticalDftCnt(int criticalDftCnt) {
		this.criticalDftCnt = criticalDftCnt;
	}
	public int getOnoDftCnt() {
		return onoDftCnt;
	}
	public void setOnoDftCnt(int onoDftCnt) {
		this.onoDftCnt = onoDftCnt;
	}
	public int getPellicleDftCnt() {
		return pellicleDftCnt;
	}
	public void setPellicleDftCnt(int pellicleDftCnt) {
		this.pellicleDftCnt = pellicleDftCnt;
	}
	public int getRbiDftCnt() {
		return rbiDftCnt;
	}
	public void setRbiDftCnt(int rbiDftCnt) {
		this.rbiDftCnt = rbiDftCnt;
	}
	public int getWiaNtoCnt() {
		return wiaNtoCnt;
	}
	public void setWiaNtoCnt(int wiaNtoCnt) {
		this.wiaNtoCnt = wiaNtoCnt;
	}
	public int getWiaRrCnt() {
		return wiaRrCnt;
	}
	public void setWiaRrCnt(int wiaRrCnt) {
		this.wiaRrCnt = wiaRrCnt;
	}
	public int getWiaRequalCnt() {
		return wiaRequalCnt;
	}
	public void setWiaRequalCnt(int wiaRequalCnt) {
		this.wiaRequalCnt = wiaRequalCnt;
	}
	public int getMaskOutOfCnt() {
		return maskOutOfCnt;
	}
	public void setMaskOutOfCnt(int maskOutOfCnt) {
		this.maskOutOfCnt = maskOutOfCnt;
	}
	public int getPellicleRuptureCnt() {
		return pellicleRuptureCnt;
	}
	public void setPellicleRuptureCnt(int pellicleRuptureCnt) {
		this.pellicleRuptureCnt = pellicleRuptureCnt;
	}
	public int getRbiCenterCnt() {
		return rbiCenterCnt;
	}
	public void setRbiCenterCnt(int rbiCenterCnt) {
		this.rbiCenterCnt = rbiCenterCnt;
	}
	public int getRbiEdgeCnt() {
		return rbiEdgeCnt;
	}
	public void setRbiEdgeCnt(int rbiEdgeCnt) {
		this.rbiEdgeCnt = rbiEdgeCnt;
	}
	public int getRbiBx100Cnt() {
		return rbiBx100Cnt;
	}
	public void setRbiBx100Cnt(int rbiBx100Cnt) {
		this.rbiBx100Cnt = rbiBx100Cnt;
	}
	public List<CaseMain> getCriticalDftCases() {
		return criticalDftCases;
	}
	public void setCriticalDftCases(List<CaseMain> criticalDftCases) {
		this.criticalDftCases = criticalDftCases;
	}

	
}
