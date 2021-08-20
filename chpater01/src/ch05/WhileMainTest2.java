package ch05;

public class WhileMainTest2 {

	public static void main(String[] args) {
		
		// 1부터 10까지 더해서 그 결과값을 출력
		int num = 1;
		int sum = 0;
		
		// while 문을 사용해서 1부터 10까지 덧셈 결과를 출력
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("결과값 : " + sum);

	}

}
