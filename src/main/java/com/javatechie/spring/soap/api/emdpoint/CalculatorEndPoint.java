package com.javatechie.spring.soap.api.emdpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.javatechie.spring.soap.api.loaneligibility.ResponsePOJO;
import com.javatechie.spring.soap.api.loaneligibility.RequestPOJO;
import com.javatechie.spring.soap.api.service.CalculatorService;

@Endpoint
public class CalculatorEndPoint {

	private static final String NAMESPACE = "http://www.javatechie.com/spring/soap/api/loanEligibility";
	@Autowired
	private CalculatorService service;

	@PayloadRoot(namespace = NAMESPACE, localPart = "CustomerRequest")
	@ResponsePayload
	public ResponsePOJO getLoanStatus(@RequestPayload RequestPOJO request) {
		return service.getCalculations(request);
	}

}
