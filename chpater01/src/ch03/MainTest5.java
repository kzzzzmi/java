package ch03;

public class MainTest5 {

	public static void main(String[] args) {
		
		// ���� ������(&&, ||) ���ۼ�Ʈ, ��Ƽ�� ��
		// ���� �����ڿ� ȥ���ؼ� ���� ����
		// ������ ����� true, false
		
		int num1 = 10;
		int num2 = 20;
		
		// 1. AND ������ (������)
		boolean flag1 = (num1 > 0) && (num2 > 0);
		System.out.println(flag1);
		
		boolean flag2 = (num1 > 0) && (num2 < 0);
		System.out.println(flag2);

		// 2.  OR ������ (������)
		boolean flag3 = (num1 > 0) || (num2 > 0);
		System.out.println(flag3);
		
		boolean flag4 = (num1 > 0) || (num2 < 0);
		System.out.println(flag4);
		
		
		// �ܶ� �򰡴� ù ��° �������� ����� Ȯ���� �� �� ��° ���� Ȯ��(��)���� �ʴ� ����� ���Ѵ�.
		// AND�� OR���� ���Ǵ� ������ ��Ģ��
	}

}