package ch07;

public class Bank {
	
	// 정보 은닉 : 접근 제어자 지시자를 써서 정보를 숨김
	private int  balance;
	
	// 입금
	public void deposit(int money) {
		balance += money;
	}
	
	//출금
	public void widthdraw(int money) {
		balance -= money;
	}
	
	// 정보 출력
	public void showInfo() {
		System.out.println("현재 잔액은 " + balance + "원 입니다.");
	}
	
}
