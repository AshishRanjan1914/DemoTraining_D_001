package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Prac2 {
	
	//10
	//odd & Even - input n [1 to n]
	//divisible by 3 & 5 - - input n [1 to n]
	//Hello Java How Are You Java. - Duplicate word.
	//23635874 - re-arrange , difference .. minimum. 2 3 3  4 5 6 7 8 [Min - 6]

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "inndian";
		
		char[] stringChar = s.toCharArray();
		System.out.println(stringChar);
		
		
		
		//report consecutive occurance char
		for (int i = 0; i < stringChar.length-1; i++) {
			if(stringChar[i] == stringChar[i+1]) {
				System.out.println("Occuring twice :"+stringChar[i]);
			}
		}
		
		//Count of each char..
		Map<Character, Integer> tempMap = new HashMap<Character, Integer>();
		for (char eachChar : stringChar) {
			System.out.println(eachChar);			
			if(tempMap.containsKey(eachChar)) {
				tempMap.put(eachChar, tempMap.get(eachChar)+1);
			} else {
				tempMap.put(eachChar, 1);
			}			
		}
		System.out.println("Map containing char value:"+tempMap);
		//print only char having occurrence more than 1
		Set<Entry<Character, Integer>> setOfEntry = tempMap.entrySet();
		for (Entry<Character, Integer> eachEntry : setOfEntry) {
			if(eachEntry.getValue() > 1) {
				System.out.println(eachEntry.getKey());
			}
		}
		
		//print only distinct value..
		Set<Character> distinctChar = tempMap.keySet();
		System.out.println(distinctChar);
		
		//remove
		System.out.println("Before removal of duplicates :"+stringChar);

		Set<Character> setOfChar = new HashSet<Character>();
		for (Character eachCcharacter : stringChar) {
			setOfChar.add(eachCcharacter);
		}
		System.out.println(setOfChar);
		
	}

}
