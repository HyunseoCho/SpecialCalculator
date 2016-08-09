package com.hsj.specialcalculator;

import java.util.Scanner;


public class DriverClass {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Logger.setFilename("log.txt");
		
		boolean exit = false;
		
		System.out.println("Calculator and Converter program!");
		System.out.println("This program is made by HSJ");
		
		do {
			System.out.println();
			System.out.println("1. Calculator (+, -, x, /) ");
			System.out.println("2. Converter (Length, Weight, Temperature) ");
			System.out.println("Any other number. Exit");
			System.out.println("Input menu: ");
			
			
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("You have selected the calculator.");
				calculate();
				break;
			case 2:
				System.out.println("You selected the converter.");
				convert();
				break;
			default:
				exit = true;
				break;
			}
		} while(exit != true);	
	}
	
	public static void calculate() {
		boolean exit=false;
		do {
			System.out.println();
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("Any other number. Exit");
			System.out.println("Your input menu:");
			
			int choice = scanner.nextInt();
			
			Scanner sc = new Scanner(System.in);
			String string = "";
			double result = 0;
			
			switch (choice) {
			case 1:
				System.out.println("You have selected addition.");
				System.out.println("Input: ");
				
				string = sc.nextLine();
				result = SimpleCalculator.add(string);
				
				System.out.println("The result is " + result);
				break;
			case 2:
				System.out.println("You have selected subtraction.");
				System.out.println("Input: ");
				
				string = sc.nextLine();
				result = SimpleCalculator.subtract(string);
				
				System.out.println("The result is " + result);

				break;
			case 3:
				System.out.println("You have selected multiplication.");
				System.out.println("Input: ");
				
				string = sc.nextLine();
				result = SimpleCalculator.multiply(string);
				
				System.out.println("The result is " + result);

				break;
			case 4:
				System.out.println("You have selected division.");
				System.out.println("Input: ");
				
				string = sc.nextLine();
				result = SimpleCalculator.divide(string);
				
				System.out.println("The result is " + result);

				break;
			
			default:
				exit = true;
				break;
			}
		}while(exit!=true);
	}
	
	public static void convert() {
		boolean exit=false;
		do {
			System.out.println("1. Centimeters to Feet");
			System.out.println("2. Feet to Centimeters");
			System.out.println("3. Kilograms to Pounds");
			System.out.println("4. Pounds to Kilograms");
			System.out.println("5. Celcius to Fahrenheit");
			System.out.println("6. Fahrenheit to Celcius");
			System.out.println("Any other number. Exit");
			System.out.println("Your input menu:");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 1:
				System.out.println("You have selected Centimeters to Feet.");
//				String 
//				LengthConverter.centimeterToFeet();
				break;
			case 2:
				System.out.println("You have selected Feet to Centimeters.");
//				LengthConverter.feetToCentimeter();
				break;
			case 3:
				System.out.println("You have selected Kilograms to Pounds.");
//				WeightConverter.kilogramToPound();
				break;
			case 4:
				System.out.println("You have selected Pounds to Kilograms.");
//				WeightConverter.poundToKilogram();
				break;
			case 5:
				System.out.println("You have selected Celcius to Fahrenheit.");
//				TemperatureConverter.celciusToFahrenheit();
				break;
			case 6:
				System.out.println("You have selected Fahrenheit to Celcius.");
//				TemperatureConverter.FahrenheitToCelcius();
				break;
			
			default:
				exit = true;
				break;
			}
		}while(exit!=true);
		
	}
}
