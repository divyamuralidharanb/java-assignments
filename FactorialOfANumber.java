package week1.day2;

public class FactorialOfANumber {
	
	public void getFactorial(int num) {
		int factorial = 1;
		for(int i=2; i<=num; i++) {
			factorial = factorial*i;
		}
		System.out.println("The Factorial of the given number is: "+factorial);
	}
	
	public static void main(String[] args) {
		FactorialOfANumber fact = new FactorialOfANumber();
		fact.getFactorial(5);
	}

}
