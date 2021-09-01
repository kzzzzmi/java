package aaaa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int[] num = new int[26];
		
		for(int i=0; i<num.length; i++) {
			num[i] = -1;
		}
		
		for(int i=0; i < input.length(); i++) {		
			int temp = input.charAt(i) - 97;
			if(num[temp] == -1) {
				num[temp] = i;
			}
		}
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] == -1) {
				System.out.print("-1 ");
			} else {
				System.out.print(num[i] + " ");
			}
		}
		
	}

}
// a = 97