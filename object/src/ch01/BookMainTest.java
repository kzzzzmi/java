package ch01;

// ��� Ŭ������ �ֻ��� Ŭ������ Object Ŭ�����̴� !

public class BookMainTest {

	public static void main(String[] args) {

		Book book1 = new Book("�÷���UI����", "���ȣ");
		Book book2 = new Book("�÷���UI����", "���ȣ");

		System.out.println(book1.hashCode());
		
		String str = "test";
		System.out.println(str);		// String Ŭ������ toString ���� Object�� toString�� �������� ��
		
		System.out.println(str.toString());

		if(book1 == book2) {
			System.out.println("���� ��ü�Դϴ�");
		} else {
			System.out.println("�ٸ� ��ü�Դϴ�");
		}
		
		// equals book1 book2
		System.out.println(book1.equals(book2));
		String name = "�����";
		
	}

}
