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
		System.out.println(lineNum + "ȣ���� �°��� ");
		System.out.println(passengerCount + "���̰� ");
		System.out.println("���Ա��� " + money + "�� �Դϴ�.");
	}

}
