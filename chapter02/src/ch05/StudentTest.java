package ch05;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(10, "Lee");
		studentLee.setKoreaSubject(150);
		studentLee.setMathSubject(80);
		studentLee.showStudentScore();
		
		System.out.println("---------------------");
		
		Student studentKim = new Student(20, "Kim");
		studentKim.setKoreaSubject(90);
		studentKim.setMathSubject(100);
		studentKim.showStudentScore();
		
	}

}
