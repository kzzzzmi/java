package ch05;

public class ForMainTest1 {

	public static void main(String[] args) {

		/*
		 * for(�ʱ�ȭ��; ���ǽ�; ��������) { ���๮; }
		 */

		// for���� �̿��ؼ� 1���� 10���� ���� ����
		// ������ ����� ���� ������ �ʿ���

		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
