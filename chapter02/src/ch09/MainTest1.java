package ch09;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 인스턴스 생성 전 이미 만들어져있기에 인스턴스가 아닌 클래스 이름으로 바로 접근 가능
		// 다만 접근 제어자가 private이면 접근 불가
		System.out.println(NumberPrinter.waitNumber);
				
		NumberPrinter numberPrinter1 = new NumberPrinter(1);
		NumberPrinter numberPrinter2 = new NumberPrinter(2);
		
		// 왼쪽 기계
		// 1. 번호표를 뽑음
		numberPrinter1.printWaitNumber();
		// 2. ...
		numberPrinter1.printWaitNumber();
		// 3. ...
		numberPrinter1.printWaitNumber();
		numberPrinter1.printWaitNumber();
		numberPrinter1.printWaitNumber();
		
		
		// 오른쪽 기계
		// 1. 번호표를 뽑음
		numberPrinter2.printWaitNumber();
		// 2. ...
		numberPrinter2.printWaitNumber();
		// 3. ...
		numberPrinter2.printWaitNumber();
		numberPrinter2.printWaitNumber();
		numberPrinter2.printWaitNumber();
		
		
	}

}
