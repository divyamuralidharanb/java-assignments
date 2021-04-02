package week3.day2.assignments;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrence {

	public static void main(String[] args) {
		/* 
		Write a Java Program to Find the Occurance of Each Character in the given String
		
		PseudoCode:
		1. Create a String with given value
		2. Convert the string into a char array		
		3. Create an empty Map<Character,Integer>
		4. Iterate over the array
		5. Check whether the Map contains the Character
		6. If it contains then increment the key (+1)
		7. Add the character in the map & set the value as 1
		8. Print the Map */
		
		String input = "Welcome to Selenium automation";
		char[] characters = input.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
				
		for (char ch : characters) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		System.out.println(map.entrySet());

	}

}
