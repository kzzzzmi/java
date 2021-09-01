package ch03;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("제수는 0이 될 수 없습니다");
			return ERROR;
		}
		return num1 / num2;
	}
	
	public void showInfo() {
		System.out.println("모든 메서드를 구현했습니다");
	}
	
}
