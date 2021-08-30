package ch03;

public abstract class Car {

	public void StartCar() {
		System.out.println("시동을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	
	public abstract void drive();
	
	public abstract void stop();
	
	// 핵심 !!
	// 하이 클래스에서 재정의 할 수 없게 만듬
	final public void run() {
		// 메서드의 순서 (템플릿을 지정할 수 있다)
		StartCar();
		drive();
		stop();
		turnOff();
	}
	
}
