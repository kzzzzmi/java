package ch05;

public class ForMainTest2 {

	public static void main(String[] args) {

		/*
		 * ȭ�鿡 ������ 2�� ����ϱ� int num = 2;
		 * 
		 * for(int i=1; i<=9; i++) { System.out.println(num + " X " + i + " = " + (num *
		 * i)); }
		 */

		// ȭ�鿡 ������ ����ϱ�
		/*
		 * for (int i = 1; i <= 9; i++) { for (int j = 1; j <= 9; j++) {
		 * System.out.println(i + " X " + j + " = " + (i * j)); } System.out.println();
		 * }
		 */

		// �����

		int maxStar = 10;

		for (int i = 1; i <= maxStar; i += 2) {
			for (int j = maxStar; j > i; j -= 2) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}