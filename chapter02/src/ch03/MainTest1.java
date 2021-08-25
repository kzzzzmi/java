package ch03;


public class MainTest1 {

	public static void main(String[] args) {

//		Student student1 = new Student();
//		student1.name = "È«±æµ¿";
//		student1.id = 1;
//		student1.grade = 3;
		
		Student student2 = new Student(2, "ÀëÀë", 100);
		System.out.println(student2.name);
		
		student2.name = "Æ¼¸ğ";
		System.out.println(student2.name);
	}

}
