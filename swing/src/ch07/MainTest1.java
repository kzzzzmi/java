package ch07;

import java.util.Arrays;
import java.util.Random;

public class MainTest1 {

	public static void main(String[] args) {

		int[] numbers = new int[6];
		Random random = new Random();

		// ���� ��ȣ
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if(numbers[i] == numbers[j]) {
					i--;
					break;
				}
			}
		}

		Arrays.sort(numbers); // Array �����ϴ� �޼���

		for (int i : numbers) {
			System.out.println("������ �� : " + i);
		}

	}

}
