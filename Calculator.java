package session3;

import java.util.StringTokenizer;

public class Calculator {
	
	public Calculator(){};

	private static double add(double num1, double num2) {
		return (num1 + num2);
	}
	
	private static double subtract(double num1, double num2) {
		return (num1 - num2);
	}
	
	private static double multiply(double num1, double num2) {
		return (num1 * num2);
	}
	
	private static double divide(double num1, double num2) {
		return (num1 / num2);
	}
	
	public static void main(String[] args) {
		//Calculate the result of the input equation
		//This program does not calculate result of complex expressions, it will assume input is a simple 2 number (integer or double) expression
		double num1 = 0, num2 = 0;
		
		//String input = "3 * 4";
		//String input = "3 / 4";
		//String input = "3 + 4";
		String input = "3 - 4";
		
		System.out.print(input + " = ");

		StringTokenizer multiplyTokens = new StringTokenizer(input, "*");
		StringTokenizer addTokens = new StringTokenizer(input, "+");
		StringTokenizer divideTokens = new StringTokenizer(input, "/");
		StringTokenizer subtractTokens = new StringTokenizer(input, "-");
		
		int multiplyCount = multiplyTokens.countTokens() -1;
		int divideCount = divideTokens.countTokens() -1;
		int addCount = addTokens.countTokens() -1;
		int subtractCount = subtractTokens.countTokens() -1;
		
		if (multiplyCount > 0) {
			//Multiply the two numbers around the operator
			num1 = Double.parseDouble(multiplyTokens.nextToken());
			num2 = Double.parseDouble(multiplyTokens.nextToken());
			System.out.println(Calculator.multiply(num1, num2));
		}

		
		if (divideCount > 0){
			//Multiply the two numbers around the operator
			num1 = Double.parseDouble(divideTokens.nextToken());
			num2 = Double.parseDouble(divideTokens.nextToken());
			System.out.println(Calculator.divide(num1, num2));
		}
		
		if (addCount > 0) {
			//Multiply the two numbers around the operator
			num1 = Double.parseDouble(addTokens.nextToken());
			num2 = Double.parseDouble(addTokens.nextToken());
			System.out.println(Calculator.add(num1, num2));
		}
		
		if (subtractCount > 0) {
			//Multiply the two numbers around the operator
			num1 = Double.parseDouble(subtractTokens.nextToken());
			num2 = Double.parseDouble(subtractTokens.nextToken());
			System.out.println(Calculator.subtract(num1, num2));
		}		
		
		
		/* Output
		 * 3 * 4 = 12.0
		 * 3 / 4 = 0.75
		 * 3 + 4 = 7.0
		 * 3 - 4 = -1.0
		 */

	}

}
