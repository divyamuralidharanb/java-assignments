package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

//Input: "PayPal India"
//Output: PaylIndi

public class RemoveDuplicates {

	public static void main(String[] args) {		
		
//		Declare a String as PayPal India
//		Convert it into a character array
//		Declare a Set as charSet for Character
//		Declare a Set as dupCharSet for duplicate Character
//		Iterate character array and add it into charSet
//		if the character is already in the charSet then, add it to the dupCharSet
//		Check the dupCharSet elements and remove those in the charSet
//		Iterate using charSet
//		Check the iterator variable isn't equals to an empty space
//		print each character for charSet
		
		String input = "PayPal India";
		
		char[] characters = input.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		
		for (Character ch : characters) {
			if(!charSet.contains(ch)) {
				charSet.add(ch);
			}
			else {
				dupCharSet.add(ch);
			}
		}
		//System.out.println(charSet);
		//System.out.println(dupCharSet);
		
		charSet.removeAll(dupCharSet);
		
		//System.out.println(charSet);		
		
		for (Character ch : charSet) {
			if(!ch.equals(' ')) {
				System.out.print(ch);
			}
		}
	}
	

}
