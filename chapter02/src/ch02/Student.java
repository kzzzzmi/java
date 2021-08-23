package ch02;

import java.util.Random;

public class Student {

	// 객체의 속성(상태)은 멤버 변수로, 객체의 기능은 멤버 메서드로 구현한다.

	int studentId;
	String studentName;
	String studentAddress;

	// 메서드 정의

	public void study() {
		System.out.println(studentName + "이 공부를 합니다.");
	}

	public void breakTime() {
		System.out.println(studentName + "이 휴식을 합니다.");
	}

	public void showInfo() {
		System.out.println("이름 : " + studentName);
		System.out.println("아이디 : " + studentId);
		System.out.println("주소 : " + studentAddress);
	}

	public static void main(String[] args) {

		Student studentKim = new Student();

		studentKim.studentName = "김잼잼";
		studentKim.studentId = 2;
		studentKim.studentAddress = "뽀미는 너무 귀엽당";

		studentKim.study();
		studentKim.breakTime();
		studentKim.showInfo();

		System.out.println("---------------------------");

		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.studentId = 2;
		studentLee.studentAddress = "부산시 남포동";

		studentLee.study();
		studentLee.breakTime();
		studentLee.showInfo();

		System.out.println("---------------------------");

		for (int i = 0; i < 5; i++) {
			System.out.println(randomNumber());
		}
	}

	// 함수 만들기
	public static int randomNumber() {
		Random random = new Random();
		return (random.nextInt(45) + 1);
	}

}
