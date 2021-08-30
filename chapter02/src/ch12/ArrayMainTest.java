package ch12;

public class ArrayMainTest {

	// start of main
	public static void main(String[] args) {

		Book book1 = new Book(1, "흐르는 강물처럼", "파울로코엘료");
		Book book2 = new Book(2, "플러터UI실전", "김근호");
		Book book3 = new Book(3, "무궁화꽃이피엇습니다", "김진명");
		Book book4 = new Book(4, "리딩으로리드하다", "이지성");
		Book book5 = new Book(5, "사피엔스", "유발하라리");

		// 배열을 이용하여 shoppingCart 변수에 담기
		// 1. 배열을 선언하고 크기를 10으로 만들기
		Book[] shoppingCart = new Book[10];

		// 2. 사고싶은 책을 장바구니에 담기
		shoppingCart[0] = book1;
		shoppingCart[1] = book3;
		shoppingCart[2] = book5;

		// 3. 장바구니에 담은 정보를 화면에 출력
		for (int i = 0; i < shoppingCart.length; i++) {
			if (shoppingCart[i] != null) {
				shoppingCart[i].showInfo();
			}
		}
		
		// 4. 0번째 인덱스에 선택하지 않은 책을 추가하고
		// 기존의 책들은 뒤로 밀기
		shoppingCart[0] = book3;
		shoppingCart[1] = book1;
		shoppingCart[2] = book2;
		shoppingCart[3] = book5;
		
		System.out.println("----------------------------");
		
		// 확장 for문		
		for(Book book : shoppingCart) {
			if(book != null) {
				book.showInfo();
			}
		}
		System.out.println("----------------------------");
		
		// 3번 인덱스를 지우기
		shoppingCart[3] = null;
		
		// 확장 for문
		for(Book abc : shoppingCart) {
			if(abc != null) {
				abc.showInfo();
			}
		}
		
		
	} // end of main

} // end of class
