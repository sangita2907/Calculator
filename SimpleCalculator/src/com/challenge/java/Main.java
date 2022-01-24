package com.challenge.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		String input1 = scan.nextLine();
		double number1 = Double.parseDouble(input1);
		
		System.out.println("Enter a number: ");
		String input2 = scan.nextLine();
		double number2 = Double.parseDouble(input2);
		
		double sum = number1 + number2;
		
		System.out.println("The sum of these two number is : " + sum);

	}

}
