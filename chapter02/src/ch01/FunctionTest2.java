package ch01;

public class FunctionTest2 {

	// start of main
	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 20;
		System.out.println(addNum(n1, n2)); 	// return 값이 double 형이라서 소수점이 찍힘
		
		sayHello("잼잼");
		System.out.println(calcSum());

	}
	// end of main

	// 함수 생성
	public static double addNum(double n1, double n2) {
		return n1 + n2;
	}

	// return 값이 없는 함수 정의
	public static void sayHello(String greeting) {
		System.out.println("Hello " + greeting);
	}

	// 매개변수가 없는 함수 설계
	public static int calcSum() {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}

}
