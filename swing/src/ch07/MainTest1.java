package ch07;

import java.util.Arrays;
import java.util.Random;

public class MainTest1 {

	public static void main(String[] args) {

		int[] numbers = new int[6];
		Random random = new Random();

		// 랜덤 번호
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if(numbers[i] == numbers[j]) {
					i--;
					break;
				}
			}
		}

		Arrays.sort(numbers); // Array 정렬하는 메서드

		for (int i : numbers) {
			System.out.println("생성된 값 : " + i);
		}

	}

}
