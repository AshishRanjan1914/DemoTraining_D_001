package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LearnExceptions {
	
	static void doCal() {
		//
		int i = 2;
		int j = 1;
		
		double result = i/j;
		
		System.out.println("my result is :: "+ result);
		
	}

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		System.out.println("PROG STARTS");
		
		String s = "I am an Indian."; // upper /lower...split/ toCharArray
		char[] charArray = s.toCharArray();
		
		//a -- 
		
		int[] intArray1 = {22,33,44,55,66}; // decl..
		System.out.println("Index 3 value >> "+intArray1[3]);
		
		//traverse ... array...	
		//looping through an array
		for (int i = 0; i < intArray1.length; i++) {
			System.out.println(intArray1[i]);
		}		
		
		// for each --
		System.out.println("FOR EACH");
		for (int myeachValueOfData : intArray1) {
			System.out.println(myeachValueOfData);
		}			
		
		boolean[] bb = {true, false, false};
		double[] dd = {0.0,1.1,1.2};
		
		double[] ddd = new double[6];	
		ddd[4] = 2.1;
		System.out.println("length of array"+dd.length);
		
		for (int i = 0; i < dd.length; i++) {
			System.out.println(dd[i]);
		}
		
		int[] intArray2 = new int[5];
		intArray2[0] = 100;
		intArray2[1] = 200;
		intArray2[2] = 300;
		intArray2[3] = 400;
		intArray2[4] = 500;
		
		String[] stringArray = {"A","B","C"};
		//for loop
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
		
		// IO   ... 
		File file1 = new File("filePath");
		//compile time exception..
		
		
			new FileInputStream(file1);
		
		//super parent class -- Object
		try {
			System.out.println(intArray2[5]);//
		} catch (ArrayIndexOutOfBoundsException exc) {
			// runs when exception occurs...
			System.out.println("I am handing catch for arrayindexoutofbond.");
			System.out.println(exc.getCause());
			System.out.println(exc.getMessage());
			exc.printStackTrace();
		} finally {
			System.out.println("I am finally.....");
		}
		// 2 ways .. throws , try catch block
		try {
			LearnExceptions.doCal();// Arithmetic Exception
		} catch (RuntimeException exc) {
			//only runs when exception occurs
			System.out.println("IM IN CATCH BLOCK");
			System.out.println(exc.getMessage());
			System.out.println(exc.getCause());
			//System.out.println(exc.getStackTrace());
			exc.printStackTrace();
		} finally {
			// alwys runs.. irrespective of exception occurance..
			System.out.println("ALWSYS RUNS..");
		}
		//sfjkhsdkjfhskdjfhksdfhkf
		System.out.println("PROG ENDS");
		

	}

}
