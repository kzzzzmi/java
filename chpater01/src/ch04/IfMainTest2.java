package ch04;

import java.util.Scanner;

public class IfMainTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("������ �Է��ϼ��� : ");
		int score = sc.nextInt();
		char result = 'X';

		if (score <= 100 && score >= 0) {
			if (score >= 90) {
				result = 'A';
			} else if (score >= 80) {
				result = 'B';
			} else if (score >= 70) {
				result = 'C';
			} else if (score >= 60) {
				result = 'D';
			} else {
				result = 'F';
			}
			System.out.println("����� ������ " + result + "�Դϴ�.");
		} else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.!");
		}
	}

}