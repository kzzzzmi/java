package ch03;

public class Student {

	int id;
	String name;
	int grade;
	
	// ������ - constructor
	// ��ü�� ������ �� ������ ���� ������� ������� �����ϴ� ��
	// ��ü�� ������ �� �������� �ο��ϴ� ��
	
	// �⺻ ������(default)
	// �����Ϸ��� �ڵ����� �������� ������
	
//	public Student() {
//		
//	}
	// Ŭ�������� �ݵ�� �ϳ� �̻��� �����ڰ� �����Ѵ�.
	// Ŭ������ �����ڰ� �ϳ��� ���� ��� �����Ϸ��� default �����ڸ� �ڵ� ������
	// public Ŭ������() {}
	
	// ����� ���� ������ (�����ڰ� ���� ����)
	public Student(int id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
}
