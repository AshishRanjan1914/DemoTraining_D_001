package test;

import java.util.Date;

public class TestStringAndMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("PROG START");
		
		String str1  = "AAAAAAAABBBBAAAAbbbb|ASSASASAS";
		String valueToUpperCase = str1.toUpperCase();
		String valueToLowerCase = str1.toLowerCase();
		char[] valueIntoCharAY = str1.toCharArray();
		
		String valueConcat = valueToUpperCase.concat(" AND ").concat(valueToLowerCase).concat(" I am for concat");
		System.out.println("I am one"+"I am two"+valueConcat);
		System.out.println(valueToUpperCase.compareTo(valueToLowerCase));
		
		System.out.println("Is upper or lower are equals:: "+valueToUpperCase.equalsIgnoreCase(valueToLowerCase));
		
		String[] valueOfSplittedStr = str1.split(" ");
		
		for (String i : valueOfSplittedStr) {
			System.out.println(i);
		}
		System.out.println(str1.replaceAll("A", "T"));
		System.out.println(str1.indexOf("|"));
		
		System.out.println(str1.substring(12));
		System.out.println(str1.substring(6,str1.indexOf("|")));
		
		System.out.println(Math.random());
		
		Date d1 = new Date();
		
		
		
		System.out.println("PROG ENDS");
		

	}

}
