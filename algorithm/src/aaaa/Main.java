package aaaa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int[] test = new int[c];
		int[][] student = new int[c][];
		int sum = 0;
		int avg;
		int temp;
		
		for(int i=0; i<test.length; i++) {
			test[i] = sc.nextInt();
			student[i] = new int[test[i]];
			
			for(int j=0; j<test[i]; j++) {
				student[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<student.length; i++) {
			temp = 0;
			sum = 0;
			
			for(int j=0; j<student[i].length; j++) {
				sum += student[i][j];
			}
			avg = sum / student[i].length;
			
			for(int j=0; j<student[i].length; j++) {
				if(student[i][j] > avg) {
					temp++;
				}
			}
			
			System.out.printf("%.3f%%\n", (double)temp / student[i].length * 100);
		}
		
	}

}
