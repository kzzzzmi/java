package ch02;

public class ToyRobot implements RemoteController, SoundEffect {

	String name;	// 초기값 -> NULL (참조타입)
						// int -> 0
	 					// double -> 0.0
	
	@Override
	public void turnOn() {
		System.out.println("장난감 로봇을 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("장난감 로봇을 끕니다");
	}

	@Override
	public void notification() {
		System.out.println("두루루 쾅쾅~!@!@");
	}

}
