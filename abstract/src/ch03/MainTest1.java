package ch03;

public class MainTest1 {

	public static void main(String[] args) {

		Car AICar = new AICar();
		Car ManualCar = new ManualCar();
		
		AICar.run();
		System.out.println("----------------");
		ManualCar.run();
		
	}

}
