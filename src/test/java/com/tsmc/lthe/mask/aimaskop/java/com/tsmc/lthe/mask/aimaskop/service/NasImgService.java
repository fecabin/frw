package com.tsmc.lthe.mask.aimaskop.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.tsmc.lthe.mask.aimaskop.model.NasImgRespDto;
import com.tsmc.lthe.mask.aimaskop.model.NasImgRqstDto;

@Service
public class NasImgService {

	
	public String getImages(String str) {
		Gson g=new Gson();
		NasImgRespDto resp=new NasImgRespDto();
		NasImgRqstDto rqst= g.fromJson(str, NasImgRqstDto.class);
		Map<String,String> rtnMap=new HashMap<String,String>();
		resp.setMap(rtnMap);
		if(rqst.getMap()!=null && rqst.getMap().size()>0) {
			for(Map.Entry<String,String> o:rqst.getMap().entrySet()) {
				String defectId=o.getKey();
				String filePath=o.getValue();
				
				String imagebase64=getFileFromFtp(filePath);
				rtnMap.put(defectId, imagebase64);
			}
		}
		
		return  g.toJson(resp);
	}
	
	
	private String getFileFromFtp(String filePath) {
	
		String img="a";
		return img;
		
	}
	
}
