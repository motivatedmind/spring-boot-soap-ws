package com.example.spring.soap.api.endpoint;

import com.example.spring.soap.api.calculator.CalculatorRequest;
import com.example.spring.soap.api.calculator.CalculatorResponse;
import com.example.spring.soap.api.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CalculatorEndPoint {

  private static final String NAMESPACE = "http://www.example.com/spring/soap/api/calculator";
  @Autowired
  private CalculatorService service;

  @PayloadRoot(namespace = NAMESPACE, localPart = "CalculatorRequest")
  @ResponsePayload
  public CalculatorResponse getCalculations(@RequestPayload CalculatorRequest request) {
    return service.getCalculations(request);
  }

}
