package com.hsj.specialcalculator;

public class TemperatureConverter {
	public static double celciusToFahrenheit(double c){
		double fahrenheit = (9/(double)5) * c + 32;
		Logger.saveLog(c + " celcius is converted into " + fahrenheit+" fahrenheit");
		return fahrenheit;
	}
	public static double fahrenheitToCelcius(double f){
		double celcius = (5/(double)9) * (f - 32);
		Logger.saveLog(f + " fahrenheit is converted into " + celcius+" celcius");
		return celcius;
	
	}

}
