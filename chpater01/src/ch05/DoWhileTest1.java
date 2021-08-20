package ch05;

public class DoWhileTest1 {

	public static void main(String[] args) {
		
		int input = 10;
		int sum = 0;
		final int LIMIT = 10;
		
		do {
			System.out.println("ÇöÀç °ª : " + input);
			input--;
		} while(input != LIMIT);
	}

}
