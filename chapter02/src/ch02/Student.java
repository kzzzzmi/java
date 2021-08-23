package ch02;

import java.util.Random;

public class Student {

	// ��ü�� �Ӽ�(����)�� ��� ������, ��ü�� ����� ��� �޼���� �����Ѵ�.

	int studentId;
	String studentName;
	String studentAddress;

	// �޼��� ����

	public void study() {
		System.out.println(studentName + "�� ���θ� �մϴ�.");
	}

	public void breakTime() {
		System.out.println(studentName + "�� �޽��� �մϴ�.");
	}

	public void showInfo() {
		System.out.println("�̸� : " + studentName);
		System.out.println("���̵� : " + studentId);
		System.out.println("�ּ� : " + studentAddress);
	}

	public static void main(String[] args) {

		Student studentKim = new Student();

		studentKim.studentName = "������";
		studentKim.studentId = 2;
		studentKim.studentAddress = "�ǹ̴� �ʹ� �Ϳ���";

		studentKim.study();
		studentKim.breakTime();
		studentKim.showInfo();

		System.out.println("---------------------------");

		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.studentId = 2;
		studentLee.studentAddress = "�λ�� ������";

		studentLee.study();
		studentLee.breakTime();
		studentLee.showInfo();

		System.out.println("---------------------------");

		for (int i = 0; i < 5; i++) {
			System.out.println(randomNumber());
		}
	}

	// �Լ� �����
	public static int randomNumber() {
		Random random = new Random();
		return (random.nextInt(45) + 1);
	}

}
