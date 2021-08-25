package ch03;

public class Person {

	int height;
	int weight;
	String gender;
	String name;
	int age;
	
	public Person(int height, int weight, String gender, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("Ű�� " + height + "�̰� " + "�����԰� " + weight + " ų���� " + gender + "�� �ֽ��ϴ�. �̸��� " + name + "�̰� ���̴� " + age + "���Դϴ�.");
	}
	
	public static void main(String[] args) {
		
		Person tomas = new Person(180, 78, "����", "Tomas", 37);
		tomas.showInfo();
		
	}
	
}
