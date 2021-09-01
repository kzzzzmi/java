package ch01;

// 모든 클래스의 최상위 클래스는 Object 클래스이다 !

public class BookMainTest {

	public static void main(String[] args) {

		Book book1 = new Book("플러터UI실전", "김근호");
		Book book2 = new Book("플러터UI실전", "김근호");

		System.out.println(book1.hashCode());
		
		String str = "test";
		System.out.println(str);		// String 클래스의 toString 또한 Object의 toString을 재정의한 것
		
		System.out.println(str.toString());

		if(book1 == book2) {
			System.out.println("같은 객체입니다");
		} else {
			System.out.println("다른 객체입니다");
		}
		
		// equals book1 book2
		System.out.println(book1.equals(book2));
		String name = "김재민";
		
	}

}
