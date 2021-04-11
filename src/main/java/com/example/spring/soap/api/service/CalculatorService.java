package com.example.spring.soap.api.service;

import com.example.spring.soap.api.calculator.CalculatorRequest;
import com.example.spring.soap.api.calculator.CalculatorResponse;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

  public CalculatorResponse getCalculations(CalculatorRequest request) {
    String scenarioType = request.getScenarioType();
    int firstNumber = request.getFirstNumber();
    int secondNumber = request.getSecondNumber();
    CalculatorResponse calculationSoapCalculatorResponse = new CalculatorResponse();
    calculationSoapCalculatorResponse.setFirstNumber(firstNumber);
    calculationSoapCalculatorResponse.setSecondNumber(secondNumber);
    calculationSoapCalculatorResponse.setAddition(firstNumber + secondNumber);
    calculationSoapCalculatorResponse.setSubtraction(firstNumber - secondNumber);
    calculationSoapCalculatorResponse.setMultiplication(firstNumber * secondNumber);
    calculationSoapCalculatorResponse.setDivision(firstNumber / secondNumber);
    calculationSoapCalculatorResponse.setScenarioType(scenarioType);
    return calculationSoapCalculatorResponse;
  }
}
