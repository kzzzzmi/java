package ch01;

public class MainTest1 {

	public static void main(String[] args) {

		// Animal Ÿ������ ȣ���� ����
		Animal tiger = new Tiger();
		// Animal Ÿ������ ������ ����
		Animal eagle = new Eagle();
		// Animal Ÿ������ ��� ����
		Animal person = new Person();
		
		// ������
		// Animal tiger = new Tiger();
		// Animal eagle = new Eagle();
		// Animal person = new Person();
		
		// Animal Ÿ������ �迭 ���� size = 3
		Animal[] animals = new Animal[3];
		
		// �迭 �� ���ֱ�
		animals[0] = tiger;
		animals[1] = eagle;
		animals[2] = person;
		
		// move, method ȣ��
		for(int i=0; i<animals.length; i++) {
			animals[i].move();
			animals[i].hunt();
			// ������ ���� -> hunt()
			// ��Ÿ�� ���� -> hunt()
		}

	}

}
