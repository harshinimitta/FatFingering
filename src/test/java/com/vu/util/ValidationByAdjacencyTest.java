package com.vu.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Test;

public class ValidationByAdjacencyTest {

	ValidationByAdjacency validationByAdjacency = new ValidationByAdjacency();
	IKeyPad atmKeyPad = new ATMKeyPad();
	Map<String, List<String>> pinLayout = atmKeyPad.keyPadDesign();

	@Test
	public void testValidatePinWhenActualPinIsNull() {
		String actualPin = null;
		String pinEntered = "1234";
		assertFalse(validationByAdjacency.validatePin(pinEntered, actualPin, pinLayout));
	}

	@Test
	public void testValidatePinWhenPinEnteredIsNull() {
		String actualPin = "4783";
		String pinEntered = null;
		assertFalse(validationByAdjacency.validatePin(pinEntered, actualPin, pinLayout));
	}

	@Test
	public void testValidatePinWhenEnteredCorrectPin() {
		String actualPin = "4873";
		String pinEntered = "4873";
		assertTrue(validationByAdjacency.validatePin(pinEntered, actualPin, pinLayout));
	}

	@Test
	public void testValidatePinWhenCorrectPinByAdjacency() {
		String actualPin = "4873";
		String pinEntered = "1872";
		assertTrue(validationByAdjacency.validatePin(pinEntered, actualPin, pinLayout));
	}

	@Test
	public void testValidatePinWhenEnteredIncorrectPin() {
		String actualPin = "4873";
		String pinEntered = "4273";
		assertFalse(validationByAdjacency.validatePin(pinEntered, actualPin, pinLayout));
	}
}
