/**
 * 
 */
package com.tsmc.lthe.mask.aimaskop.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.tsmc.lthe.mask.aimaskop.model.FuncTreeEnableVo;

/**
 * @author fecabin
 *
 */
@Service
public class PortalCmmnService {

	
	public FuncTreeEnableVo getFunctionTreeEnable() {
		FuncTreeEnableVo v=new FuncTreeEnableVo();
		
		Map<String,Boolean> map=new HashMap<String,Boolean>();
		
		map.put("execDashboard", true);
		map.put("caseCenter", true);
		map.put("prpDashboard", true);
		map.put("pellicleRuptue", true);
		
		v.setCaseCenter(true);
		v.setExecDashboard(true);
		v.setPellicleRupture(false);
		v.setX8uGldnAvailRpt(false);
		v.setPrpDashboard(true);
		v.setEopDriftAlmConfig(true);
		v.setX8uGldnConfig(false);
				
				
				
		return v;
		
	}
	
}
 