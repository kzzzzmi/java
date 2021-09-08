package ch02;

// �۾��ڵ��� �ڿ�(������)�� �����ϴ� ��Ȳ�� �� ó���ϴ� ���
class BankAccount {
	
	private int money = 100_000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	// �Ա�
	public  void saveMoney(int money) {
		
		synchronized (this) {
			// 10���� ����
			int currentMoney = getMoney();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			setMoney(currentMoney + money);
			System.out.println("�Ա� �� �ܾ� : " + getMoney());
		}	
	}
	
	// ���
	public synchronized void widthdrawMoney(int money) {
		// 10���� ����
		int currentMoney = getMoney();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// ��� �ڵ�
		if(currentMoney >= money) {
			setMoney(currentMoney - money);
			System.out.println("��� �� �ܾ� : " + getMoney());
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}	 
	}
} // end of class

// �ƹ���
class Father extends Thread {
	
	BankAccount account;
	
	public Father(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		// �Ա��ϱ�
		account.saveMoney(10_000);
	}
}

class Mother extends Thread {
	
	BankAccount account;
	
	public Mother(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		// ����ϱ�
		account.widthdrawMoney(5_000);
	}
	
}

public class SharedResource {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		Father father = new Father(account);
		Mother mother = new Mother(account);
		
		// �ƹ����� �Ա��ϴ� ����
		father.start();
		// ��Ӵϰ� ����ϴ� ����
		mother.start();
		// ���� �ܰ� : 105000��
		// ��� �� : 100000�� (�ǵ�ġ ���� ��� �߻�)
		// �Ӱ� ������ �� ���� (�۾��ڰ��� �ڿ��� �����ϴ� ����)
		// �ٸ� �۾��ڰ� ������� ���ϵ��� lock�� �ɾ���� ��
		// lock �Ŵ� �� - ����ȭ ó���� �Ѵ� (synchronization)
		// 1. synchronized �޼��忡 ����ϴ� ���(reserved== �����)
		// 2. synchronized ���� ����ϴ� ��� (detail�ϰ� �ɶ��� �� ���)
	}

}
