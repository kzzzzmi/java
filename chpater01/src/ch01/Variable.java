package ch01;

public class Variable {
	// start of main
	public static void main(String[] args) {
		
		// 변수를 사용하는 방법
		int age; 				// 변수를 선언
		int count; 			// 변수를 선언
		
		// 초기화 (값을 대입하다)
		age = 10;
		count = 100;
		
		System.out.println(age);
		System.out.println(count);
		
		age = 300;
		System.out.println(age);
		
		count = 500;
		System.out.println(count);
		
		int count2 = 77;
		System.out.println(count2);
		
		// 변수의 이름을 만들때 규칙
		
		// 1. 대소문자가 구별 되며 길이에 제한이 없다.
		int name = 100;
		int Name = 20;	// 단, 변수명을 처음부터 대문자로 표기하지 않는다
		
		// 2. 자바에서는 JDK가 미리 정해둔 예약어를 사용할 수 없다.
//		int if;
//		int for;
//		int while
		
		// 3. 변수는 숫자로 시작할 수 없다.
//		int 7name;
//		int 55age;
		
		// 4. 특수문자는 _ , $ 사용 가능하다
		int _age;
		int $name;
		
		// 핵심 : 변수는 값을 저장할 수 있는 메모리 공간을 의미한다.
		// 이름에서 알 수 있듯이 변하는 수, 변할 수 있는 수이다.	
		
	} // end of main

} // end of class
