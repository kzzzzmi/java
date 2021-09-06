package aaaa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int sum = 0;
		int i=0;
		while(sum < num) {
			sum += ++i;
		}
		
		int aws = num - (sum - i + 1);
		if(i % 2 == 0) {
			System.out.println((1+aws) + "/" + (i-aws));
		} else {
			System.out.println((i-aws) + "/" + (1+aws));
		}
			
 	}
}
