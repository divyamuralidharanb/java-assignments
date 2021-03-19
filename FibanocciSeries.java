package week1.day2;

public class FibanocciSeries {
	
	public void fibanocciSeries(int range) {
		int first = 0;
		int second = 1;
		System.out.println(first);
		System.out.println(second);
		for(int i=2; i<range; i++) {
			int third = first + second;
			System.out.println(third);
			first = second;
			second = third;
		}
	}
	
	public static void main(String[] args) {
		FibanocciSeries fs = new FibanocciSeries();
		fs.fibanocciSeries(8);
	}

}
