package ch08;

public class Person {

	// this란 ? 
	// 1. 인스턴스(객체) 자기 자신의 힙 메모리에서의 주소를 가리킨다.
	// 2. 생성자에서 또 다른 생성자를 호출할 때 사용할 수 있다
	// 3. 자신의 주소(참조값, 주소값)를 반환시킬 수 있다.
	
	String name;
	int age;
	String phoneNumber;
	
	// 1. 
	public Person(String name, int age) {
		System.out.println("생성자 1번 호출");
		this.name = name;
		this.age = age;
	}
	
	// 2.
	public Person() {
		this("이름 없음", 1);
		System.out.println("생성자 2번 호출");
	}
	
	public Person(String name, int age, String phoneNumber) {
		// this.name = name;
		// this.age = age;
		this(name, age);
		this.phoneNumber = phoneNumber;
	}
	
	// 3.
	public Person getPerson() {
		return this;
	}
	
}