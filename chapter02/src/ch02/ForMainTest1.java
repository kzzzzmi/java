package ch02;

public class ForMainTest1 {

	// ���� �Լ�(�ڵ��� ������)
	public static void main(String[] args) {

		int maxStar = 5;

		for (int i = maxStar; i > 0; i--) {
			
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	// end of main

}
