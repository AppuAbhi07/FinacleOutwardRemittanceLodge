package com.idbiintech.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
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
import com.idbiintech.genFile.OutwardRemittanceLodgeRequest;
import com.idbiintech.genFile.OutwardRemittanceLodgeResponse;

@WebMvcTest(FinacleOutwardRemittanceLodgeController.class)
public class FinacleOutwardRemittanceLodgeControllerTest {

	@Autowired
	MockMvc mockMvc;

	@Autowired
	ObjectMapper mapper;

	@MockBean
	SoapClient sc;

	OutwardRemittanceLodgeRequest req = new OutwardRemittanceLodgeRequest();
	OutwardRemittanceLodgeResponse res = new OutwardRemittanceLodgeResponse();

	@Test
	public void testDetails() throws Exception {

		Mockito.when(sc.getItemInfo(any(OutwardRemittanceLodgeRequest.class))).thenReturn(res);
		
		res.setOutwardRemittanceLodgeCustomData("Test");

		String json = mapper.writeValueAsString(req);

		MvcResult result = mockMvc.perform(post("/finacleUBS/postOrmLodge").contentType(MediaType.APPLICATION_JSON)
				.characterEncoding("utf-8").content(json).accept(MediaType.APPLICATION_JSON)).andReturn();
		String content = result.getResponse().getContentAsString();
		System.out.println("content======================>>>>   " + content);

		mockMvc.perform(post("/finacleUBS/postOrmLodge").contentType(MediaType.APPLICATION_JSON)
				.characterEncoding("utf-8").content(json).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().is(200))
				.andExpect(jsonPath("$.outwardRemittanceLodgeCustomData", Matchers.equalTo("Test")));

	}

	@Test
	public void normaltest() throws Exception {
		Mockito.when(sc.getTest()).thenReturn("Finacle OrmLodge API is working fine" + new Date());

		mockMvc.perform(
				MockMvcRequestBuilders.get("/finacleUBS/postOrmLodgeTest").contentType(MediaType.APPLICATION_JSON))
				.andDo(print())

				.andExpect(status().isOk());
	}

	@Test
	void contextLoads() {
	}

}
