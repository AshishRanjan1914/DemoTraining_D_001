package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		int ii = 20;
		int jj = 0;

		// try and catch block block.....

		try {

			double myresult = ii/jj;//	ArithmeticException
			System.out.println("myResult is ::"+ myresult);

			new FileInputStream(""); // FileNotFoundException
		} catch (FileNotFoundException sdfsdfsf) {
			System.out.println("ru these instruction..");
		} catch (ArithmeticException varibale) {// catch block- only runs if exception occurs..
			System.out.println("sdfsdfsdfsdfsfsfsdfdfs");
		}


		
		//Array ...
	
		int[] myStudentAge = new int[100];
		 myStudentAge[0] = 10;
		 myStudentAge[1] = 11;
		 myStudentAge[2] = 10;
		 myStudentAge[3] = 12;
		
		 try {
		 myStudentAge[100] = 15;
		 } catch (ArrayIndexOutOfBoundsException sds)
		 {
			 //
		 }
		 System.out.println(myStudentAge.length);
		 
		 System.out.println("Index at 2 is"+myStudentAge[2]);
		 
		 for(int arrayIndex=0; arrayIndex < myStudentAge.length; arrayIndex++) {
			 //System.out.println(myStudentAge[arrayIndex]);
		 }
		 
		 for (int i : myStudentAge) {// for each..
			System.out.println(i);
		}
		 //collections .. List -- Set -- Map --
		//
		
		ArrayList<String> myListVariable= new ArrayList<String>();
		myListVariable.add("xyz");//0
		myListVariable.add("PQR"); //1
		myListVariable.add("xyz"); //2
		myListVariable.add("ABC"); //3
		System.out.println("afaf values are :: "+myListVariable);
		System.out.println(myListVariable.get(3));
		System.out.println(myListVariable.size());//4	
		
		for (String eachListValue : myListVariable) {
			System.out.println(eachListValue);
		}
		
		// SET.... unique...
		
		HashSet<String> mySetVariable = new HashSet<String>();
		mySetVariable.add("xyz");//0
		mySetVariable.add("PQR"); //1
		mySetVariable.add("xyz"); //2
		mySetVariable.add("ABC"); //3
		System.out.println("afaf values are :: "+mySetVariable);
		//System.out.println(mySetVariable.get(3));
		System.out.println(mySetVariable.size());//4
		
		// for each //
		for (String eachString : mySetVariable) {
			System.out.println(eachString);
		}
		
		// 3rd method .. Iterator...
		Iterator<String> mySetIterator = mySetVariable.iterator();		
		while (mySetIterator.hasNext()) {
			System.out.println(mySetIterator.next());
		}		
		
		ArrayList<String> myArrayList = new ArrayList<>();
		System.out.println(myArrayList);

		myArrayList.add("A");//0
		myArrayList.add("B");//1
		myArrayList.add("C");//2
		myArrayList.add("D");//3
		myArrayList.add("E");
		myArrayList.add("F");
		myArrayList.add("G");		
		System.out.println(myArrayList);

		System.out.println(myArrayList.get(3));
		System.out.println("size of array:: "+ myArrayList.size());
		//1//
		System.out.println("1st method");
		for (int i = 0; i < myArrayList.size(); i++) {
			System.out.println(myArrayList.get(i));
		}		

		//2//
		System.out.println("2nd method");
		for (String eachObject : myArrayList) {
			System.out.println(eachObject);
		}

		//hasnext() ... next()..
		ArrayList myArrayListInt = new ArrayList<>();
		myArrayListInt.add("AAAA");
		for (int i = 1; i <= 100; i++) {
			myArrayListInt.add(i*2);
		}
		System.out.println(myArrayListInt);

		//set ..map...
		HashMap<Integer, String> myMapValue = new HashMap<>();
		
		myMapValue.put(2, "A");
		myMapValue.put(1, "B");
		myMapValue.put(3, "C");
		myMapValue.put(5, "D");
		myMapValue.put(6, "A");
		myMapValue.put(2, "AA");
		
		System.out.println(myMapValue);
		System.out.println(myMapValue.size());
		
		System.out.println(myMapValue.get(5));
		//traverse..
		Set<Entry<Integer, String>> myEntrySetValue = myMapValue.entrySet();
		Iterator<Entry<Integer, String>> myIteratorValue = myEntrySetValue.iterator();
		while (myIteratorValue.hasNext()) {
			Entry<Integer, String> myeachEntry = myIteratorValue.next();
			System.out.println("Key is :: "+myeachEntry.getKey() + " And Value is :: "+myeachEntry.getValue());			
		}
		
		
		
		//		
		

		

	}

}
