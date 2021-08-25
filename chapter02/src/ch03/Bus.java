package ch03;

public class Bus {

	int busNumber;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public Bus(int busNumber, int money) {
		this.busNumber = busNumber;
		this.money = money;
	}
	
	public void showInfo() {
		System.out.println("버스의 번호는 " + busNumber);
	}
	
	public void showMoney() {
		System.out.println("현재 수입금은 " + money + "원 입니다.");
	}
	
}
