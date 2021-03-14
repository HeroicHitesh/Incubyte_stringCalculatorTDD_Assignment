package stringCalculatorTDD;

public class Calculator {
	public static int add(String numbers) {
		if(numbers.isEmpty()) { 
			return 0;
		} else if(numbers.contains(",")){
			String[] num=numbers.split(",");
			return Integer.parseInt(num[0])+Integer.parseInt(num[1]);
		} else {
			return Integer.parseInt(numbers);
		}
	}
}
