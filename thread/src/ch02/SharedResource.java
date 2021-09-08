package ch02;

// 작업자들이 자원(데이터)를 공유하는 상황일 때 처리하는 방법
class BankAccount {
	
	private int money = 100_000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	// 입금
	public  void saveMoney(int money) {
		
		synchronized (this) {
			// 10만원 상태
			int currentMoney = getMoney();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			setMoney(currentMoney + money);
			System.out.println("입금 후 잔액 : " + getMoney());
		}	
	}
	
	// 출금
	public synchronized void widthdrawMoney(int money) {
		// 10만원 상태
		int currentMoney = getMoney();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 방어 코드
		if(currentMoney >= money) {
			setMoney(currentMoney - money);
			System.out.println("출금 후 잔액 : " + getMoney());
		} else {
			System.out.println("잘못된 입력입니다.");
		}	 
	}
} // end of class

// 아버지
class Father extends Thread {
	
	BankAccount account;
	
	public Father(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		// 입금하기
		account.saveMoney(10_000);
	}
}

class Mother extends Thread {
	
	BankAccount account;
	
	public Mother(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		// 출금하기
		account.widthdrawMoney(5_000);
	}
	
}

public class SharedResource {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		Father father = new Father(account);
		Mother mother = new Mother(account);
		
		// 아버지가 입금하는 동작
		father.start();
		// 어머니가 출금하는 동작
		mother.start();
		// 정상 잔고 : 105000원
		// 결과 값 : 100000원 (의도치 않은 결과 발생)
		// 임계 영역이 될 때는 (작업자간의 자원을 공유하는 상태)
		// 다른 작업자가 사용하지 못하도록 lock을 걸어줘야 함
		// lock 거는 법 - 동기화 처리를 한다 (synchronization)
		// 1. synchronized 메서드에 사용하는 방법(reserved== 예약어)
		// 2. synchronized 블럭을 사용하는 밥법 (detail하게 걸때는 블럭 사용)
	}

}
