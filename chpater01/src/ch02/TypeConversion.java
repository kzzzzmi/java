package ch02;

public class TypeConversion {

	public static void main(String[] args) {
		
		// �� ��ȯ	=> ���� �ٸ� �ڷ��� ���� ������� ������ ���� �ϳ��� �ڷ������� �����ϴ� ���� ����
		// ������ �� ��ȯ (�ڵ� �� ��ȯ) -> ��ĳ����
		// ����� �� ��ȯ (���� �� ��ȯ) -> �ٿ�ĳ����
		
		// int �ڷ����� double ������ ��ȯ�ϰų� double ���� int ������ ��ȯ�ϴ� ���� ����
		
		int iNum1 = 100;
		System.out.println(iNum1);
		
		// �ڵ� �� ��ȯ
		double dNum1 = iNum1;
		System.out.println(dNum1);
		
		// ���� �� ��ȯ
		double dNumber = 1.12341;
		//int iNumber = dNumber;		// ���� : ū �޸��� ũ�⸦ ���� ������ ��������� ���� �޸��� ũ�⸦ ���� ������ ���� �� ����

		// �����Ϸ��� �������ϱ� �׳� ������ �־�!
		int iNumber = (int)dNumber;
		System.out.println(iNumber);
		// �Ҽ����� ������ ���� ���� (������ �ս� �߻�)
		
		double aValue;
		int bValue;
		
		aValue = 0.5;
		bValue = (int)10.1;
		System.out.println(bValue);

	}

}
