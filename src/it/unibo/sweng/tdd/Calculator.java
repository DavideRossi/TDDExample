package it.unibo.sweng.tdd;

import java.util.regex.Pattern;

public class Calculator {

	int add(String numberList) {
		if(numberList == null) {
			throw new IllegalArgumentException();
		} else if(numberList.equals("")) {
			return -1;
		} else {
			if(!Pattern.matches("^(\\d{1,3})(,\\d{1,3})*$", numberList)) {
				throw new IllegalArgumentException();
			}
			String[] numbers = numberList.split(",");
			int sum = 0;
			for(String number : numbers) {
				int value = Integer.parseInt(number);
				sum += value;
			}
			return sum;
		}
	}

}
