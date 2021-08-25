package ch06;

public class CarMainTest {

	public static void main(String[] args) {

		Car car = new Car("제네시스", 5000);
		car.showInfo();
		
		System.out.println(car.engine.name);
		System.out.println(car.engine.price);
		System.out.println(car.engine);
		
	}

}
