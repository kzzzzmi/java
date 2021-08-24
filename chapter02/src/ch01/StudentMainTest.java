package ch01;

public class StudentMainTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		Student s1;	// Student 참조 타입 s1 변수 선언
		Student s2;	// Student 참조 타입 s2 변수 선언
		
		s1 = new Student();	// s1 초기화 (인스턴스)
		s2 = new Student();	// s2 초기화 (인스턴스)

		System.out.println(s1);	// 힙 메모리의 인스턴스 주소를 가르킴
		System.out.println(s2);

	}

}
