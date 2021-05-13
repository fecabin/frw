package com.tsmc.lthe.mask.aimaskop.service;


import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.google.gson.Gson;
import com.tsmc.lthe.mask.aimaskop.model.NasImgRespDto;
import com.tsmc.lthe.mask.aimaskop.model.NasImgRqstDto;

@SpringBootTest
public class NasImgServiceTest {

	
    @Autowired	
	private NasImgService nasImgService;
    
    
	@Test
    public void test()
    
    {
    	
    	NasImgRqstDto d=new NasImgRqstDto();
    	Map<String,String> m=new HashMap<String,String>();
    	m.put("1", "/nas/ab/");
    	d.setMap(m);
    	
    	NasImgRespDto resp=new NasImgRespDto();
    	Map<String,String> expectedMap=new HashMap<String,String>();
    	expectedMap.put("1", "a");
    	resp.setMap(expectedMap);
    	String expected=new Gson().toJson(resp);
    	
    	Assert.assertEquals(expected, nasImgService.getImages(new Gson().toJson(d) ));
    	
    	 
    }
    
}
