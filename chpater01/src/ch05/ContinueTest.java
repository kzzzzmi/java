package ch05;

public class ContinueTest {

	public static void main(String[] args) {
		
		// 예약어 continue
		// 무시하고 진행하는 continue
		
		int num;
		int count = 0;
		// 상수 2개 만듬
		final int MAX = 1000;
		final int MULTIPLE = 7;
		
		for(num = 1; num <= MAX; num++) {		
			// 3에 배수이면 출력x
			if(num % MULTIPLE == 0) { 
				count++;
				continue;
			}
		}
		System.out.println(MULTIPLE + "의 배수의 갯수 : " + count);

	}

}
