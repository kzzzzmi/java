package ch05;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input;
		int sum = 0;
		
		System.out.println("������ ������ �Է��ϼ��� : ");
		
		// input ���� 0�� �ƴϸ� ��� �Է°��� ���� �� �ֵ��� ó���ϱ�
		do {
			input = sc.nextInt();
			sum += input;
		} while (input != 0);
		System.out.println(sum);

	}

}