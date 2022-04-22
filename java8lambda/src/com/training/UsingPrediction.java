package com.training;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
public class UsingPrediction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //consumer-functional interface-reference to lambda
		List<String> names=Arrays.asList("India","Srilanka","Indonesia","Bhutan");
		Predicate<String> containsChar=(country) -> country.toUpperCase().startsWith("I");
		Consumer<String> consumer=(value) ->// System.out.println(value);
		{
			if(containsChar.test(value)) {
				System.out.println(value);
			}
		};
				names.forEach(consumer);
			//names.forEach((value) -> System.out.println(value));
	}

}
