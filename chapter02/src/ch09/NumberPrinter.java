package ch09;

public class NumberPrinter {
	
	// static 변수는 static 영역에서 이 객체가 생성되기 전에 이미 만들어져 있음
	// 모든 이 클래스의 instance는 satatic 영역의 변수를 공유한다
	// like 태양. 내가 태어나기 전부터 이미 있었음 ,,
	
	static int waitNumber = 0;	
	private int id;
	
	public NumberPrinter(int id) {
		this.id = id;
	}
	
	public void printWaitNumber() {
		System.out.println(id + "번 기기의 대기 순번 : " + ++waitNumber);
	}
	
}
