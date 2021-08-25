package ch04;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 버스객체 2 생성
		// 지하철 2 생성
		// 학생 2 생성
		
		Bus bus1 = new Bus(1);
		Bus bus2 = new Bus(2);
		Subway subway1 = new Subway(2);
		Student student1 = new Student("티모", 10000);
		
		student1.takeBus(bus1);
		student1.showInfo();
		bus1.showInfo();
		System.out.println("----------------------------------");
		
		student1.takeSubway(subway1);
		student1.showInfo();
		subway1.showInfo();
		
		// 객체와 객체사이를 상호작용시켜 프로그래밍을 할 수 있다

	}

}
