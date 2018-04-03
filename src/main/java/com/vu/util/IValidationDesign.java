package com.vu.util;

import java.util.List;
import java.util.Map;

public interface IValidationDesign {
	boolean validatePin(String pinEntered, String actualPin, Map<String, List<String>> pinLayout);
}
