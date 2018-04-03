package com.vu.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ATMKeyPad implements IKeyPad {

	@Override
	public Map<String, List<String>> keyPadDesign() {
		Map<String, List<String>> pinLayout = new HashMap<String, List<String>>();
		pinLayout.put("1", new ArrayList<String>(Arrays.asList("2","4")));
		pinLayout.put("2", new ArrayList<String>(Arrays.asList("1","3","5")));
		pinLayout.put("3", new ArrayList<String>(Arrays.asList("2","5","6")));
		pinLayout.put("4", new ArrayList<String>(Arrays.asList("1","5","7")));
		pinLayout.put("5", new ArrayList<String>(Arrays.asList("2","4","6","8")));
		pinLayout.put("6", new ArrayList<String>(Arrays.asList("3","5","9")));
		pinLayout.put("7", new ArrayList<String>(Arrays.asList("4","8")));
		pinLayout.put("8", new ArrayList<String>(Arrays.asList("5","7","9","0")));
		pinLayout.put("9", new ArrayList<String>(Arrays.asList("8","6")));
		pinLayout.put("0", new ArrayList<String>(Arrays.asList("8")));
		return pinLayout;		
	}

}
