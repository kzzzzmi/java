package ch03;

public abstract class Car {

	public void StartCar() {
		System.out.println("�õ��� �մϴ�");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�");
	}
	
	public abstract void drive();
	
	public abstract void stop();
	
	// �ٽ� !!
	// ���� Ŭ�������� ������ �� �� ���� ����
	final public void run() {
		// �޼����� ���� (���ø��� ������ �� �ִ�)
		StartCar();
		drive();
		stop();
		turnOff();
	}
	
}
