package ch01;

public class MainTest1 {

	public static void main(String[] args) {

		// Animal 타입으로 호랑이 생성
		Animal tiger = new Tiger();
		// Animal 타입으로 독수리 생성
		Animal eagle = new Eagle();
		// Animal 타입으로 사람 생성
		Animal person = new Person();
		
		// 다형성
		// Animal tiger = new Tiger();
		// Animal eagle = new Eagle();
		// Animal person = new Person();
		
		// Animal 타입으로 배열 선언 size = 3
		Animal[] animals = new Animal[3];
		
		// 배열 안 값넣기
		animals[0] = tiger;
		animals[1] = eagle;
		animals[2] = person;
		
		// move, method 호출
		for(int i=0; i<animals.length; i++) {
			animals[i].move();
			animals[i].hunt();
			// 컴파일 시점 -> hunt()
			// 런타임 시점 -> hunt()
		}

	}

}
