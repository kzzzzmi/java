package ch03;

public class MainTest {

	public static void main(String[] args) {
		Activity1 act1 = new Activity1("스크린1");
		Activity2 act2 = new Activity2("스크린2");
		act2.setCallbackCheckPosition(act1.callbackCheckPosition);
	}

}
