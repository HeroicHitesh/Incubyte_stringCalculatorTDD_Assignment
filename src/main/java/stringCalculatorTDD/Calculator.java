package stringCalculatorTDD;

public class Calculator {
	public static int add(String numbers) {
		if(numbers.isEmpty()) { 
			return 0;
		} else if(numbers.contains(",")){
			String[] num=numbers.split(",");
			return toInt(num[0])+toInt(num[1]);
		} else {
			return toInt(numbers);
		}
	}

	private static int toInt(String numbers) {
		return Integer.parseInt(numbers);
	}
}
