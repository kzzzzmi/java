package ch07;

public class Bank {
	
	// ���� ���� : ���� ������ �����ڸ� �Ἥ ������ ����
	private int  balance;
	
	// �Ա�
	public void deposit(int money) {
		balance += money;
	}
	
	//���
	public void widthdraw(int money) {
		balance -= money;
	}
	
	// ���� ���
	public void showInfo() {
		System.out.println("���� �ܾ��� " + balance + "�� �Դϴ�.");
	}
	
}
