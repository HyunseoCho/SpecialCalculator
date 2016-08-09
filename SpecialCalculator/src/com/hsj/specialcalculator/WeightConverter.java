package com.hsj.specialcalculator;

public class WeightConverter {
	public static double kilogramToPound(double k){
		double pound = k * 2.205;
		Logger.saveLog(k + " kilograms is converted into " + pound + " pounds");
		return pound;
	}
	public static double poundToKilogram(double p){
		double kilogram = p / 2.205;
		Logger.saveLog(p + " pounds is converted into " + kilogram + " kilograms");
		return kilogram;
	}

}
