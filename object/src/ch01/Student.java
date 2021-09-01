package ch01;

public class Student {

	private int studentId;
	private String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	// toString �޼��� ������
	// �й� : 1234, �̸� : ȫ�浿
	@Override
	public String toString() {
		return "�й� : " + studentId + ", �̸� : " + studentName;
	}
	
	// equals �޼��� ������
	// �������� �й��� �̸��� ���ٸ� ���� ��ü��� �����غ���
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student temp = (Student)obj;
			if(temp.studentId == this.studentId && this.studentName == temp.studentName) {
				return true;
			}
		}
		return false;
	}	
	
}
