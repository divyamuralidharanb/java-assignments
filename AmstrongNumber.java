package week1.day2;

public class AmstrongNumber {
	
	public void amstrongNumber(int num) {
		int sum = 0;
		int givenNo = num;
		while(num>0) {
			int digit = num%10;
			sum = sum + digit*digit*digit;
			num = num/10;
		}
		if(givenNo == sum) {
			System.out.println("Given number is Amstrong number");
		}
		else {
			System.out.println("Given number is not Amstrong number");
		}
	}
	
	public static void main(String[] args) {
		AmstrongNumber ams = new AmstrongNumber();
		ams.amstrongNumber(153);
	}

}
