package ch01;

public class FunctionTest {
	// start of main
	public static void main(String[] args) {

		// 함수의 사용
		int result = add(100, 50);
		System.out.println(result);

		int result2 = add(500, 500);
		System.out.println(result2);
	}
	// end of main

	// add 함수 생성
	public static int add(int num1, int num2) {
		return num1 + num2;
	}

}
