package test;

import java.io.InputStream;
import java.util.Scanner;

public class Sita {
	
	String name;
	
	public void eating()
	{
		System.out.println("Sita is eating");
	}
	
	//methods.. member -- variable / methods
	//accessmodifier - public/protected/private  === static/non-static returntype nameof method (args1, args2){
// jdfkdjkdgffdhk todo..
	//return yourtype;
//}
	
	private static String dancing(String type) 
	{
		System.out.println("Sita is dancing");
		return type;
	}
	
	public static String nameOfWeek(int i) {
		String nameOfWeekinString = "NA";
		
		if (i == 1) {
			nameOfWeekinString = "SUN";
		} else if(i == 2) {
			nameOfWeekinString = "MON";
		} else {
			nameOfWeekinString = "INVALID INPUT";
		}
		
		return nameOfWeekinString;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myTypeOfDance = Sita.dancing("Salsa");
		String s = "xyz";
		Sita.nameOfWeek(1);
		Sita.nameOfWeek(2);
		Sita.nameOfWeek(3);
		
		//File ready / write ..
		
		
		
		
		

	}

}
