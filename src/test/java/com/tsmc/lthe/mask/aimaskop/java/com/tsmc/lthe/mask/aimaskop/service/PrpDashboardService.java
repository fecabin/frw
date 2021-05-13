/**
 * 
 */
package com.tsmc.lthe.mask.aimaskop.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.tsmc.lthe.mask.aimaskop.model.CaseDefect;
import com.tsmc.lthe.mask.aimaskop.model.CaseDetail;
import com.tsmc.lthe.mask.aimaskop.model.CaseMain;
import com.tsmc.lthe.mask.aimaskop.model.CaseProcess;
import com.tsmc.lthe.mask.aimaskop.model.CaseSummaryVo;
import com.tsmc.lthe.mask.aimaskop.model.ChartVo;
import com.tsmc.lthe.mask.aimaskop.model.PrpDashboardVo;
import com.tsmc.lthe.mask.aimaskop.model.PrpInsp;
import com.tsmc.lthe.mask.aimaskop.model.PrpStatData;
import com.tsmc.lthe.mask.aimaskop.model.PrpStatVo;

/**
 * @author fecabin
 *
 */
@Service
public class PrpDashboardService {

	
	public PrpDashboardVo getPrpDashboardByCond(String from,String to){
		PrpDashboardVo rnt=new PrpDashboardVo();
		List<PrpInsp> inspData=new ArrayList<>();
		rnt.setInspData(inspData);
		
		PrpInsp insp=new PrpInsp();
		inspData.add(insp);
		insp.setDefect1CCnt(0);
		insp.setDefect2CCnt(1);
		insp.setElementPredict("Sn");
		insp.setInspDt("04/02 13:33");
		insp.setLastInspDt("04/01 16:50");
		insp.setInspTool("APM304");
		insp.setInspTool("APM304");
		
		
		rnt.setPrpData(getPrpdata());
		rnt.setPrpMonthlyChart(getPrpMonthlyChart());
		rnt.setPrpWeeklyChart(getPrpWeeklyChart());
		rnt.setEleOverviewChart(getEleOverview());
		rnt.setEleWeeklyChart(getEleWeeklyChart());
		rnt.setPrpByToolChart(getPrpByTooolChart());
		
		return rnt;
	}
	
	private ChartVo getPrpWeeklyChart(){
		
		ChartVo tool1Chart=new ChartVo();
		tool1Chart.setSubTitle("PRP");
		tool1Chart.setTitle("W101~W112");
		List<String> x=new ArrayList<>();
		String[] ary=new String[] {"W101","W102","W103","W104","W105","W106","W107","W108","W109","W110","W111","W112"};
		String[] prp=new String[] {"4.6","4.6","4.2","4.2","4.9","6.2","4.3","3.2","4.2","3.2","3.6","3.9"};
		String[] wm=new String[] {"83226","73651","85232","95766","78369","87019","89933","87628","85501","73365","92676","80567"};
		tool1Chart.setX(Arrays.asList(ary));
		List<List<String>> yList=new ArrayList<>();
		yList.add(Arrays.asList(prp));
		yList.add(Arrays.asList(wm));
		tool1Chart.setY(yList);
		return tool1Chart;
	}
	private ChartVo getPrpMonthlyChart(){
		ChartVo tool1Chart=new ChartVo();
		tool1Chart.setSubTitle("M101~M103");
		tool1Chart.setTitle("PRP");
		List<String> x=new ArrayList<>();
		String[] ary=new String[] {"M101","M102","M103"};
		String[] prp=new String[] {"4.6","4.6","4.2"};
		String[] wm=new String[] {"23122","21034","19460"};
		tool1Chart.setX(Arrays.asList(ary));
		List<List<String>> yList=new ArrayList<>();
		yList.add(Arrays.asList(prp));
		yList.add(Arrays.asList(wm));
		
		tool1Chart.setY(yList);
		tool1Chart.setyMax("25000");
		return tool1Chart;
		
		
	}
	
