package ch03;

public class MainTest1 {

	public static void main(String[] args) {
		
		// ���� ������ (=)
		int number = 10;
		// ���꿡 ������ �����ʿ��� �������� �����
		
		int number2 = number;
		// ������ ������ ������ ���� �ִ�
		
		System.out.println(number);
		System.out.println(number2);
		System.out.println("========================");
		
		// ��ȣ ������ (+, -)
		System.out.println(-number);
		// ��ȣ�� �����ϴ� ������
		// ��, ������ �� ���� ���� �����ϴ� ���� �ƴ�
		System.out.println(number);
		System.out.println("========================");
		
		// ������ ���� ���� �����Ϸ��� ���� �����ڸ� ����ؾ� �Ѵ�.
		number = -number;
		System.out.println(number);
	}

}