package ch02;

public class Archer extends Hero {
	
	public Archer(String name, int hp) {
		super(name, hp);
	}

	public void fireArrow() {
		System.out.println("불화살을 쏩니다");
	}
	
}
