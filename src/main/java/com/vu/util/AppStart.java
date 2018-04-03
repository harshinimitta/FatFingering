package com.vu.util;

import java.util.List;
import java.util.Map;

public class AppStart {

	public static void main(String[] args) {
		String actualPin = "4873";
		String pinEntered = "4273";
		IKeyPad atmKeyPad = new ATMKeyPad();
		Map<String, List<String>> pinLayout = atmKeyPad.keyPadDesign();
		
		IValidationDesign validate = new ValidationByAdjacency();		
		boolean isPinCorrect = validate.validatePin(pinEntered, actualPin, pinLayout);
		System.out.println(isPinCorrect);

	}

	

}
