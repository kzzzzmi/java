package aaaa;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}
		
		for(int i = 0; i < n; i++) {
			if(arr.get(i) < x) {
				System.out.print(arr.get(i) + " ");
			}
		}
		

	}

}
