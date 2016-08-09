package com.hsj.specialcalculator;

public class TemperatureConverter {
	public static double celciusToFahrenheit(double c){
		double fahrenheit= (c-32)*5/9;
		Logger.saveLog(c + " celcius is converted into " + fahrenheit+" fahrenheit");
		return fahrenheit;
	}
	public static double FahrenheitToCelcius(double f){
		double celcius= f*(9/5)+32;
		Logger.saveLog(f + " fahrenheit is converted into " + celcius+" celcius");
		return celcius;
	
	}

}
