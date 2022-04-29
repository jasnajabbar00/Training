package com.example;

import java.io.IOException;
import java.util.logging.FileHandler;

public class LoggingWithPropAndSaveFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file = LoggingWithPropFile.class.getClassLoader()
				 .getResource("logging.properties").getFile();
		 //System.out.println(file);
		 System.setProperty("java.util.logging.XMLFormatter", file);
		 FileHandler handler;
		try {
			handler = new FileHandler("log2.log");
			Book.Log.addHandler(handler);
			 Book.Log.info("Logging Properties Done Right");
			 Book java = new Book();
			 Book.Log.info(java.toString());
			
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		

	}

}