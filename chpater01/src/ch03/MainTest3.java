package ch03;

public class MainTest3 {

	public static void main(String[] args) {
		
		// 증감 연산자
		// ++, --
		
		int num1 = 1;
		
		// num1 = num1 + 1;
		num1++;
		System.out.println(num1);
		
		int num2 = 1;
		num2--;
		// num2 = num2 - 1;
		System.out.println(num2);
		System.out.println("================");
		
		// 혼동 주의!!
		// 1. 증감 연산자가 뒤에 올 경우 => 문장이 끝난 후 증감 수행
		// 2. 증감 연산자가 앞에 올 경우 => 바로 증감 수행

	}

}
