package ch04;

public class MainTest1 {

	public static void main(String[] args) {
		
		// ������ü 2 ����
		// ����ö 2 ����
		// �л� 2 ����
		
		Bus bus1 = new Bus(1);
		Bus bus2 = new Bus(2);
		Subway subway1 = new Subway(2);
		Student student1 = new Student("Ƽ��", 10000);
		
		student1.takeBus(bus1);
		student1.showInfo();
		bus1.showInfo();
		System.out.println("----------------------------------");
		
		student1.takeSubway(subway1);
		student1.showInfo();
		subway1.showInfo();
		
		// ��ü�� ��ü���̸� ��ȣ�ۿ���� ���α׷����� �� �� �ִ�

	}

}