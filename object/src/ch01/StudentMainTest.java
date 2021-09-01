package ch01;

public class StudentMainTest {

	public static void main(String[] args) {

		Object ob;
		Student student1 = new Student(1, "홍길동");
		Student student2 = new Student(2, "티모");
		Student student3 = new Student(2, "티모");
		
		// toString
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
		System.out.println("---------------------");
		
		if(student1.equals(student2)) {
			System.out.println("논리적으로 같은 객체입니다");
		} else {
			System.out.println("논리적으로 다른 객체입니다");
		}
		
	}

}
