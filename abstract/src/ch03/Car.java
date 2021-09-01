package ch03;

public abstract class Car {

	public void StartCar() {
		System.out.println("시동을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	
	public abstract void wiper();		// 강제성
	
	public abstract void drive();
	
	public abstract void stop();
	
	// 훅(hook) 메서드
	// 필요하면 사용하는 클래스에서 직접 구현해서 사용하라 (강제성은 없음)
	public void washCar() {	// 일반 메서드이지만 빈 메서드
		
	}
	
	// 핵심 !!
	// 하이 클래스에서 재정의 할 수 없게 만듬
	final public void run() {
		// 메서드의 순서 (템플릿을 지정할 수 있다)
		StartCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
	
}
