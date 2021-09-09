package ch02;

public class MainTest {

	public static void main(String[] args) {
		Activity1 a1 = new Activity1("화면1");
		Activity2 a2 = new Activity2("화면2");
		// 메서드를 사용해서 콜백 연결하기
		// 이 스타일을 더 많이 사용할 것이다 
		// 계속 사용해보자 !
		a2.setCallbackCheckPosition(a1.callbackCheckPosition);
	}

}
