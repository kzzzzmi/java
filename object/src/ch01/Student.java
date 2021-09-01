package ch01;

public class Student {

	private int studentId;
	private String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	// toString 메서드 재정의
	// 학번 : 1234, 이름 : 홍길동
	@Override
	public String toString() {
		return "학번 : " + studentId + ", 이름 : " + studentName;
	}
	
	// equals 메서드 재정의
	// 논리적으로 학번과 이름이 같다면 같은 객체라고 정의해보기
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
