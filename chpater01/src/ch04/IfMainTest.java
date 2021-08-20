package ch04;

import java.util.Scanner;

public class IfMainTest {

	public static void main(String[] args) {
		
		// 제어문 if
		// 주어진 조건에 따라서 실행이 이루어지도록 구현
		boolean flag = true;
		
		// if문 단독
		if(flag) {
			System.out.println("조건식이 true이면 실행됩니다.");
		} // end of if
		
		// if-else 문
		if(flag) {
			System.out.println("true 실행");
		} else {
			System.out.println("false 실행");
		}
		
		// if-else if-else 문
		System.out.println("점수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		
		
		if(point >= 90) {
			System.out.println("A");
		} else if(point >= 80) {
			System.out.println("B");
		} else if(point >= 70) {
			System.out.println("C");
		} else if(point >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		

	}
	

}
