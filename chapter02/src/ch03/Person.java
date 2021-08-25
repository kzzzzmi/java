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
		System.out.println("키가 " + height + "이고 " + "몸무게가 " + weight + " 킬로인 " + gender + "이 있습니다. 이름은 " + name + "이고 나이는 " + age + "세입니다.");
	}
	
	public static void main(String[] args) {
		
		Person tomas = new Person(180, 78, "남성", "Tomas", 37);
		tomas.showInfo();
		
	}
	
}
