package ch08;

public class Person {

	// this�� ? 
	// 1. �ν��Ͻ�(��ü) �ڱ� �ڽ��� �� �޸𸮿����� �ּҸ� ����Ų��.
	// 2. �����ڿ��� �� �ٸ� �����ڸ� ȣ���� �� ����� �� �ִ�
	// 3. �ڽ��� �ּ�(������, �ּҰ�)�� ��ȯ��ų �� �ִ�.
	
	String name;
	int age;
	String phoneNumber;
	
	// 1. 
	public Person(String name, int age) {
		System.out.println("������ 1�� ȣ��");
		this.name = name;
		this.age = age;
	}
	
	// 2.
	public Person() {
		this("�̸� ����", 1);
		System.out.println("������ 2�� ȣ��");
	}
	
	public Person(String name, int age, String phoneNumber) {
		// this.name = name;
		// this.age = age;
		this(name, age);
		this.phoneNumber = phoneNumber;
	}
	
	// 3.
	public Person getPerson() {
		return this;
	}
	
}