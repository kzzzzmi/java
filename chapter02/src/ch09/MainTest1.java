package ch09;

public class MainTest1 {

	public static void main(String[] args) {
		
		// �ν��Ͻ� ���� �� �̹� ��������ֱ⿡ �ν��Ͻ��� �ƴ� Ŭ���� �̸����� �ٷ� ���� ����
		// �ٸ� ���� �����ڰ� private�̸� ���� �Ұ�
		System.out.println(NumberPrinter.waitNumber);
				
		NumberPrinter numberPrinter1 = new NumberPrinter(1);
		NumberPrinter numberPrinter2 = new NumberPrinter(2);
		
		// ���� ���
		// 1. ��ȣǥ�� ����
		numberPrinter1.printWaitNumber();
		// 2. ...
		numberPrinter1.printWaitNumber();
		// 3. ...
		numberPrinter1.printWaitNumber();
		numberPrinter1.printWaitNumber();
		numberPrinter1.printWaitNumber();
		
		
		// ������ ���
		// 1. ��ȣǥ�� ����
		numberPrinter2.printWaitNumber();
		// 2. ...
		numberPrinter2.printWaitNumber();
		// 3. ...
		numberPrinter2.printWaitNumber();
		numberPrinter2.printWaitNumber();
		numberPrinter2.printWaitNumber();
		
		
	}

}
