/**
 * 
 */
package com.tsmc.lthe.mask.aimaskop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsmc.lthe.mask.aimaskop.model.FuncTreeEnableVo;
import com.tsmc.lthe.mask.aimaskop.service.PortalCmmnService;

/**
 * @author fecabin
 *
 */

@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/report/portalCmmn")
public class PortalCmmnController {

	
	@Autowired
	private PortalCmmnService portalCmmnService;
	
	

	@GetMapping("/functionTreeEnable")
	public FuncTreeEnableVo functionTreeEnable() {
		
		return portalCmmnService.getFunctionTreeEnable();
	     
	}
}
