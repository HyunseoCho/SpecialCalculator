package com.hsj.specialcalculator;

public class SimpleCalculator {
	
	private static double[] stringToDoubleArray(String str) {
		String[] stringArr = str.split(",");
		double[] doubleArr = new double[stringArr.length];
		for (int i = 0; i < doubleArr.length; i++) {
			doubleArr[i] = Double.parseDouble(stringArr[i]);
		}
		return doubleArr;
	}

	public static double add(double[] numbers) {
		double sum=0;
		for(int i=0;i<numbers.length;i++){
			sum+=numbers[i];
			
		}	
		Logger.saveLog("The sum of the input numbers is "+sum );
		
		return sum;		
	}
	
	public static double add(String string){
		double[] numbers = stringToDoubleArray(string);
		return add(numbers);
	}
	
	public static double subtract(String string){
		double[] numbers = stringToDoubleArray(string);
		double remainder=numbers[0];
		for(int i=1;i<numbers.length;i++){
			remainder-=numbers[i];
		}
		double subtracted[]=new double[numbers.length-1];
		for(int i=0;i<subtracted.length;i++){
			subtracted[i]=numbers[i+1];
		}
		Logger.saveLog("The remainder of the input numbers is"+remainder );
		
		return remainder;

	}
	
	public static double multiply(String string){
		double[] numbers = stringToDoubleArray(string);	
		double product=1;
		for(int i=0;i<numbers.length;i++){
			product*=numbers[i];
		}
		Logger.saveLog("The product of the following numbers is "+product);
		
		return product;

	}
	
	public static double divide(String string){
		double[] numbers = stringToDoubleArray(string);
		double quotient=0;
		double divided[]=new double[numbers.length-1];
		
		for(int i=0;i<divided.length;i++){
			if(numbers[i+1]==0){
				System.out.println("You cannot divide a number by zero");
				return 0;
			}
			divided[i]=numbers[i+1];
		}
		int dividend=1;
		for(int i=0;i<divided.length;i++){
			dividend*=divided[i];
			
		}
		
		quotient=numbers[0]/dividend;
		
		Logger.saveLog("The quotient of the following numbers is"+ quotient);
		
		return quotient;

	}



}
