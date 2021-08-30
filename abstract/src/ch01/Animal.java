package ch01;

public abstract class Animal {

	// 추상 클래스(abstract class)
	// 하나 이상의 추상메서드를 포함하는 클래스
	
	public String name; // 멤버 변수
	
	// 일반 메서드
	public void move() {
		System.out.println("동물 이동합니다");
	}
	
	// 추상 메서드
	public abstract void hunt();
	
	// 메인 함수
	public static void main(String[] args) {
		// 추상 클래스는 일반적으로 사용했던 new 키워드를 사용해서 인스턴스화할 수 없다
		// new Animal();
		
	}
	
}
