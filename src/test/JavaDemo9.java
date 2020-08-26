package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class JavaDemo9 {

	public double div(int i, int j) {
		double result = i/j;
		return result;
	}

	public void printArrayData(int[] array) {

		for(int i=0; i<=array.length; i++) {
			System.out.println("value of I is :"+array[i]);
		}
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub

		//creating custom exceptions..
		//https://stackoverflow.com/questions/7049623/how-to-create-checked-unchecked-custom-exceptions-in-java
		System.out.println("Started");

		//try - catch block
		//throws


		try {
			//catched - compiletime 
			File file = new File("c://");

			//all possible set of code - possibility exceptions ..

			FileInputStream fis = new FileInputStream(file);
			System.out.println("Step next to possible exception");

			JavaDemo9 j9 = new JavaDemo9();
			double r1 = j9.div(10, 2);
			System.out.println(r1);
			//uncatched - RunTime
			double r2 = j9.div(10, 0);
			System.out.println(r2);

			int[] arrrYInt = new int[]{0,1,2,3};
			j9.printArrayData(arrrYInt);

		}catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Inside ArrayIndexOutOfBoundsException");
			System.out.println(ex.getMessage());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Inside catch bloack of FileNotFoundException");
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}  catch (ArithmeticException ex) {
			System.out.println("Inside ArithmeticException");
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("Inside finally block");
		}
		
		System.out.println("Ended");

		//Object


	}

}
