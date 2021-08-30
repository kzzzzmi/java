package ch11;

import java.util.Iterator;

public class ArrayMainTest {

	public static void main(String[] args) {

		// 배열
		// 같은 자료형인 데이터를 모아서 통으로 관리하기 위해 사용하는 자료구조이다
		// 변수가 하나의 데이터를 저장하기위한 것이라면 배열은 여러개의 데이터를 하나의 변수에
		// 저장하기 위한 것이라고 볼 수 있다

		int number = 10;

		// 선언 방법
		int[] arr1 = new int[3];
		int arr2[] = new int[10];

		// 초기화하는 방법 (값을 대입하는 법)
		arr1[0] = 33;
		arr1[1] = 10;
		arr1[2] = 11;

		// 배열 선언과 동시에 초기화하기
		int[] arr3 = new int[] { 11, 20, 30 };
		int[] arr4 = { 10, 50, 100 };

		// 출력 방법
//		System.out.println(arr3[0]);
//		System.out.println(arr3[1]);
//		System.out.println(arr3[2]);

		//
		String[] strArr = new String[10];
		strArr[0] = "야스오";
		strArr[1] = "티모";
		strArr[2] = "애쉬";
		strArr[3] = "다리우스";

		// 문제1 strArr 0, 1, 2, 3 화면에 출력
//		System.out.println(strArr[0]);
//		System.out.println(strArr[1]);
//		System.out.println(strArr[2]);
//		System.out.println(strArr[3]);
		// 모든 프로그래밍 언어에서는 index 0부터 시작

		// 배열을 사용할 때 보통 for문과 관계지어 많이 사용함
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i] != null) {
				System.out.println(strArr[i]);
			}
		}

	}

}
