package com.tsmc.lthe.mask.aimaskop.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.tsmc.lthe.mask.aimaskop.model.ChartVo;
import com.tsmc.lthe.mask.aimaskop.model.ExecDashboardVo;
import com.tsmc.lthe.mask.aimaskop.model.HighlightVo;
import com.tsmc.lthe.mask.aimaskop.model.PrpData;

@Component
public class ExecutiveDashboardService {

	
	
	private static List<PrpData> list=new ArrayList<>();

	
	public ExecDashboardVo getExecDashboard(Date st,Date ed) {
		ExecDashboardVo rtn=new ExecDashboardVo();
		
		
		List<HighlightVo> highLightList=new ArrayList<>();
		HighlightVo h1=new HighlightVo();
		h1.setAlmLvl("SUCCESS");
		h1.setItem("PRP(M101)");
		h1.setTrend(getPrpWeeklyTrend());
		h1.setUnit("ea");
		h1.setVal("4.3");
		
		highLightList.add(h1);
		HighlightVo h2=new HighlightVo();
		h2.setAlmLvl("DANGER");
		h2.setItem("PRP(W104)");
		h2.setTrend(getPrpWeeklyTrend());
		h2.setUnit("ea");
		h2.setVal("5.8");
		
		highLightList.add(h2);
		HighlightVo h3=new HighlightVo();
		h3.setAlmLvl("DANGER");
		h3.setItem("PRP(Worst Tool)");
		h3.setTrend(getPrpWeeklyTrend());
		h3.setUnit("ea");
		h3.setVal("6.3");
		
		highLightList.add(h3);
		
		HighlightVo h4=new HighlightVo();
		h4.setAlmLvl("WARN");
		h4.setItem("Pellicle Rupture OOS");
		h4.setTrend(getPrpWeeklyTrend());
		h4.setUnit("pc");
		h4.setVal("4");
		
		highLightList.add(h4);
		
		rtn.setHighLightList(highLightList);
		rtn.setPrpChartList(new ArrayList<>());
		rtn.getPrpChartList().add(getPrpMonthlyChart());
		rtn.getPrpChartList().add(getPrpWeeklyChart());
		rtn.getPrpChartList().add(getEleWeeklyChart());
		return rtn;
		
	}
	
