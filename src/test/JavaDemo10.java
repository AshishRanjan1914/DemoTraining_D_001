package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class JavaDemo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int[] a = new int[4];
				a[0]=1;
		//collections..
		//Map / Set / List - Interface - abstract.. child class - implement
		//[0,0,2,1,2,5,5,5,785,5]
		//Object - 
		//List myList = new ArrayList<>();
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(0);
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(5);
		System.out.println("myList :: "+myList);
		System.out.println(myList.get(3));
		
		System.out.println("1nd approach");
		for(int i=0; i<myList.size();i++) {
			System.out.println(myList.get(i));
		}
		
		System.out.println("2nd approach");
		for (Integer eachListValue : myList) {
			System.out.println(eachListValue);
		}
		
		System.out.println("3rd appraoch1");
		Iterator iterator1 = myList.iterator();		
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
		Set<String> mySet = new HashSet<String>();
		mySet.add("A");
		mySet.add("A");
		mySet.add("B");
		mySet.add("C");
		mySet.add("D");
		mySet.add("E");
		System.out.println(mySet);
		
		System.out.println("2nd approach");
		for (String eachSetValue : mySet) {
			System.out.println(eachSetValue);
		}
		
		//Key=value
		Map<Integer,String> myMap = new HashMap<Integer,String>();
		myMap.put(1, "A");
		myMap.put(2, "B");
		myMap.put(3, "C");
		myMap.put(4, "D");
		myMap.put(4, "XX");
		myMap.put(5, "C");
		
		
		
		System.out.println(myMap);
		System.out.println(myMap.get(5));
		
		Set<Entry<Integer, String>> mapEntry = myMap.entrySet();
		
		for (Entry<Integer, String> eachEntry : mapEntry) {
			System.out.println(eachEntry.getKey()+" "+eachEntry.getValue());
		}
		
		System.out.println(Math.random());
		Random random = new Random(System.currentTimeMillis());
		System.out.println(Math.abs(random.nextInt()));

	}

}
