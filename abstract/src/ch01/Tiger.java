package ch01;

public class Tiger extends Animal {

	// �߻� �޼��带 ��ӹ��� �� ���� �ذ� ��� (Type Abstract)
	// 1. �߻� �޼��带 ���� �������ؼ� ����
	// 2. Tiger Ŭ������ �߻� Ŭ������ ������ֱ�
	
	// ������ - �������̵�
	@Override
	public void hunt() {
		System.out.println("ȣ���̰� �չ߷� ����� �մϴ�");
	}
	
	@Override
	public void move() {
		System.out.println("��ݻ�� ������ �̵��մϴ�");
	}
	
	
}
