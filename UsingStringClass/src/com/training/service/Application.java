package com.training.service;

public class Application {

	public static void main(String[] args) {
	
		StringService service =new StringService();
		
		String city="CHENNAI";
		
		int key=14;
		switch (key) {
		case 1:
			service.StringEquals("ram", "ram");
			break;
           
		case 2:
			service.stringObjectEquals();
			break;
		case 3:
			service.usingTrim(" ramesh ");
			break;
		case 4:
			service.lengthOfString("  ramesh  ");
			break;
		case 5:
			service.usingSubString("Happy Morning");
			break;
		case 6:
			service.usingCharAtAndIndexOf("ram@abc.com");
	         break;
		case 7:
			service.usingReplace("ram@abc.com","Welcome to chennai");
			break;
		case 8:
			service.usingConcat("Hello","Chennai");
			break;
		case 9:
			service.usingCompareTo("Ram","Ram");
			break;
		case 10:
			service.usingStringFormat("ram",45.298);
			break;
		case 11:
			service.usingStringFormat(17);
			break;
		case 12:
			service.usingStringFormat(16,16);
			break;
		case 13:
			service.usingStringFormat("ram","ram");
			break;
		case 14:
			service.usingStringFormat1(-421L);
			break;
		default:
			break;
		}

	}

}
