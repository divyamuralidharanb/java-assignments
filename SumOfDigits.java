package week1.day2;

public class SumOfDigits {
	
	public static void sumOfDigits(int num) {
		int sum = 0;
		while(num>0) {
			sum = sum + num%10;
			num = num/10;
		}
		System.out.println("The sum of the digits of the given number is: "+sum);
	}
	
	public static void main(String[] args) {
		sumOfDigits(4545);
	}

}
