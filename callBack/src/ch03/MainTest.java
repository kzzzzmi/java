package ch03;

public class MainTest {

	public static void main(String[] args) {
		Activity1 act1 = new Activity1("��ũ��1");
		Activity2 act2 = new Activity2("��ũ��2");
		act2.setCallbackCheckPosition(act1.callbackCheckPosition);
	}

}
