package com.example;

public class LoggingWithPropFile {

	public static void main(String[] args) {
		
		 String file = LoggingWithPropFile.class.getClassLoader()
				 .getResource("logging.properties").getFile();
		 
		 //System.out.println(file);
		 
		 System.setProperty("java.util.logging.SimpleFormatter", file);
		 
		 Book.Log.info("Logging Properties Done Right");
		 Book java = new Book();
		 Book.Log.info(java.toString());
		

	}

}