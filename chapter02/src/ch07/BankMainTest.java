package ch07;

public class BankMainTest {

	public static void main(String[] args) {

		Bank bank = new Bank(); 
		
		bank.deposit(10_000);
		bank.showInfo();
		bank.widthdraw(5_000);
		bank.showInfo();
		
		// ���� �����ڰ� �Ǽ��� ��� ������ �����ؼ� �ܾ��� ������
		// bank.balance = 1_000_000;
		// bank.showInfo();
		// �̷� ��Ȳ�� ������ ���������ڷ� ��������� private���� �����ϰ� setter/getter�� Ȱ���ϴ� ��
		
		
		// ���� ���� ������
		// 4����
		// 1. public : ��Ű�� �ܺο����� ���� ���
		// 2. default : ���� ��Ű�� ���ο����� ������ ��� (ex ���� Ÿ�� ���)
		// 3. protected : ��Ӱ��迡�� ������ ���
		// 4. private : ���� Ŭ���� �������� ������ ���
	}

}
