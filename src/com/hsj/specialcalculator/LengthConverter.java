package com.hsj.specialcalculator;



public class LengthConverter {


	public static double centimeterToFeet(double c) {

		double feet = c / 30.48;
		Logger.saveLog(c + " centimeters is converted into " + feet+ " feet");
		return feet;
	}
	
	public static double feetToCentimeter(double f) {
		double centimeter= f*30.48;
		Logger.saveLog(f + " feet is converted into " + centimeter + " centimeters");
		return centimeter;
		
	}
}
