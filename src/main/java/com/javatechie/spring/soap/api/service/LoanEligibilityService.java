package com.javatechie.spring.soap.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javatechie.spring.soap.api.loaneligibility.Acknowledgement;
import com.javatechie.spring.soap.api.loaneligibility.CustomerRequest;

@Service
public class LoanEligibilityService {

	public Acknowledgement checkLoanEligibility(CustomerRequest request) {
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
    return calculationSoapResponsePOJO;

	}

}
