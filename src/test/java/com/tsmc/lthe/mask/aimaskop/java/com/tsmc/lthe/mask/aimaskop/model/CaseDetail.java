/**
 * 
 */
package com.tsmc.lthe.mask.aimaskop.model;

import java.util.List;

/**
 * @author fecabin
 *
 */
public class CaseDetail {

	
	private List<CaseProcess> process;
	private List<CaseDefect> defects;
	public List<CaseProcess> getProcess() {
		return process;
	}
	public void setProcess(List<CaseProcess> process) {
		this.process = process;
	}
	public List<CaseDefect> getDefects() {
		return defects;
	}
	public void setDefects(List<CaseDefect> defects) {
		this.defects = defects;
	}
	
}
