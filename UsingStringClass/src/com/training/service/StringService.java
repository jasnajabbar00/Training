package com.training.service;

public class StringService {

	public void StringEquals(String str1,String str2)
	{
		System.out.println("Is value same:"+str1.equals(str2));
		System.out.println("Are they pointing to the same location:"+(str1==str2));
		
	}
	public void stringObjectEquals() {
		String ram=new String("Ram");
		String ramesh=new String("Ram");
		
		System.out.println("Is values same:"+ ram.equals(ramesh));
		System.out.println("Are they pointing to the same location:"+(ram==ramesh));
	}
	public String usingTrim(String name) {
		
		System.out.println("Without Trim:"+name);
		System.out.println("Trim:"+name.trim());
		return name.trim();
		
	}
	public void lengthOfString(String name) {
		
	//	String resp=usingTrim(name);
	//  System.out.println("String Length:"+resp.length());
		
		System.out.println("String Length:"+name.trim().length());
	}
	public void usingSubString(String name) {
		
		System.out.println(name.substring(2,8));
	}
	public void usingCharAtAndIndexOf(String name) {
		System.out.println("Index position of @: "+name.indexOf("@"));
	    System.out.println("Character at position 3: "+name.charAt(3));
	}
	public void usingReplace(String str1,String str2) {
		System.out.println(str1.replace(".com",".org"));
		//System.out.println(str2.replace('c','m'));
	}
	public void usingConcat(String str1,String str2) {
		
		//string is immutable-cannot change
		System.out.println(str1.concat(str2));
		
		//string builder is mutable-can change
		StringBuilder builder=new StringBuilder(str1);
		builder.append(str2);
		
		System.out.println(builder.toString());
	}
	public void usingCompareTo(String str1,String str2) {
		
		System.out.println(str1.compareTo(str2));
	}
	public void usingStringFormat(String str1,double mark) {
		
		String frmtString=String.format("%S",str1);
		
		System.out.println(frmtString);
		System.out.println(String.format("Mark %.2f",mark));
	}
	public void usingStringFormat(long l) {
		
		System.out.println(String.format("octal %o",l));
		System.out.println(String.format("Hexa Decimal %x",l));
		
	}
public void usingStringFormat(int mark1,int mark2) {
		
		System.out.println(String.format("octal %1$o,%2$x",mark1,mark2));
	}
public void usingStringFormat(String str1,String str2) {
	
	System.out.println(String.format(" %1$s,%2$S",str1,str2));	
}
public void usingStringFormat1(long value) {
	
	System.out.println(String.format("%+d",value));
	
}
	}
