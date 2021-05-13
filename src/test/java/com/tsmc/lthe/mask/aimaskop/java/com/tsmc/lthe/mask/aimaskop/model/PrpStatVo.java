package com.tsmc.lthe.mask.aimaskop.model;

import java.util.List;

import com.google.gson.JsonObject;

public class PrpStatVo {

	List<PrpStatData> prpData;
	
	List<String> dataByToolJson;

	private JsonObject[] data;

	public List<String> getDataByToolJson() {
		return dataByToolJson;
	}

	public void setDataByToolJson(List<String> dataByToolJson) {
		this.dataByToolJson = dataByToolJson;
	}

	public JsonObject[] getData() {
		return data;
	}

	public void setData(JsonObject[] data) {
		this.data = data;
	}

	public List<PrpStatData> getPrpData() {
		return prpData;
	}

	public void setPrpData(List<PrpStatData> prpData) {
		this.prpData = prpData;
	}
	
	
}
