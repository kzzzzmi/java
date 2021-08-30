package ch03;

public class Person {

	String name;
	int age;
	int height;
	int weight;
	
	public void showInfo() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
		System.out.println("weight : " + weight);
	}
	
}

// 초보개발자는 밑에서 위로 올라가는 코드를 짜자
// 부모 클래스를 만드는게 아닌 자식 클래스들을 만들어보며 공통된 부분이 있으면 그때 상위 클래스를 만드는 느낌
