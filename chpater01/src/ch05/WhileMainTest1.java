package ch05;

public class WhileMainTest1 {

	public static void main(String[] args) throws InterruptedException {
		
		int num = 1;
		
		while(num < 100) {
			System.out.println("ÇöÀç °ª : " + num);
			num++;
			Thread.sleep(100);
		}

	}

}
