package week1.day2;

public class OddIndexToUpperCase {
	
	public void changeOddIndexToUppercase(String word) {
		String transformedWord = "";
		for(int i=0; i<word.length(); i++) {			
			if(i%2 == 0) {
				transformedWord = transformedWord + word.toUpperCase().charAt(i);
			}
			else {
				transformedWord = transformedWord + word.charAt(i);
			}			
		}
		System.out.println(transformedWord);
	}
	
	public static void main(String[] args) {
		OddIndexToUpperCase odd = new OddIndexToUpperCase();
		odd.changeOddIndexToUppercase("Krishika");
	}

}
