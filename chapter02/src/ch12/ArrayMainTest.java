package ch12;

public class ArrayMainTest {

	// start of main
	public static void main(String[] args) {

		Book book1 = new Book(1, "�帣�� ����ó��", "�Ŀ���ڿ���");
		Book book2 = new Book(2, "�÷���UI����", "���ȣ");
		Book book3 = new Book(3, "����ȭ�����Ǿ����ϴ�", "������");
		Book book4 = new Book(4, "�������θ����ϴ�", "������");
		Book book5 = new Book(5, "���ǿ���", "�����϶�");

		// �迭�� �̿��Ͽ� shoppingCart ������ ���
		// 1. �迭�� �����ϰ� ũ�⸦ 10���� �����
		Book[] shoppingCart = new Book[10];

		// 2. ������ å�� ��ٱ��Ͽ� ���
		shoppingCart[0] = book1;
		shoppingCart[1] = book3;
		shoppingCart[2] = book5;

		// 3. ��ٱ��Ͽ� ���� ������ ȭ�鿡 ���
		for (int i = 0; i < shoppingCart.length; i++) {
			if (shoppingCart[i] != null) {
				shoppingCart[i].showInfo();
			}
		}
		
		// 4. 0��° �ε����� �������� ���� å�� �߰��ϰ�
		// ������ å���� �ڷ� �б�
		shoppingCart[0] = book3;
		shoppingCart[1] = book1;
		shoppingCart[2] = book2;
		shoppingCart[3] = book5;
		
		System.out.println("----------------------------");
		
		// Ȯ�� for��		
		for(Book book : shoppingCart) {
			if(book != null) {
				book.showInfo();
			}
		}
		System.out.println("----------------------------");
		
		// 3�� �ε����� �����
		shoppingCart[3] = null;
		
		// Ȯ�� for��
		for(Book abc : shoppingCart) {
			if(abc != null) {
				abc.showInfo();
			}
		}
		
		
	} // end of main

} // end of class
