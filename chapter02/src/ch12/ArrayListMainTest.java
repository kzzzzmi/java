package ch12;

import java.util.ArrayList;

public class ArrayListMainTest {

	public static void main(String[] args) {

		Book book1 = new Book(1, "�帣�� ����ó��", "�Ŀ���ڿ���");
		Book book2 = new Book(2, "�÷���UI����", "���ȣ");
		Book book3 = new Book(3, "����ȭ�����Ǿ����ϴ�", "������");
		Book book4 = new Book(4, "�������θ����ϴ�", "������");
		Book book5 = new Book(5, "���ǿ���", "�����϶�");

		// ArrayList ����
		// �����͸� ���� ���� �����
		// * ArrayList�� �迭�� �޸� ������ ũ�⸦ ���� ������ �ʿ䰡 ���� (�������� �迭 ��� ����)
		ArrayList<Book> shoppingCart = new ArrayList<Book>();

		// �߰� ��� 1
		shoppingCart.add(book1); // [0]
		shoppingCart.add(book2); // [1]
		shoppingCart.add(book5); // [2]

		// �߰� ��� 2
		shoppingCart.add(0, book3);

		// ���
		for (int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo();
		}

		System.out.println("-----------------------------");

		// ���� ���
		shoppingCart.remove(3);

		// ArrayList�� ũ��� 3
		// index ũ��� 0~2

		System.out.println("-----------------------------");

		// shoppigCart.removeAll();

		// ���
		for (int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo();
		}

		// ����
		shoppingCart.set(1, book4);

		System.out.println("-----------------------------");

		for (Book book : shoppingCart) {
			book.showInfo();
		}

		// C R U D
		// create, read, update, delete

	}

}
