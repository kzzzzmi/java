package ch02;

public class MainTest {

	public static void main(String[] args) {
		Activity1 a1 = new Activity1("ȭ��1");
		Activity2 a2 = new Activity2("ȭ��2");
		// �޼��带 ����ؼ� �ݹ� �����ϱ�
		// �� ��Ÿ���� �� ���� ����� ���̴� 
		// ��� ����غ��� !
		a2.setCallbackCheckPosition(a1.callbackCheckPosition);
	}

}
