package ch05;

public class Student {

	int studentId;
	String name;
	Subject korea;		// ����Ÿ���� ��� ������ ����� ��� �� ��ü�� �����ߴ��� ������
	Subject math;
	
	public Student(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
		korea = new Subject("����");
		math = new Subject("����");
	}
	
	// ���� ���� ����
	public void setKoreaSubject(int score) {
		korea.score = score;
	}
	
	// ���� ���� ����
	public void setMathSubject(int score) {
		math.score = score;
	}
	
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println("�л��� �̸��� : " + name);
		System.out.println("�л��� ������ : " + total);
		System.out.println("�л��� ����� : " + total / 2);
	}
	
}