	private ChartVo getEleWeeklyChart(){
		ChartVo tool1Chart=new ChartVo();
		tool1Chart.setSubTitle("W101~W112");
		tool1Chart.setTitle("PRP");
		List<String> x=new ArrayList<>();
		String[] ele=new String[] {"SN","BN","C","RU","Others"};
		String[] ary=new String[] {"W101","W102","W103","W104","W105","W106","W107","W108","W109","W110","W111","W112"};
		String[] sn=new String[] {"20","20","40","36","30","40","50","40","60","40","34","31"};
		String[] bn=new String[] {"20","10","20","36","30","30","5","20","10","30","6","9"};
		String[] c=new String[] {"20","30","10","36","30","10","5","14","10","18","18","15"};
		String[] ru=new String[] {"20","20","10","36","6","10","10","10","10","2","32","25"};
		String[] others=new String[] {"20","20","10","4","10","30","16","10","10","10","20","55"};
		tool1Chart.setX(Arrays.asList(ary));
		List<List<String>> yList=new ArrayList<>();
		yList.add(Arrays.asList(sn));
		yList.add(Arrays.asList(bn));
		yList.add(Arrays.asList(c));
		yList.add(Arrays.asList(ru));
		yList.add(Arrays.asList(others));
		
		tool1Chart.setyName(Arrays.asList(ele));
		tool1Chart.setY(yList);
		tool1Chart.setyMax("100");
		return tool1Chart;
		
		
	}
	private ChartVo getEleOverview(){
		ChartVo tool1Chart=new ChartVo();
		tool1Chart.setSubTitle("W101~W112");
	
		String[] ele=new String[] {"SN","BN","C","RU","Others"};
		String[] sn=new String[] {"53","14","3","6","24"};
		tool1Chart.setX(Arrays.asList(ele));
		List<List<String>> yList=new ArrayList<>();
		yList.add(Arrays.asList(sn));
	
		tool1Chart.setyName(Arrays.asList(ele));
		tool1Chart.setY(yList);
		tool1Chart.setyMax("100");
		return tool1Chart;
		
		
	}
	private List<ChartVo> getPrpByTooolChart(){
		List<ChartVo> list=new ArrayList<>();
		ChartVo tool1Chart=new ChartVo();
	
		tool1Chart.setSubTitle("W101~W112");
		tool1Chart.setTitle("APE301");
		List<String> x=new ArrayList<>();
		String[] ary=new String[] {"W101","W102","W103","W104","W105","W106","W107","W108","W109","W110","W111","W112"};
		String[] prp=new String[] {"4.6","4.6","4.2","4.2","4.9","6.2","4.3","3.2","4.2","3.2","3.6","3.9"};
		String[] wm=new String[] {"13226","13651","12232","13766","13369","14019","13933","13680","12844","13365","12075","13587"};
		tool1Chart.setX(Arrays.asList(ary));
		List<List<String>> yList=new ArrayList<>();
		yList.add(Arrays.asList(prp));
		yList.add(Arrays.asList(wm));
		tool1Chart.setY(yList);
		tool1Chart.setyMax("20000");
		list.add(tool1Chart);
		ChartVo tool2Chart=new ChartVo();
		BeanUtils.copyProperties(tool1Chart, tool2Chart);
		tool2Chart.setTitle("APE302");
		ChartVo tool3Chart=new ChartVo();
		BeanUtils.copyProperties(tool1Chart, tool3Chart);
		tool3Chart.setTitle("APE303");
		ChartVo tool4Chart=new ChartVo();
		BeanUtils.copyProperties(tool1Chart, tool4Chart);
		tool4Chart.setTitle("APE304");
		ChartVo tool5Chart=new ChartVo();
		BeanUtils.copyProperties(tool1Chart, tool5Chart);
		tool5Chart.setTitle("APE305");
		list.add(tool2Chart);
		list.add(tool3Chart);

		list.add(tool4Chart);

		return list;
		
		
	}
	
	
	
	public PrpStatVo getPrpdata(){
		PrpStatVo vo=new PrpStatVo();
	
		List<PrpStatData> list=new ArrayList<>();
		PrpStatData d1=new PrpStatData();
		d1.setCriticalDftCnt("1");
		d1.setHitRate("20");
		d1.setPrp("4");
		d1.setScan("22");
		d1.setTimeBlock("M101");
		d1.setToolId("APE301");
		d1.setWaferMove("1000");
		d1.setHitCnt("4");
		list.add(d1);
		PrpStatData d2=new PrpStatData();
		d2.setCriticalDftCnt("1");
		d2.setHitRate("20");
		d2.setPrp("4");
		d2.setScan("22");
		d2.setTimeBlock("M101");
		d2.setToolId("APE302");
		d2.setWaferMove("900");
		d2.setHitCnt("3");
		list.add(d2);
		PrpStatData d3=new PrpStatData();
		d3.setCriticalDftCnt("1");
		d3.setHitRate("20");
		d3.setPrp("4");
		d3.setScan("22");
		d3.setTimeBlock("M102");
		d3.setToolId("APE301");
		d3.setWaferMove("3200");
		d3.setHitCnt("2");
		list.add(d3);
		PrpStatData d4=new PrpStatData();
		d4.setCriticalDftCnt("4");
		d4.setHitRate("10");
		d4.setPrp("12");
		d4.setScan("42");
		d4.setTimeBlock("M102");
		d4.setToolId("APE302");
		d4.setWaferMove("3000");
		d4.setHitCnt("1");
		list.add(d4);
		
		PrpStatData d5=new PrpStatData();
		d5.setCriticalDftCnt("1");
		d5.setHitRate("20");
		d5.setPrp("4");
		d5.setScan("10");
		d5.setTimeBlock("M103");
		d5.setToolId("APE301");
		d5.setWaferMove("4200");
		d5.setHitCnt("2");
		list.add(d5);
		PrpStatData d6=new PrpStatData();
		d6.setCriticalDftCnt("4");
		d6.setHitRate("10");
		d6.setPrp("12");
		d6.setScan("42");
		d6.setTimeBlock("M102");
		d6.setToolId("APE302");
		d6.setWaferMove("400");
		d6.setHitCnt("1");
		list.add(d6);
		
		vo.setPrpData(list);
		
		return vo;
	}
	
