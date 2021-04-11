package com.javatechie.spring.soap.api.endpoint;

import com.javatechie.spring.soap.api.loaneligibility.CalculationSoapRequestPOJO;
import com.javatechie.spring.soap.api.loaneligibility.CalculationSoapResponsePOJO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.javatechie.spring.soap.api.service.LoanEligibilityService;

@Endpoint
public class LoanEligibilityindicatorEndpoint {

	private static final String NAMESPACE = "http://www.javatechie.com/spring/soap/api/loanEligibility";
	@Autowired
	private LoanEligibilityService service;

	@PayloadRoot(namespace = NAMESPACE, localPart = "CalculationSoapRequestPOJO")
	@ResponsePayload
	public CalculationSoapResponsePOJO getLoanStatus(@RequestPayload CalculationSoapRequestPOJO request) {
		return service.checkLoanEligibility(request);
	}

}
