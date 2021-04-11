package com.javatechie.spring.soap.api.service;

import com.javatechie.spring.soap.api.loaneligibility.CalculationSoapRequestPOJO;
import com.javatechie.spring.soap.api.loaneligibility.CalculationSoapResponsePOJO;
import org.springframework.stereotype.Service;

@Service
public class LoanEligibilityService {

	public CalculationSoapResponsePOJO checkLoanEligibility(CalculationSoapRequestPOJO request) {
		String scenarioType = request.getScenarioType();
		int firstNumber = request.getFirstNumber();
		int secondNumber = request.getFirstNumber();
		CalculationSoapResponsePOJO calculationSoapResponsePOJO = new CalculationSoapResponsePOJO();
		calculationSoapResponsePOJO.setFirstNumber(firstNumber);
		calculationSoapResponsePOJO.setSecondNumber(secondNumber);
		calculationSoapResponsePOJO.setAddition(firstNumber + secondNumber);
		calculationSoapResponsePOJO.setSubtraction(firstNumber - secondNumber);
		calculationSoapResponsePOJO.setMultiplication(firstNumber * secondNumber);
		calculationSoapResponsePOJO.setDivision(firstNumber / secondNumber);
		return calculationSoapResponsePOJO;

		//AcknowledgementOld acknowledgement = new AcknowledgementOld();
		/*List<String> mismatchCriteriaList = acknowledgement.getCriteriaMismatch();

		if (!(request.getAge() > 30 && request.getAge() <= 60)) {
			mismatchCriteriaList.add("Person age should in between 30 to 60");
		}
		if (!(request.getYearlyIncome() > 200000)) {
			mismatchCriteriaList.add("minimum income should be more than 200000");
		}
		if (!(request.getCibilScore() > 500)) {
			mismatchCriteriaList.add("Low CIBIL Score please try after 6 month");
		}

		if (mismatchCriteriaList.size() > 0) {
			acknowledgement.setApprovedAmount(0);
			acknowledgement.setIsEligible(false);
		} else {
			acknowledgement.setApprovedAmount(500000);
			acknowledgement.setIsEligible(true);
			mismatchCriteriaList.clear();
		}*/
		//return acknowledgement;

	}

}
