package ch01;

public class Eagle extends Animal {

	@Override
	public void hunt() {
		System.out.println("독수리가 날아서 토끼를 사냥합니다");
	}
	
	@Override
	public void move() {
		System.out.println("독수리가 날개를 쭉 펴고 날아갑니다");
	}
	
}
