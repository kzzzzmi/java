package ch01;

// HomeAppliances 클래스를 직접 new해서 사용할 필요가 없기 때문에 추상클래스로 만들어 줌
public abstract class HomeAppliances {

	int width;
	int height;
	String color;
	
	public abstract void turnOn();
	
	public abstract void turnOff();
	
}
