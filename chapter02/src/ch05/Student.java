package ch05;

public class Student {

	int studentId;
	String name;
	Subject korea;		// 참조타입을 멤버 변수로 사용할 경우 이 객체를 선언했는지 봐야함
	Subject math;
	
	public Student(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
		korea = new Subject("국어");
		math = new Subject("수학");
	}
	
	// 국어 성적 셋팅
	public void setKoreaSubject(int score) {
		korea.score = score;
	}
	
	// 수학 성적 셋팅
	public void setMathSubject(int score) {
		math.score = score;
	}
	
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println("학생의 이름은 : " + name);
		System.out.println("학생의 총점은 : " + total);
		System.out.println("학생의 평균은 : " + total / 2);
	}
	
}
