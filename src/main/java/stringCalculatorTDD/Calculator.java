package stringCalculatorTDD;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
	public static int add(String numbers) {
		if(numbers.isEmpty()) { 
			return 0;
		} else {
			String[] num = splitter(numbers);
			int size=num.length;
			return findSum(num, size);
		}
	}

	private static int findSum(String[] num, int size) {
		int sum=0;
		for(int i=0; i<size; i++){
			sum = sum + toInt(num[i]);
		}
		return sum;
	}

	private static String[] splitter(String numbers) {
		if(isCustomDelimiterString(numbers)) {
			return splitUsingCustomDelimiter(numbers);
		}
		return splitUsingCommaAndNewLine(numbers);
	}

	private static boolean isCustomDelimiterString(String numbers) {
		return numbers.startsWith("//");
	}

	private static String[] splitUsingCommaAndNewLine(String numbers) {
		String[] num=numbers.split(",|\n");
		return num;
	}

	private static String[] splitUsingCustomDelimiter(String numbers) {
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(numbers);
		m.matches();
		String customDelim = m.group(1);
		String num=m.group(2);
		return num.split(Pattern.quote(customDelim));
	}

	private static int toInt(String numbers) {
		return Integer.parseInt(numbers);
	}
}
