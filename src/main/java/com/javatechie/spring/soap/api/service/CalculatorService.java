package com.javatechie.spring.soap.api.service;

import com.javatechie.spring.soap.api.loaneligibility.Acknowledgement;
import com.javatechie.spring.soap.api.loaneligibility.CustomerRequest;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

  public Acknowledgement getCalculations(CustomerRequest request) {
    String scenarioType = request.getScenarioType();
    int firstNumber = request.getFirstNumber();
    int secondNumber = request.getSecondNumber();
    Acknowledgement calculationSoapResponsePOJO = new Acknowledgement();
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
