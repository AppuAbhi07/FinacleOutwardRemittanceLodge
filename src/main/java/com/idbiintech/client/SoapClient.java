package com.idbiintech.client;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.idbiintech.genFile.BalInqRequest;
import com.idbiintech.genFile.BalInqResponse;

@Service
public class SoapClient {

	@Autowired
	private Jaxb2Marshaller jaxb2Marshaller;

	private WebServiceTemplate webServiceTemplate;

	public BalInqResponse getItemInfo(BalInqRequest itemRequest) {
		webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
		return (BalInqResponse) webServiceTemplate.marshalSendAndReceive("http://localhost:8080/ws", itemRequest);
	}

	public String getTest() {
		return "Finacle Balance inquery API is working fine" + new Date();
	}

	public int getTest1(int id) {
		return id;
	}

}
