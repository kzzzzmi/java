package ch01;

public class FunctionTest2 {

	// start of main
	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 20;
		System.out.println(addNum(n1, n2)); 	// return ���� double ���̶� �Ҽ����� ����
		
		sayHello("����");
		System.out.println(calcSum());

	}
	// end of main

	// �Լ� ����
	public static double addNum(double n1, double n2) {
		return n1 + n2;
	}

	// return ���� ���� �Լ� ����
	public static void sayHello(String greeting) {
		System.out.println("Hello " + greeting);
	}

	// �Ű������� ���� �Լ� ����
	public static int calcSum() {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}

}
