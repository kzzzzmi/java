package ch03;

import java.util.Scanner;

public class MainTest6 {

	public static void main(String[] args) {
		
		// ���� ������
		// ���ǽ� ? true�� ��� : false�� ���
		
		int num1 = (5 > 3) ? 10 : 20;
		System.out.println(num1);
		
		int num2 = (5 < 3) ? 10 : 20;
		System.out.println(num2);
		System.out.println("=========================");
		// JDK�� ������� ������ �̿�
		int max;
		System.out.println("�� ���� �Է°� �� ū ���� ����ϼ���!");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�1 : ");
		int x = sc.nextInt();
		System.out.print("�Է�2 : ");
		int y = sc.nextInt();
		
		max = (x >= y) ? x : y;
		System.out.println("ū ���ڴ� " + max + "�Դϴ�.");

	}

}
