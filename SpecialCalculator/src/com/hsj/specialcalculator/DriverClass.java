package com.hsj.specialcalculator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
			System.out.println("3. View Log");
			System.out.println("Any other number. Exit");
			System.out.println("Input menu: ");
			
			
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				calculate();
				break;
			case 2:
				convert();
				break;
			case 3:
				viewLog();
				break;
			default:
				exit = true;
				break;
			}
		} while(exit != true);	
	}

	private static void viewLog() {
		System.out.println("[view log]");
		boolean exit = false;
		try {
			String filename = Logger.getFilename();
			BufferedReader in = new BufferedReader(new FileReader(filename));
			int index = 1;
			while (true) {
				String line = in.readLine();
				if (line == null) break;
				System.out.print("[" + (index++) + "]");
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void calculate() {
		boolean exit=false;
		do {
			System.out.println();
			System.out.println("[calculator program]");
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
			System.out.println();
			System.out.println("[converter program]");
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

			double result = 0;
			switch (choice) {
			case 1:
				System.out.println("You have selected Centimeters to Feet.");
				System.out.println("How many centimeters do you want to convert into feet?");
				double inputCentimeters= scanner.nextDouble();
				result = LengthConverter.centimeterToFeet(inputCentimeters);
				System.out.println(inputCentimeters + " centimeter -> " + result + " feet.");
				break;
			case 2:
				System.out.println("You have selected Feet to Centimeters.");
				System.out.println("How many feet do you want to convert into centimeters?");
				double inputFeet= scanner.nextDouble();
				result = LengthConverter.feetToCentimeter(inputFeet);
				System.out.println(inputFeet + " feet -> " + result + " centimeters.");
				break;
			case 3:
				System.out.println("You have selected Kilograms to Pounds.");
				System.out.println("How many kilograms do you want to convert into pounds?");
				double inputKilograms= scanner.nextDouble();
				result = WeightConverter.kilogramToPound(inputKilograms);
				System.out.println(inputKilograms + " kilograms -> " + result + " pounds.");
				break;
			case 4:
				System.out.println("You have selected Pounds to Kilograms.");
				System.out.println("How many pounds do you want to convert into kilograms?");
				double inputPounds= scanner.nextDouble();
				result = WeightConverter.poundToKilogram(inputPounds);
				System.out.println(inputPounds + " pounds -> " + result + " kilograms.");
				break;
			case 5:
				System.out.println("You have selected Celcius to Fahrenheit.");
				System.out.println("How many degrees Celcius do you want to convert into degrees Fahrenheit?");
				double inputCelcius= scanner.nextDouble();
				result = TemperatureConverter.celciusToFahrenheit(inputCelcius);
				System.out.println(inputCelcius + " celcius -> " + result + " fahrenheit.");
				break;
			case 6:
				System.out.println("You have selected Fahrenheit to Celcius.");
				System.out.println("How many degrees Fahrenheit do you want to convert into Celcius?");
				double inputFahrenheit=scanner.nextDouble();
				result = TemperatureConverter.fahrenheitToCelcius(inputFahrenheit);
				System.out.println(inputFahrenheit + " fahrenheit -> " + result + " celcius.");
				break;
			
			default:
				exit = true;
				break;
			}
		}while(exit!=true);
		
	}
}
