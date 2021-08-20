package ch05;

public class ForMainTest1 {

	public static void main(String[] args) {

		/*
		 * for(초기화식; 조건식; 마지막문) { 수행문; }
		 */

		// for문을 이용해서 1부터 10까지 덧셈 연산
		// 연산의 결과를 담은 변수가 필요함

		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
