package ch07;

public class BankMainTest {

	public static void main(String[] args) {

		Bank bank = new Bank(); 
		
		bank.deposit(10_000);
		bank.showInfo();
		bank.widthdraw(5_000);
		bank.showInfo();
		
		// 신입 개발자가 실수로 멤버 변수로 접근해서 잔액을 수정함
		// bank.balance = 1_000_000;
		// bank.showInfo();
		// 이런 상황들 때문에 접근지시자로 멤버변수를 private으로 선언하고 setter/getter를 활용하는 것
		
		
		// 접근 제어 지시자
		// 4가지
		// 1. public : 패키지 외부에서도 접근 허용
		// 2. default : 같은 패키지 내부에서는 접근을 허용 (ex 참조 타입 사용)
		// 3. protected : 상속관계에서 접근을 허용
		// 4. private : 같은 클래스 내에서만 접근을 허용
	}

}
