package com.idbiintech.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.idbiintech.genFile.OutwardRemittanceLodgeRequest;
import com.idbiintech.genFile.OutwardRemittanceLodgeResponse;

@Service
public class SoapClient {

	public static Logger log = LoggerFactory.getLogger(SoapClient.class);

	@Autowired
	private Jaxb2Marshaller jaxb2Marshaller;

	private WebServiceTemplate webServiceTemplate;

	public OutwardRemittanceLodgeResponse getItemInfo(OutwardRemittanceLodgeRequest itemRequest) {
		webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
		log.info("Sending the request to Finacle FI --Soap Calling");
		return (OutwardRemittanceLodgeResponse) webServiceTemplate.marshalSendAndReceive("http://localhost:8080/ws",
				itemRequest);
	}

	public String getTest() {
		return "Finacle Orm Lodge API is working fine";
	}

}
