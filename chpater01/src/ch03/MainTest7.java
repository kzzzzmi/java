package ch03;

public class MainTest7 {

	public static void main(String[] args) {
		
		// 복합 대입 연산자
		// 대입 연산자가 다른 연산자와 함께 사용됨(편의를 위해)
		
		int num1 = 1;
		//num1 = num1 + 10;
		num1 += 10;
		System.out.println(num1);
		System.out.println("==================");
		
		int num2 = 1;
		//num2 = num2 - 10;
		num2 -= 10;
		System.out.println(num2);
		System.out.println("==================");
		
		num1 *= 2;
		System.out.println(num1);
		System.out.println("==================");
		
		num2 /= 2; 
		System.out.println(num2);
		System.out.println("==================");
		
		num2 %= 2;
		System.out.println(num2);

	}

}
