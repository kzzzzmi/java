package ch05;

public class WhileMainTest2 {

	public static void main(String[] args) {
		
		// 1���� 10���� ���ؼ� �� ������� ���
		int num = 1;
		int sum = 0;
		
		// while ���� ����ؼ� 1���� 10���� ���� ����� ���
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("����� : " + sum);

	}

}