	public PrpStatVo getPrp(){
		PrpStatVo vo=new PrpStatVo();
		List<JsonObject> list=new ArrayList<>();
		
		List<String> jsonList=new ArrayList<>();
	   JsonArray ary=new JsonArray();
		vo.setDataByToolJson(jsonList);
		JsonObject o=new JsonObject();
		o.addProperty("toolId", "APE301");
		o.addProperty("M101WaferMove", "1000");
		o.addProperty("M101CriticalDftCnt", "4");
		o.addProperty("M101Prp", "4");
		o.addProperty("M101Scan", "20");
		o.addProperty("M101HitRate", "40");
		list.add(o);
		
		JsonObject o1=new JsonObject();
		o1.addProperty("toolId", "APE302");
		o1.addProperty("M101WaferMove", "1000");
		o1.addProperty("M101CriticalDftCnt", "4");
		o1.addProperty("M101Prp", "4");
		o1.addProperty("M101Scan", "20");
		o1.addProperty("M101HitRate", "40");
		list.add(o1);
		ary.add(o1);
		
		vo.setData(null);
		jsonList.add(o.toString());
		jsonList.add(o1.toString());
		return vo;
	}
	
//	public List<PrpStatVo> getPrpStatData(){
//		List<LithoMaskKpi> source=new ArrayList<>();
//		
//		
//		
//		
//		
//		List<PrpStatVo> rtn=new ArrayList<>();
//		PrpStatVo p=new PrpStatVo();
//		p.setTimeblock("M101");
//		p.setPrp("3");
//		p.setWaferMove("1000");
//		p.setCriticalDftCnt("3");
//		p.setToolId("APE301");
//		p.setHitCnt("5");
//		p.setHitRate("24%");
//		
//		PrpStatVo p1=new PrpStatVo();
//		p1.setTimeblock("W101");
//		p1.setPrp("3");
//		p1.setWaferMove("1000");
//		p1.setCriticalDftCnt("3");
//		p1.setToolId("APE301");
//		p1.setHitCnt("5");
//		p1.setHitRate("24%");
//		PrpStatVo p2=new PrpStatVo();
//		p2.setTimeblock("W102");
//		p2.setPrp("3");
//		p2.setWaferMove("1000");
//		p2.setCriticalDftCnt("3");
//		p2.setToolId("APE301");
//		p2.setHitCnt("5");
//		p2.setHitRate("24%");
//		PrpStatVo p3=new PrpStatVo();
//		p3.setTimeblock("W103");
//		p3.setPrp("3");
//		p3.setWaferMove("1000");
//		p3.setCriticalDftCnt("3");
//		p3.setToolId("APE301");
//		p3.setHitCnt("5");
//		p3.setHitRate("24%");
//		PrpStatVo p4=new PrpStatVo();
//		p4.setTimeblock("W103");
//		p4.setPrp("3");
//		p4.setWaferMove("1000");
//		p4.setCriticalDftCnt("3");
//		p4.setToolId("APE301");
//		p4.setHitCnt("5");
//		p4.setHitRate("24%");
//		rtn.add(p);
//		rtn.add(p1);
//		rtn.add(p2);
//		rtn.add(p3);
//		rtn.add(p4);
//		
//		
////		Map<String,List<>
////		if(!CollectionUtils.isEmpty(source)) {
////			for(LithoMaskKpi kpi:source) {
////				if() {
////					
////				}
////			}
////		}
////		
//		
//		return rtn;
//		
//	}
	
