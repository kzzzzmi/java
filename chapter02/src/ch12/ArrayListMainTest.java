package ch12;

import java.util.ArrayList;

public class ArrayListMainTest {

	public static void main(String[] args) {

		Book book1 = new Book(1, "흐르는 강물처럼", "파울로코엘료");
		Book book2 = new Book(2, "플러터UI실전", "김근호");
		Book book3 = new Book(3, "무궁화꽃이피엇습니다", "김진명");
		Book book4 = new Book(4, "리딩으로리드하다", "이지성");
		Book book5 = new Book(5, "사피엔스", "유발하라리");

		// ArrayList 사용법
		// 데이터를 담을 공간 만들기
		// * ArrayList는 배열과 달리 공간의 크기를 먼저 선언할 필요가 없다 (동적으로 배열 사용 가능)
		ArrayList<Book> shoppingCart = new ArrayList<Book>();

		// 추가 방법 1
		shoppingCart.add(book1); // [0]
		shoppingCart.add(book2); // [1]
		shoppingCart.add(book5); // [2]

		// 추가 방법 2
		shoppingCart.add(0, book3);

		// 출력
		for (int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo();
		}

		System.out.println("-----------------------------");

		// 삭제 방법
		shoppingCart.remove(3);

		// ArrayList의 크기는 3
		// index 크기는 0~2

		System.out.println("-----------------------------");

		// shoppigCart.removeAll();

		// 출력
		for (int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo();
		}

		// 수정
		shoppingCart.set(1, book4);

		System.out.println("-----------------------------");

		for (Book book : shoppingCart) {
			book.showInfo();
		}

		// C R U D
		// create, read, update, delete

	}

}
