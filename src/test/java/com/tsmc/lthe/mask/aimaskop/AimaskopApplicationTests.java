package com.tsmc.lthe.mask.aimaskop;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.util.Assert;

import com.tsmc.lthe.mask.aimaskop.entity.CaseSummary;
import com.tsmc.lthe.mask.aimaskop.repository.CaseSummaryRepository;
import com.tsmc.lthe.mask.aimaskop.service.CaseCenterService;

@SpringBootTest
class AimaskopApplicationTests {

	
	@Autowired
	private CaseCenterService caseCenterService; 
	
	@MockBean
	private CaseSummaryRepository mockCaseSummaryRepository;
	@Test
	void contextLoads() {
		Assert.notNull(caseCenterService);
	}
	
	@Test
	void test() {
		Assert.isNull(caseCenterService.getAllCaseSummaries("A"));
	}

	
	@Test
	void test_query_case_by_case_id_success() {
	
		CaseSummary c=new CaseSummary();
		Mockito.when(mockCaseSummaryRepository.findById(Mockito.anyString())).thenReturn(Optional.of(c));
		Assert.isTrue("PROC".equals(caseCenterService.getAllCaseSummariesByCaseId("A").getProcStatus()));
	}
	@Test
	void test_query_case_by_case_id_no_result() {
	
		Mockito.when(mockCaseSummaryRepository.findById(Mockito.anyString())).thenReturn(null);
		Assert.isNull(caseCenterService.getAllCaseSummariesByCaseId("A").getProcStatus());
	}
	@Test
	void test_query_case_by_case_id_get() {
		
	
		Assert.notEmpty(caseCenterService.getAllCaseSummaries());
	}
	
	
}
