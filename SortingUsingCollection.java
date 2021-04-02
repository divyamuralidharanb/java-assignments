package week3.day2.assignments;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] input = {"HCL","Wipro","Aspire Systems","CTS","Infosys"};
		Arrays.sort(input);
		
		for(int i = input.length-1; i >= 0; i--) {
			System.out.println(input[i]);
		}
	}

}
