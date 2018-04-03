package com.vu.util;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AppStart {

	public static void main(String[] args) {

		String actualPin, pinEntered;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the Actual Pin");
			actualPin = scanner.next().trim();
			System.out.println("Enter the pin entered by user");
			pinEntered = scanner.next().trim();
		}
		IKeyPad atmKeyPad = new ATMKeyPad();
		Map<String, List<String>> pinLayout = atmKeyPad.keyPadDesign();

		IValidationDesign validate = new ValidationByAdjacency();
		boolean isPinCorrect = validate.validatePin(pinEntered, actualPin, pinLayout);
		System.out.println(isPinCorrect);

	}

}
