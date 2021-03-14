package stringCalculatorTDD;

public class Calculator {
	public static int add(String numbers) {
		if(numbers.isEmpty()) { 
			return 0;
		} else {
			String[] num = splitter(numbers);
			int sum=0;
			int size=num.length;
			for(int i=0; i<size; i++){
				sum = sum + toInt(num[i]);
			}
			return sum;
		}
	}

	private static String[] splitter(String numbers) {
		String[] num=numbers.split(",|\n");
		return num;
	}

	private static int toInt(String numbers) {
		return Integer.parseInt(numbers);
	}
}
