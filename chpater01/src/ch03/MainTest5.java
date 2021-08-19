package ch03;

public class MainTest5 {

	public static void main(String[] args) {
		
		// 논리 연산자(&&, ||) 엠퍼센트, 버티컬 바
		// 관계 연산자와 혼합해서 많이 사용됨
		// 연산의 결과가 true, false
		
		int num1 = 10;
		int num2 = 20;
		
		// 1. AND 연산자 (논리곱)
		boolean flag1 = (num1 > 0) && (num2 > 0);
		System.out.println(flag1);
		
		boolean flag2 = (num1 > 0) && (num2 < 0);
		System.out.println(flag2);

		// 2.  OR 연산자 (논리합)
		boolean flag3 = (num1 > 0) || (num2 > 0);
		System.out.println(flag3);
		
		boolean flag4 = (num1 > 0) || (num2 < 0);
		System.out.println(flag4);
		
		
		// 단락 평가는 첫 번째 값만으로 결과가 확실할 때 두 번째 값은 확인(평가)하지 않는 방법을 말한다.
		// AND와 OR에서 사용되는 일종의 규칙임
	}

}
