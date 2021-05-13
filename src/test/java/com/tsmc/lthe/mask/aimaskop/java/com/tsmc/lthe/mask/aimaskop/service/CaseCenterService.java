/**
 * 
 */
package com.tsmc.lthe.mask.aimaskop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.tsmc.lthe.mask.aimaskop.entity.CaseSummary;
import com.tsmc.lthe.mask.aimaskop.model.CaseDefect;
import com.tsmc.lthe.mask.aimaskop.model.CaseDetail;
import com.tsmc.lthe.mask.aimaskop.model.CaseMain;
import com.tsmc.lthe.mask.aimaskop.model.CaseProcess;
import com.tsmc.lthe.mask.aimaskop.model.CaseSummaryVo;
import com.tsmc.lthe.mask.aimaskop.repository.CaseSummaryRepository;

/**
 * @author fecabin
 *
 */
@Service
public class CaseCenterService {
	@Autowired
	private CaseSummaryRepository caseSummaryRepository;
	
	public CaseSummaryVo getAllCaseSummariesByCaseId(String caseId){
	
		CaseSummaryVo caseVo=new CaseSummaryVo();
		Optional<CaseSummary> reuslts=caseSummaryRepository.findById(caseId);
		if(reuslts!=null) {
			caseVo.setProcStatus("PROC");
		}
		
		return caseVo;
	}
	
	
	
	public List<CaseSummaryVo> getAllCaseSummaries(String caseId){
		List<CaseSummaryVo> rtn=null;
		caseSummaryRepository.findAll();
		
		
		
		return rtn;
	}
	public void updateDefect(String maskId,
		 String inspStartDt,
		 String defectId,
			String defectSize,
			String elementPredict,
		 String elementActual,
			 String isPrpDefect){
		
		//Find Defect
		
		
		//Update Defect Result
		
		
		
		
		
	}
	
	
	public List<CaseSummaryVo> getAllCaseSummariesByCond(String from,String to,String maskId){
		
		List<CaseSummaryVo> rtn=new ArrayList<>();
		CaseSummaryVo caseNew=new CaseSummaryVo();
		CaseSummaryVo caseProc=new CaseSummaryVo();
		CaseSummaryVo caseClosed=new CaseSummaryVo();
		caseNew.setProcStatus("New");
		caseNew.setCriticalDftCnt(1);
		caseNew.setCriticalDftCases(getCaseMain());
		caseProc.setProcStatus("Processing");
		caseProc.setCriticalDftCnt(2);
		caseProc.setCriticalDftCases(getCaseMain());
		caseClosed.setProcStatus("Closed");
		caseClosed.setCriticalDftCnt(3);
		caseProc.setCriticalDftCases(getCaseMain());
		rtn.add(caseNew);
		rtn.add(caseProc);
		rtn.add(caseClosed);
		
		
		
		
		return rtn;
	}

	public List<CaseSummaryVo> getAllCaseSummariesByCondAfter(String from,String to,String maskId){
		
		List<CaseSummaryVo> rtn=new ArrayList<>();
		CaseSummaryVo caseNew=new CaseSummaryVo();
		CaseSummaryVo caseProc=new CaseSummaryVo();
		CaseSummaryVo caseClosed=new CaseSummaryVo();
		caseNew.setProcStatus("New");
		caseNew.setCriticalDftCnt(1);
		caseNew.setCriticalDftCases(getCaseMainAfter());
		caseProc.setProcStatus("Processing");
		caseProc.setCriticalDftCnt(2);
		caseProc.setCriticalDftCases(getCaseMainAfter());
		caseClosed.setProcStatus("Closed");
		caseClosed.setCriticalDftCnt(0);
		caseProc.setCriticalDftCases(getCaseMainAfter());
		rtn.add(caseNew);
		rtn.add(caseProc);
		rtn.add(caseClosed);
		
		
		
		
		return rtn;
	}
	
	private List<CaseMain> getCaseMain() {
		
		List<CaseMain> rtn=new ArrayList<>();
		CaseMain c1=new CaseMain();
		CaseMain c2=new CaseMain();
		rtn.add(c1);
		rtn.add(c2);
		c1.setCaseDate("2021/04/03 16:14:12");
		c1.setCaseMask("TMIG18-960A-5");
		c2.setCaseDate("2021/04/02 16:14:12");
		c2.setCaseMask("TMILR-990A-5");
		
		CaseDetail caseDetail=new CaseDetail();
		
		 List<CaseProcess> process=new ArrayList<>();
		 List<CaseDefect> defects=new ArrayList<>();
		 CaseProcess p1=new CaseProcess();
		 p1.setProcDt("03/04 11:49");
		 p1.setProcName("ADC");
		 p1.setProcStatus("COMPLETED");
		 CaseProcess p2=new CaseProcess();
		 p2.setProcDt("03/04 12:00");
		 p2.setProcName("MDC");
		 p2.setProcStatus("COMPLETED");
		 CaseProcess p3=new CaseProcess();
		 p3.setProcDt("03/04 12:00");
		 p3.setProcName("Element Prediction");
		 p3.setProcStatus("ERROR");
		 CaseProcess p4=new CaseProcess();
		 p4.setProcDt("03/04 12:00");
		 p4.setProcName("WIA");
		 p4.setProcStatus("PROCESSING");
		 CaseProcess p5=new CaseProcess();
		 p5.setProcDt("03/04 12:00");
		 p5.setProcName("Potential Lot");
		 p5.setProcStatus("WAIT");
		 CaseProcess p6=new CaseProcess();
		 p6.setProcDt("03/04 12:00");
		 p6.setProcName("Closed");
		 p6.setProcStatus("WAIT");
		 process.add(p1);
		 process.add(p2);
		 process.add(p3);
		 process.add(p4);
		 process.add(p5);
		 process.add(p6);
		 
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
		 d2.setIsPrpDefect("Y");
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
		
		CaseDetail caseDetail2=new CaseDetail();
		
		caseDetail2.setProcess(process);
		caseDetail2.setDefects(defects);
		
		c2.setCaseDetail(caseDetail2);
		
		return rtn;
		
	}
	private List<CaseMain> getCaseMainAfter() {
		
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
		 p1.setProcStatus("COMPLETED");
		 CaseProcess p2=new CaseProcess();
		 p2.setProcDt("03/04 12:00");
		 p2.setProcName("MDC");
		 p2.setProcStatus("COMPLETED");
		 CaseProcess p3=new CaseProcess();
		 p3.setProcDt("03/04 12:00");
		 p3.setProcName("Element Prediction");
		 p3.setProcStatus("ERROR");
		 CaseProcess p4=new CaseProcess();
		 p4.setProcDt("03/04 12:00");
		 p4.setProcName("WIA");
		 p4.setProcStatus("PROCESSING");
		 CaseProcess p5=new CaseProcess();
		 p5.setProcDt("03/04 12:00");
		 p5.setProcName("Potential Lot");
		 p5.setProcStatus("WAIT");
		 CaseProcess p6=new CaseProcess();
		 p6.setProcDt("03/04 12:00");
		 p6.setProcName("Closed");
		 p6.setProcStatus("WAIT");
		 process.add(p1);
		 process.add(p2);
		 process.add(p3);
		 process.add(p4);
		 process.add(p5);
		 process.add(p6);
		 
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
		 d2.setElementActual("C");
		 d2.setElementPredict("C");
		 d2.setIsPrpDefect("Y");
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

