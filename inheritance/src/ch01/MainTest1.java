package ch01;

class A {
	int number1;
	int number2;
	int number3;
}

class B {
	int number1;
	int number2;
	int number3;
	int number4;
	int number5;
}

class C extends A {
	int number4;
	int number5;
}

public class MainTest1 { // �ڹ� ���� �ȿ��� �ϳ��� public class�� �� �� ����

	public static void main(String[] args) {

		C c1 = new C();
		c1.number1 = 1;
		c1.number2 = 2;
		c1.number5 = 5;
		System.out.println(c1.number1);
		System.out.println(c1.number2);
		System.out.println(c1.number5);

	}

}
