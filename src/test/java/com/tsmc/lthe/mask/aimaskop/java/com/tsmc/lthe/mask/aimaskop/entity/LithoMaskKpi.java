/**
 * 
 */
package com.tsmc.lthe.mask.aimaskop.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author fecabin
 *
 */


public class LithoMaskKpi {

	
	private String timeBlock;

	private String maskId;

	private String eqpId;

	private String kpiName;

	private BigDecimal val;

	public String getTimeBlock() {
		return timeBlock;
	}

	public void setTimeBlock(String timeBlock) {
		this.timeBlock = timeBlock;
	}

	public String getMaskId() {
		return maskId;
	}

	public void setMaskId(String maskId) {
		this.maskId = maskId;
	}

	public String getEqpId() {
		return eqpId;
	}

	public void setEqpId(String eqpId) {
		this.eqpId = eqpId;
	}

	public String getKpiName() {
		return kpiName;
	}

	public void setKpiName(String kpiName) {
		this.kpiName = kpiName;
	}

	public BigDecimal getVal() {
		return val;
	}

	public void setVal(BigDecimal val) {
		this.val = val;
	}
	
	
}
