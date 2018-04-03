package com.vu.util;

import java.util.List;
import java.util.Map;

public class ValidationByAdjacency implements IValidationDesign {

	public boolean validatePin(String pinEntered, String actualPin, Map<String, List<String>> pinLayout) {

		boolean result = false;
		if (pinEntered == null || actualPin == null) {
			return result;
		}
		if (actualPin.length() == pinEntered.length()) {
			if (actualPin.equals(pinEntered)) {
				result = true;
			} else {
				String[] actualPinDigits = actualPin.split("");
				String[] pinEnteredDigits = pinEntered.split("");
				for (int i = 0; i < actualPinDigits.length; i++) {
					if(!(actualPinDigits[i].equals(pinEnteredDigits[i])
							|| (pinLayout.get(pinEnteredDigits[i]).contains(actualPinDigits[i])))) {
						return result;
					}
				}
				result = true;
			}
		}
		return result;
	}
}