	private List<CaseMain> getCaseMain() {
		
		List<CaseMain> rtn=new ArrayList<>();
		CaseMain c1=new CaseMain();
		rtn.add(c1);
		c1.setCaseDate("2021/04/03 16:14:12");
		c1.setCaseMask("TMIG18-960A-5");
		CaseDetail caseDetail=new CaseDetail();
		
		 List<CaseProcess> process=new ArrayList<>();
		 List<CaseDefect> defects=new ArrayList<>();
		 CaseProcess p1=new CaseProcess();
		 p1.setProcDt("03/04 11:49");
		 p1.setProcName("ADC");
		 p1.setProcStatus("Success");
		 CaseProcess p2=new CaseProcess();
		 p2.setProcDt("03/04 12:00");
		 p2.setProcName("MDC");
		 p2.setProcStatus("Success");
		 process.add(p1);
		 process.add(p2);
		 
		 
		 
		 CaseDefect d1=new CaseDefect();
		 d1.setDefectCd("1C");
		 d1.setDefectId("1");
		 d1.setDefectSize("54");
		 d1.setElementActual("Sn");
		 d1.setElementPredict("Sn");
		 d1.setIsPrpDefect("Y");
		 d1.setLocX("6541.10");
		 d1.setLocY("9006.29");
		 d1.setImgX8UDftT("../assets/d2.png");
		 d1.setImgX8UDftR("../assets/d2.png");
		 d1.setImgX8URefT("../assets/d2.png");
		 d1.setImgX8URefR("../assets/d2.png");
		 d1.setElePredict("../assets/d2.png");
		 
		 
		 CaseDefect d2=new CaseDefect();
		 d2.setDefectCd("1C");
		 d2.setDefectId("2");
		 d2.setDefectSize("53");
		 d2.setElementActual("");
		 d2.setElementPredict("BN");
		 d2.setIsPrpDefect("N");
		 d2.setLocX("3221.10");
		 d2.setLocY("12355.44");
		 d2.setImgX8UDftT("../assets/d2.png");
		 d2.setImgX8UDftR("../assets/d2.png");
		 d2.setImgX8URefT("../assets/d2.png");
		 d2.setImgX8URefR("../assets/d2.png");
		 d2.setElePredict("../assets/d2.png");
		 
		 defects.add(d1);
		 defects.add(d2);
		caseDetail.setDefects(defects);
		caseDetail.setProcess(process);
		c1.setCaseDetail(caseDetail);
		
		return rtn;
		
	}
	
	public List<CaseSummaryVo> getAllCaseSummaries(){
		List<CaseSummaryVo> rtn=new ArrayList<>();
		CaseSummaryVo caseNew=new CaseSummaryVo();
		CaseSummaryVo caseProc=new CaseSummaryVo();
		CaseSummaryVo caseClosed=new CaseSummaryVo();
		caseNew.setProcStatus("New");
		
		caseNew.setCriticalDftCnt(2);
		caseNew.setOnoDftCnt(2);
		caseNew.setPellicleDftCnt(1);
		
		caseNew.setWiaNtoCnt(3);
		caseNew.setWiaRrCnt(2);
		caseNew.setWiaRequalCnt(4);
		
		caseNew.setRbiCenterCnt(0);
		caseNew.setRbiEdgeCnt(2);
		caseProc.setRbiBx100Cnt(2);
		
		caseNew.setMaskOutOfCnt(0);
		caseNew.setPellicleRuptureCnt(0);
		
		caseProc.setProcStatus("Processing");
		caseProc.setCriticalDftCnt(3); 
		caseProc.setCriticalDftCnt(2);
		caseProc.setOnoDftCnt(2);
		caseProc.setPellicleDftCnt(1);
		
		caseProc.setWiaNtoCnt(3);
		caseProc.setWiaRrCnt(2);
		caseProc.setWiaRequalCnt(4);
		
		caseProc.setRbiCenterCnt(0);
		caseProc.setRbiEdgeCnt(2);
		caseProc.setRbiBx100Cnt(4);
		
		caseProc.setMaskOutOfCnt(0);
		caseProc.setPellicleRuptureCnt(0);
		
		
		
		caseClosed.setProcStatus("Closed");
		caseClosed.setCriticalDftCnt(5);
		
		caseClosed.setCriticalDftCnt(3);
		caseClosed.setCriticalDftCnt(2);
		caseClosed.setOnoDftCnt(2);
		caseClosed.setPellicleDftCnt(1);
		
		caseClosed.setWiaNtoCnt(3);
		caseClosed.setWiaRrCnt(2);
		caseClosed.setWiaRequalCnt(4);
		
		caseClosed.setRbiCenterCnt(0);
		caseClosed.setRbiEdgeCnt(3);
		caseClosed.setRbiBx100Cnt(3);
		
		caseClosed.setMaskOutOfCnt(1);
		caseClosed.setPellicleRuptureCnt(0);
		
		
		rtn.add(caseNew);
		rtn.add(caseProc);
		rtn.add(caseClosed);
		return rtn;
	}
	
}

