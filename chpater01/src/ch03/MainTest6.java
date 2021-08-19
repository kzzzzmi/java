package ch03;

import java.util.Scanner;

public class MainTest6 {

	public static void main(String[] args) {
		
		// 삼항 연산자
		// 조건식 ? true일 경우 : false일 경우
		
		int num1 = (5 > 3) ? 10 : 20;
		System.out.println(num1);
		
		int num2 = (5 < 3) ? 10 : 20;
		System.out.println(num2);
		System.out.println("=========================");
		// JDK가 만들어준 도구를 이용
		int max;
		System.out.println("두 개의 입력값 중 큰 수를 출력하세요!");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int x = sc.nextInt();
		System.out.print("입력2 : ");
		int y = sc.nextInt();
		
		max = (x >= y) ? x : y;
		System.out.println("큰 숫자는 " + max + "입니다.");

	}

}
