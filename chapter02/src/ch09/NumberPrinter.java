package ch09;

public class NumberPrinter {
	
	// static ������ static �������� �� ��ü�� �����Ǳ� ���� �̹� ������� ����
	// ��� �� Ŭ������ instance�� satatic ������ ������ �����Ѵ�
	// like �¾�. ���� �¾�� ������ �̹� �־��� ,,
	
	static int waitNumber = 0;	
	private int id;
	
	public NumberPrinter(int id) {
		this.id = id;
	}
	
	public void printWaitNumber() {
		System.out.println(id + "�� ����� ��� ���� : " + ++waitNumber);
	}
	
}
