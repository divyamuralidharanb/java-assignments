package week1.day2;

public class SumOfDigitsFromString {
	
	public void sumOfDigits(String str) {
		String replace = str.replaceAll("[\\D]","");  // or [^0-9]
		char[] digits = replace.toCharArray();
		int sum = 0;
		for(char digit: digits) {
			sum = sum + Character.getNumericValue(digit);			
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		SumOfDigitsFromString sumObj = new SumOfDigitsFromString();
		sumObj.sumOfDigits("Tes12Le79af65");
	}

}
