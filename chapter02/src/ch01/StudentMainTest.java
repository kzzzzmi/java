package ch01;

public class StudentMainTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		Student s1;	// Student ���� Ÿ�� s1 ���� ����
		Student s2;	// Student ���� Ÿ�� s2 ���� ����
		
		s1 = new Student();	// s1 �ʱ�ȭ (�ν��Ͻ�)
		s2 = new Student();	// s2 �ʱ�ȭ (�ν��Ͻ�)

		System.out.println(s1);	// �� �޸��� �ν��Ͻ� �ּҸ� ����Ŵ
		System.out.println(s2);

	}

}
