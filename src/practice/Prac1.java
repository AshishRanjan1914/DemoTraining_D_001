package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Prac1 {	
	
	String s ="sdfsf sffdsf sdfsf sdfjsj fsdoifsoi";


	public void printDuplicate(String str) {
		//I am am java.
		String[] strArray = str.split(" ");
		Map<String, Integer> tempMap = new HashMap<String, Integer>();
		for (String eachString : strArray) {

			if(tempMap.get(eachString)!=null) {
				tempMap.put(eachString, tempMap.get(eachString)+1);
			} else {
				tempMap.put(eachString, 1);
			}

		}
		Set<Entry<String, Integer>>  entrySet = tempMap.entrySet();

		for (Entry<String, Integer> entry : entrySet) {

			if(entry.getValue() > 1){
				System.out.println(entry.getKey()+ "occured" +entry.getValue() );
			}			
		}

		System.out.println(tempMap);
	}

	public void stringHavingWords() {

		String test = "Bangalore is in India";

		String[] splittedtxt = test.split("\\s+");


		for (int i = 0; i < splittedtxt.length; i++) {
			Map<Character,Integer> countMap = new HashMap<Character, Integer>();

			char[] strArray = splittedtxt[i].toCharArray();
			for (char c : strArray) { 
				if (countMap.containsKey(c)) {
					countMap.put(c, countMap.get(c) + 1);
				} else {
					countMap.put(c, 1);
				}
			}
			System.out.println("For Word "+splittedtxt[i]);
			for (Map.Entry entry : countMap.entrySet()) { 
				System.out.println(entry.getKey() + " " + entry.getValue()); 
			}

		}


	}

	public static void reverseString1(String str) {
		System.out.println("Before rev :: "+str);
		
		char[] charArray = str.toCharArray();
		char[] newTempArray = new char[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			//char c = charArray[charArray.length - 1];
			newTempArray[i] =  charArray[(charArray.length -i) - 1];
		}
		System.out.println("After rev:: "+String.valueOf(newTempArray));

	}
	
	public static void reverseString2(String str) {
		System.out.println("Before rev :: "+str);
		String revString = "";
		for (int i = str.length()-1; i >= 0; i--) {
			revString = revString+str.charAt(i);
		}
		
		System.out.println("After rev:: "+revString);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c = 'a';
		char[] chrarray = new char[4];
		chrarray[0] = 'a';
		chrarray[1] = 'b';
		chrarray[2] = 'c';
		chrarray[3] = 'd';

		System.out.println("chrArray Length::"+chrarray.length);
		System.out.println("converted char array to string ::"+String.valueOf(chrarray));
		System.out.println(String.valueOf(c));
		
		
		reverseString1("ABCDEF");
		reverseString2("PQRST");

	}

}
