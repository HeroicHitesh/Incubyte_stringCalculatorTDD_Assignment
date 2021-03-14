package stringCalculatorTDD;

public class Calculator {
	public static int add(String numbers) {
		if(numbers.isEmpty()) { 
			return 0;
		} else if(numbers.contains(",")){
			String[] num=numbers.split(",");
			int sum=0;
			int size=num.length;
			for(int i=0; i<size; i++){
				sum = sum + toInt(num[i]);
			}
			return sum;
		} else {
			return toInt(numbers);
		}
	}

	private static int toInt(String numbers) {
		return Integer.parseInt(numbers);
	}
}
