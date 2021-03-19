package week1.day2;

import java.util.Arrays;

public class Anagram {
	
	public void isAnagram(String str1, String str2) {
		if(str1.length()==str2.length()) {
			char[] arr1 = str1.toCharArray();
			Arrays.sort(arr1);
			char[] arr2 = str2.toCharArray();
			Arrays.sort(arr2);
			int counter = 0;
			for (int i = 0; i < arr1.length; i++) {
				if(arr1[i]==arr2[i]) {
					counter += 1;
				}				
			}
			if(counter == arr1.length) {
				System.out.println("Given Strings are anagrams: "+str1+","+str2);
			}
			else {
				System.out.println("Given Strings are NOT anagrams: "+str1+","+str2);
			}
		}
		else {
			System.out.println("Given Strings are NOT anagrams: "+str1+","+str2);
		}
	}
	
	
	public static void main(String[] args) {
		Anagram ana = new Anagram();
		ana.isAnagram("listen", "silent");
	}

}
