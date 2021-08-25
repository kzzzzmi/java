package ch04;

public class Subway {

	int lineNum;
	int passengerCount;
	int money;

	public Subway(int lineNum) {
		this.lineNum = lineNum;
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println(lineNum + "호선의 승객은 ");
		System.out.println(passengerCount + "명이고 ");
		System.out.println("수입금은 " + money + "원 입니다.");
	}

}