	public ChartVo getPrpWeeklyTrend(){
		ChartVo v=new ChartVo();
		List<String> x=new ArrayList<>();
		List<List<String>> y=new ArrayList<>();
		List<String> y1=new ArrayList<>();//Wafer move
		List<String> y2=new ArrayList<>();//Prp
		
		v.setX(createWeek());
		
		y.add(y1);
		y.add(y2);
		y1.add("848");
		y1.add("851");
		y1.add("932");
		y1.add("1039");
		y1.add("1080");
		y1.add("932");
		y1.add("1160");
		y1.add("977");
		y1.add("1315");
		y1.add("1221");
		y1.add("1099");
		y1.add("1320");
		
		
		y2.add("3.9");
		y2.add("4.1");
		y2.add("3.6");
		y2.add("3.9");
		y2.add("5.1");
		y2.add("4.6");
		y2.add("4.9");
		y2.add("4.8");
		y2.add("5.5");
		y2.add("5.9");
		y2.add("5.7");
		y2.add("6.2");
		v.setTitle("PRP 2021Q2");
		v.setTitle("Overall");
		v.setY(y);
		
		
		return v;
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
	
	public List<PrpData> queryKPIByWeek(){
		
		List<PrpData> rtn=new ArrayList<>();
		
		
		
		rtn.add(getOverall());
		rtn.add(getAPE301());
		rtn.add(getAPE302());
		rtn.add(getAPE303());
		rtn.add(getAPE304());
		return rtn;
		
	}
	
	private PrpData getAPE301() {
		PrpData prpData=new PrpData();
	
		List<String> prp=new ArrayList<>();
		List<String> waferMove=new ArrayList<>();
		prpData.setPrp(prp);
		prpData.setTitle("PRP");
		prpData.setSubTitle("2021Q1 APE301");
		prpData.setWaferMove(waferMove);
		prpData.setWeekNo(createWeek());
		
		prp.add("0.3");
		prp.add("0");
		prp.add("0");
		prp.add("0");
		prp.add("0");
		prp.add("0.2");
		prp.add("0.2");
		prp.add("1.3");
		prp.add("1.2");
		prp.add("0.9");
		prp.add("0.5");
		prp.add("1.3");
		
		waferMove.add("36");
		waferMove.add("41");
		waferMove.add("60");
		waferMove.add("41");
		waferMove.add("86");
		waferMove.add("89");
		waferMove.add("75");
		waferMove.add("61");
		waferMove.add("79");
		waferMove.add("99");
		waferMove.add("96");
		waferMove.add("119");
		
		
		
		return prpData;
	}
	private PrpData getAPE302() {
		PrpData prpData=new PrpData();
	
		List<String> prp=new ArrayList<>();
		List<String> waferMove=new ArrayList<>();
		prpData.setPrp(prp);
		prpData.setTitle("PRP");
		prpData.setSubTitle("2021Q1 APE302");
		prpData.setWaferMove(waferMove);
		prpData.setWeekNo(createWeek());
		prp.add("3.5");
		prp.add("0.6");
		prp.add("1.4");
		prp.add("2.1");
		prp.add("1.6");
		prp.add("0.9");
		prp.add("1.3");
		prp.add("0.6");
		prp.add("0.9");
		prp.add("0.4");
		prp.add("0.3");
		prp.add("0.9");
		
		waferMove.add("39");
		waferMove.add("61");
		waferMove.add("20");
		waferMove.add("41");
		waferMove.add("86");
		waferMove.add("65");
		waferMove.add("125");
		waferMove.add("61");
		waferMove.add("69");
		waferMove.add("99");
		waferMove.add("11");
		waferMove.add("139");
		
		
		
		return prpData;
	}
	private PrpData getAPE303() {
		PrpData prpData=new PrpData();
	
		List<String> prp=new ArrayList<>();
		List<String> waferMove=new ArrayList<>();
		prpData.setPrp(prp);
		prpData.setTitle("PRP");
		prpData.setSubTitle("2021Q1 APE303");
		prpData.setWaferMove(waferMove);
		prpData.setWeekNo(createWeek());
		prp.add("0.3");
		prp.add("0");
		prp.add("0");
		prp.add("0");
		prp.add("0");
		prp.add("0.2");
		prp.add("0.2");
		prp.add("1.3");
		prp.add("1.2");
		prp.add("0.9");
		prp.add("0.5");
		prp.add("1.3");
		
		waferMove.add("36");
		waferMove.add("41");
		waferMove.add("60");
		waferMove.add("41");
		waferMove.add("86");
		waferMove.add("89");
		waferMove.add("75");
		waferMove.add("61");
		waferMove.add("79");
		waferMove.add("99");
		waferMove.add("96");
		waferMove.add("119");
		
		
		
		return prpData;
	}
	private PrpData getAPE304() {
		PrpData prpData=new PrpData();
	
		List<String> prp=new ArrayList<>();
		List<String> waferMove=new ArrayList<>();
		prpData.setPrp(prp);
		prpData.setTitle("PRP");
		prpData.setSubTitle("2021Q1 APE304");
		prpData.setWaferMove(waferMove);
		prpData.setWeekNo(createWeek());
		prp.add("0.3");
		prp.add("0");
		prp.add("0");
		prp.add("0");
		prp.add("0");
		prp.add("0.2");
		prp.add("0.2");
		prp.add("1.3");
		prp.add("1.2");
		prp.add("0.9");
		prp.add("0.5");
		prp.add("1.3");
		
		waferMove.add("36");
		waferMove.add("41");
		waferMove.add("60");
		waferMove.add("41");
		waferMove.add("86");
		waferMove.add("89");
		waferMove.add("75");
		waferMove.add("61");
		waferMove.add("79");
		waferMove.add("99");
		waferMove.add("96");
		waferMove.add("119");
		
		
		
		return prpData;
	}
	
	private PrpData getOverall(){
		
		PrpData prpOverall=new PrpData();
		List<String> prp=new ArrayList<>();
		List<String> waferMove=new ArrayList<>();
		List<String> weekNo=new ArrayList<>();
		prpOverall.setPrp(prp);
		prpOverall.setTitle("PRP");
		prpOverall.setSubTitle("2021Q1 Overall");
		
		prp.add("4.1");
		prp.add("3.9");
		prp.add("4.9");
		prp.add("6.1");
		prp.add("5.2");
		prp.add("4.3");
		prp.add("4.1");
		prp.add("4.8");
		prp.add("4.3");
		prp.add("4.4");
		prp.add("5.3");
		prp.add("4.6");
		
		waferMove.add("321");
		waferMove.add("251");
		waferMove.add("321");
		waferMove.add("471");
		waferMove.add("556");
		waferMove.add("589");
		waferMove.add("534");
		waferMove.add("410");
		waferMove.add("514");
		waferMove.add("475");
		waferMove.add("601");
		waferMove.add("569");
	
		
		prpOverall.setWaferMove(waferMove);
		prpOverall.setWeekNo(createWeek());
		return prpOverall;
		
	}
	
	private List<String> createWeek() {
		List<String> weekNo=new ArrayList<>();
		weekNo.add("W101");
		weekNo.add("W102");
		weekNo.add("W103");
		weekNo.add("W104");
		weekNo.add("W105");
		weekNo.add("W106");
		weekNo.add("W107");
		weekNo.add("W108");
		weekNo.add("W109");
		weekNo.add("W110");
		weekNo.add("W111");
		weekNo.add("W112");
		return weekNo;
	}
	
	
	
}
 