package ch03;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("�������� �մϴ�");
		System.out.println("�ڵ����� ������ ������ �ٲߴϴ�");
	}

	@Override
	public void stop() {
		System.out.println("������ �����մϴ�");		
	}
	
	@Override
	public void wiper() {
		System.out.println("������ wiper ������ �մϴ�");
	}
	
	@Override
	public void washCar() {
		System.out.println("������ ������ �մϴ�");
	}

}