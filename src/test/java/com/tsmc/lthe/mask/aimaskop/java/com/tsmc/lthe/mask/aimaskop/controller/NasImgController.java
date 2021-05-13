package com.tsmc.lthe.mask.aimaskop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tsmc.lthe.mask.aimaskop.model.PrpData;
import com.tsmc.lthe.mask.aimaskop.service.NasImgService;
@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/nasimg")
public class NasImgController {

	@Autowired
	private NasImgService nasImgService;
	@GetMapping("/getImages")
	public String getCaseSummaries(@RequestParam String str) {
		
		return nasImgService.getImages(str);
	     
	}
}
