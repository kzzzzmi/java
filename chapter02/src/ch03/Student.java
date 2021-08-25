package ch03;

public class Student {

	int id;
	String name;
	int grade;
	
	// 생성자 - constructor
	// 객체를 생성할 때 다음과 같은 모양으로 만들어라고 지시하는 것
	// 객체를 생성할 때 강제성을 부여하는 것
	
	// 기본 생성자(default)
	// 컴파일러가 자동으로 생성해준 생성자
	
//	public Student() {
//		
//	}
	// 클래스에는 반드시 하나 이상의 생성자가 존재한다.
	// 클래스에 생성자가 하나도 없는 경우 컴파일러가 default 생성자를 자동 생성함
	// public 클래스명() {}
	
	// 사용자 정의 생성자 (개발자가 직접 정의)
	public Student(int id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
}
