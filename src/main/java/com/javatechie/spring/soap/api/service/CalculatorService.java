package com.javatechie.spring.soap.api.service;

import com.javatechie.spring.soap.api.loaneligibility.ResponsePOJO;
import com.javatechie.spring.soap.api.loaneligibility.RequestPOJO;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

  public ResponsePOJO getCalculations(RequestPOJO request) {
    String scenarioType = request.getScenarioType();
    int firstNumber = request.getFirstNumber();
    int secondNumber = request.getSecondNumber();
    ResponsePOJO calculationSoapResponsePOJO = new ResponsePOJO();
    calculationSoapResponsePOJO.setFirstNumber(firstNumber);
    calculationSoapResponsePOJO.setSecondNumber(secondNumber);
    calculationSoapResponsePOJO.setAddition(firstNumber + secondNumber);
    calculationSoapResponsePOJO.setSubtraction(firstNumber - secondNumber);
    calculationSoapResponsePOJO.setMultiplication(firstNumber * secondNumber);
    calculationSoapResponsePOJO.setDivision(firstNumber / secondNumber);
    calculationSoapResponsePOJO.setScenarioType(scenarioType);
    return calculationSoapResponsePOJO;

  }

}
