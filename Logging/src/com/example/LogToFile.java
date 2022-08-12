package com.example;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class LogToFile {

	public static void main(String[] args) {
		
		Logger log = Logger.getLogger(LogToFile.class.getName());
		FileHandler handler;
		
		try {
			handler = new FileHandler("logs.log");
			log.addHandler(handler);
			log.info("try Block called");
			
		} catch (SecurityException e) {
			
			log.info(e.getMessage());
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			log.info(e.getMessage());
		}
		

	}

}
