package ch01;

class Cal {

	public int sum(int n1, int n2) {
		return n1 + n2;
	}

	public int multiply(int n1, int n2) {
		return n1 * n2;
	}

}

class Cal2 extends Cal {
	
	public int minus(int n1, int n2) {
		return n1 - n2;
	}
	
	// 메서드 재정의 (오버라이딩) => 부모에 있는 메서드를 필요에 의해 재정의 함
	
//	public int multiply(int n1, int n2) {
//		if(n1 == 0 || n2 == 0) {
//			System.out.println("0은 입력할 수 없습니다.");
//		}
//		return n1 * n2;
//	}
	
	@Override // annotation(주석)
	public int multiply(int n1, int n2) {
		if(n1 == 0 || n2 == 0) {
			System.out.println("0은 입력할 수 없습니다.");
		}
		return n1 * n2;
	}
	
	
}

public class MainTest2 {

	public static void main(String[] args) {
		Cal2 cal2 = new Cal2();
		System.out.println(cal2.sum(5, 3));
		System.out.println(cal2.minus(10, 7));
		System.out.println(cal2.multiply(10, 0));
	}

}
