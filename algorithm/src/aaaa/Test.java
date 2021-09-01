package aaaa;

public class Test {

	public static void main(String args[]) {

		boolean[] check = new boolean[10001];

		for (int i = 1; i < 10001; i++) {
			int num = d(i);
			if (num < 10001) {
				check[num] = true;
			}
		}

		for (int i = 1; i < 10001; i++) {
			if(!check[i]) {
				System.out.println(i);
			}
		}

	}

	public static int d(int n) {
		int sum = n;

		while (n > 0) {
			int remainder = n % 10;
			sum += remainder;
			n /= 10;
		}
		return sum;
	}

}