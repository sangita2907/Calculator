package com.challenge.java;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		String input1 = scan.next();
		System.out.println("Enter a Number: ");
		String input2 = scan.next();
		System.out.println("Choose the Operation (+, -, *, /):");
		String operator = scan.next();
		
		double result = 0;
		
		try{
			switch(operator){
				case "+":
					result = add(input1, input2);
					break;
				case "-":
					result = subtract(input1, input2);
					break;
				case "*":
					result = multiply(input1, input2);
					break;
				case "/":
					result = devide(input1, input2);
					break;
				default:
					System.out.println("Unable to perform any operation");
					return;
			}
			
			System.out.println("Answer is : " + result);
		}catch(Exception e){
			System.out.println("Number format exception..\nAny number expected..\n" + e.getMessage());
		}
		
		

	}
	
	public static double add(String input1, String input2){
		double number1 = Double.parseDouble(input1);
		double number2 = Double.parseDouble(input2);
	    double result = number1 + number2;
		return result;
	}
	
	public static double subtract(String input1, String input2){
		double number1 = Double.parseDouble(input1);
		double number2 = Double.parseDouble(input2);
	    double result = number1 - number2;
		return result;
	}
	
	public static double multiply(String input1, String input2){
		double number1 = Double.parseDouble(input1);
		double number2 = Double.parseDouble(input2);
	    double result = number1 * number2;
		return result;
	}
	
	public static double devide(String input1, String input2){
		double number1 = Double.parseDouble(input1);
		double number2 = Double.parseDouble(input2);
		double result = number1 / number2;
		return result;
	}

}
