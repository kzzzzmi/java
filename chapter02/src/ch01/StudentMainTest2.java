package ch01;

public class StudentMainTest2 {

	public static void main(String[] args) {
		
		// 선언과 동시에 초기화 
				Student student1 = new Student(); 
				
				student1.name = "홍길동";
				student1.height = 175; 
				student1.weight = 68; 
				
				
				System.out.println(student1);
				
				System.out.println(student1.name);
				System.out.println(student1.height);
				System.out.println(student1.weight);
				
				System.out.println("----------------------");
				
				Student student2 = new Student(); 
				
				student2.name = "이순신";
				student2.height = 180;
				student2.weight = 77;
				
				System.out.println(student2.name);
				System.out.println(student2.height);
				System.out.println(student2.weight);

	}

}
