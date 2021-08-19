package ch03;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 대입 연산자 (=)
		int number = 10;
		// 연산에 방향은 오른쪽에서 왼쪽으로 연산됨
		
		int number2 = number;
		// 변수에 변수를 대입할 수도 있다
		
		System.out.println(number);
		System.out.println(number2);
		System.out.println("========================");
		
		// 부호 연산자 (+, -)
		System.out.println(-number);
		// 부호를 변경하는 연산자
		// 단, 변수에 든 실제 값을 변경하는 것은 아님
		System.out.println(number);
		System.out.println("========================");
		
		// 변수에 실제 값을 변경하려면 대입 연산자를 사용해야 한다.
		number = -number;
		System.out.println(number);
	}

}
