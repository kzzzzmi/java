package aaaa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] number = new int[10];
		
		int times = a * b * c;
		int mod = 0;
		
		while(times  != 0) {
			mod = times % 10;
			number[mod]++;
			times /= 10;
		}
		
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
		
	}

}
