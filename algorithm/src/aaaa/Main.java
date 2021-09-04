package aaaa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		int cnt = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'c') {
				if (((i + 1) < input.length()) && (input.charAt(i + 1) == '=' || input.charAt(i + 1) == '-')) {
					i++;
				}
			} else if (input.charAt(i) == 'd') {
				if (((i + 2) < input.length()) && (input.charAt(i + 1) == 'z' && input.charAt(i + 2) == '=')) {
					i += 2;
				} else if (((i + 1) < input.length()) && (input.charAt(i + 1) == '-')) {
					i++;
				}
			} else if ((i + 1) < input.length() && (input.charAt(i) == 'l' && input.charAt(i + 1) == 'j'
					|| input.charAt(i) == 'n' && input.charAt(i + 1) == 'j'
					|| input.charAt(i) == 's' && input.charAt(i + 1) == '='
					|| input.charAt(i) == 'z' && input.charAt(i + 1) == '=')) {
				i++;
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}
