package ch02;

public abstract class Computer {

	// �߻� �޼���
	public abstract void display();
	
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("��ǻ�͸� �׽��ϴ�");
	}
	
	public void turnOff() {
		System.out.println("��ǻ�͸� ���ϴ�");
	}
	
}
