package week1.day2;

public class ReverseEvenWordsInSentence {
	
	public void reverseEvenWords(String sentence) {
		String[] words = sentence.split(" ");
		String reversedWord = "";
		for (int i = 0; i < words.length; i++) {
			if(i%2 != 0) {
				for (int j = words[i].length()-1; j >= 0 ; j--) {
					reversedWord = reversedWord + words[i].charAt(j);
				}
			}
			else {
				reversedWord = reversedWord +" "+ words[i];
				reversedWord = reversedWord +" ";
			}			 
		}
		System.out.println(reversedWord);
	}
	
	public static void main(String[] args) {
		ReverseEvenWordsInSentence rev = new ReverseEvenWordsInSentence();
		rev.reverseEvenWords("Learning Java is interesting");
	}

}
