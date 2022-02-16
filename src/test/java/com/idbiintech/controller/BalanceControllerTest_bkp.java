package com.idbiintech.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.idbiintech.client.SoapClient;
import com.idbiintech.genFile.BalInqRequest;
import com.idbiintech.genFile.BalInqResponse;

@WebMvcTest(BalanceController.class)
public class BalanceControllerTest_bkp {

	@Autowired
	MockMvc mockMvc;
	@Autowired
	ObjectMapper mapper;
	@MockBean
	SoapClient sc;

	BalInqRequest balRequest = new BalInqRequest();
	BalInqResponse balResponse = new BalInqResponse();

	@Test
	public void testDetails() throws Exception {
		BalInqRequest balRequest = new BalInqRequest();
		BalInqResponse balResponse = new BalInqResponse();

		balResponse.setAcctCurr("INR");
		balResponse.setAcctId("123456789");
		balResponse.setAddr1("Plot No 29");
		balResponse.setAddr2("Belapur");
		balResponse.setAddr3("Mumbai");
		balResponse.setAddrType("Permenent");
		balResponse.setAmountValue(452555);
		balResponse.setBalType("Sabings");
		balResponse.setBankId("IBKL000183");
		balResponse.setBranchId("183");
		balResponse.setBranchName("Belapur");
		balResponse.setCity("Navi Mumbai");
		balResponse.setCountry("India");
		balResponse.setCurrencyCode("INR");
		balResponse.setName("Customer1");
		balResponse.setPostalCode("585155");
		balResponse.setSchmCode("test");
		balResponse.setSchmType("test");
		balResponse.setStateProv("MH");
		Mockito.when(sc.getItemInfo(any(BalInqRequest.class))).thenReturn(balResponse);

		String json = mapper.writeValueAsString(balRequest);
		System.out.println("json before sending the values " + json);

		MvcResult result = mockMvc.perform(post("/finacleUBS/getBalance").contentType(MediaType.APPLICATION_JSON)
				.characterEncoding("utf-8").content(json).accept(MediaType.APPLICATION_JSON)).andReturn();
		String content = result.getResponse().getContentAsString();
		System.out.println("content======================>>>>   " + content);
		mockMvc.perform(post("/finacleUBS/getBalance").contentType(MediaType.APPLICATION_JSON)
				.characterEncoding("utf-8").content(json).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().is(200))

				.andExpect(jsonPath("$.acctId", Matchers.equalTo("123456789")))
				.andExpect(jsonPath("$.bankId", Matchers.equalTo("IBKL000183")));

	}

	@Test
	public void normaltest() throws Exception {
		Mockito.when(sc.getTest()).thenReturn("Finacle Balance inquery is working fine*********** " + new Date());

		MvcResult result = mockMvc.perform(
				MockMvcRequestBuilders.get("/finacleUBS/testFinacleBalanceApi").contentType(MediaType.APPLICATION_JSON))
				.andReturn();

		String content = result.getResponse().getContentAsString();
		System.out.println("contentResult check======================>>>>   " + content);
		mockMvc.perform(
				MockMvcRequestBuilders.get("/finacleUBS/testFinacleBalanceApi").contentType(MediaType.APPLICATION_JSON))

				.andExpect(status().isOk());
	}

	@Test
	void contextLoads() {
	}

}
