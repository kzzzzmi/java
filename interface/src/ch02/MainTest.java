package ch02;

public class MainTest {

	public static void main(String[] args) {

		Television television = new Television();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot toyRobot = new ToyRobot();
		
		television.turnOn();
		television.turnOff();
		System.out.println("----------------");
		refrigerator.turnOn();
		refrigerator.turnOff();
		System.out.println("----------------");
		toyRobot.turnOn();
		toyRobot.turnOff();
		
		// ������ - ��(����, ��ü, ����)
		// �迭 ���� ũ��� 3 �ν��Ͻ� ������ �ֱ�
		RemoteController[] remote = new RemoteController[3];
		remote[0] = television;
		remote[1] = refrigerator;
		remote[2] = toyRobot;
		
		// Ȯ�� for�� �̿� turnON() ȣ��
		for(RemoteController remoteController : remote) {
			remoteController.turnOn();
		}
		
		// Ȯ�� for�� �̿� turnOff() ȣ��
		for(RemoteController remoteController : remote) {
			remoteController.turnOff();
		}
		
		// �Ϲ� for�� �̿� Ŭ���� Ÿ���� ToyRobot�̸� name�� ȭ�鿡 ���
		for(int i=0; i<remote.length; i++) {
			if (remote[i] instanceof ToyRobot) {
				System.out.println(((ToyRobot)remote[i]).name);
			}
		}
		
		// �䱸���� �߰�! �������̽� �߰�
		// ����� ���� �������� ��ε� �Ҹ��� ���� �ϱ�
		// �峭�� �κ��� �������� ���� ������ ��ε� �Ҹ��� ���� �ϱ�
		((Refrigerator)remote[1]).notification();
		
		// �������̽� ����
		// ǥ��ȭ�� �����ϴ�
		// ���� ������� Ŭ�����鿡�� ���踦 �ξ��� �� �ִ�
		// Ŭ�������� ���յ��� ���缭 ������ �ڵ带 ������ �� �ִ�
		
		// ����
		// ��ü���� �з����� �ٽ�
		// ��ü�� ��ü���� ��ȣ �����ؼ� �ڵ带 ������ ������( ����, ����ö, �л�, ��Ÿũ����Ʈ )
		// ��ü�� ��ü���� ���踦 �����ؼ� �ڵ带 ������ ������ ( ���, ���԰���, �߻�Ŭ����, �������̽�)
		// ������ (Ŭ������ �پ��� ���·� �ٶ󺻴�)!!!!
		
	
	}

}
