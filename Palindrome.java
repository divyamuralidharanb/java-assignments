package week1.day2;

public class Palindrome {
	
	public void isPalindrome(String givenWord) {
		String reversedWord = "";
		for (int i = (givenWord.length()-1); i >= 0; i--) {
			reversedWord = reversedWord + givenWord.charAt(i);
		}		
		if(givenWord.equalsIgnoreCase(reversedWord)) {
			System.out.println("Given word "+givenWord+" is a palindrome");
		}
		else
			System.out.println("Given word "+givenWord+" is NOT a palindrome");
	}
	
	public static void main(String[] args) {
		Palindrome pal = new Palindrome();
		pal.isPalindrome("Malayalam");
	}

}
