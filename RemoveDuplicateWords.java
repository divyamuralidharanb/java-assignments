package week1.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {
	
	public void removeDuplicates(String sentence) {
		String[] words = sentence.split(" ");
		String finalSentence = "";
		
		Set<String> wordSet = new LinkedHashSet<String>();
		for(String word: words) {
			wordSet.add(word);
		}
		for (String word : wordSet) {
			finalSentence = finalSentence + word;
			finalSentence += " ";
		}
		System.out.println(finalSentence);
	}
	
	public static void main(String[] args) {
		RemoveDuplicateWords dupl = new RemoveDuplicateWords();
		dupl.removeDuplicates("I love love my baby baby");
	}

}
