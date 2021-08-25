package ch04;

public class Bus {

	int busNum;
	int passengerCount;
	int money;
	
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(busNum + "번의 승객은 ");
		System.out.println(passengerCount + "명이고 ");
		System.out.println("수입금은 " + money + "원 입니다.");
	}
	
}
