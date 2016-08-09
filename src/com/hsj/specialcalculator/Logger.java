package com.hsj.specialcalculator;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {
	private static String filename = "";
	
	public static void setFilename(String filename) {
		Logger.filename = filename;
	}

	public static String getFilename() {
		return Logger.filename;
	}
	
	public static void saveLog(String log) {
		try {
			FileWriter writer = new FileWriter(filename,true);
			writer.write(log + "\r\n");
			writer.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}