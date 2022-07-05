package com.idbiintech.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idbiintech.client.SoapClient;
import com.idbiintech.genFile.OutwardRemittanceLodgeRequest;
import com.idbiintech.genFile.OutwardRemittanceLodgeResponse;

@RestController
@RequestMapping("/finacleUBS")
public class FinacleOutwardRemittanceLodgeController {

	public static Logger log = LoggerFactory.getLogger(FinacleOutwardRemittanceLodgeController.class);

	@Autowired
	SoapClient soapClient;

	@PostMapping(value = "/postOrmLodge", produces = { "application/json", "application/xml" })
	public OutwardRemittanceLodgeResponse item(@RequestBody OutwardRemittanceLodgeRequest itemRequest) {
		log.info("Calling OrmLodge API --Rest Call");

		
		/*Exception details needs to be written*/
		
		return soapClient.getItemInfo(itemRequest);
	}

	@GetMapping(value = "/postOrmLodgeTest", produces = { "application/json", "application/xml" })
	public String itemTest() {
		log.info("Calling ORM Lodge  test API--Rest Call");
		return soapClient.getTest();
	}

}
