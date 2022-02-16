package com.idbiintech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idbiintech.client.SoapClient;
import com.idbiintech.genFile.BalInqRequest;
import com.idbiintech.genFile.BalInqResponse;

@RestController
@RequestMapping("/finacleUBS")
public class BalanceController {
	@Autowired
	SoapClient soapClient;

	@GetMapping("/testFinacleBalanceApi")
	public String testtheApi() {

		return soapClient.getTest();

	}

	@PostMapping(value = "/getBalance", produces = { "application/json", "application/xml" })
	public BalInqResponse item(@RequestBody BalInqRequest itemRequest) {
		return soapClient.getItemInfo(itemRequest);
	}

	@PostMapping("/testFinacleBalanceApi1")
	public int testtheApi1(@RequestBody int id) {

		return soapClient.getTest1(id);

	}

}
