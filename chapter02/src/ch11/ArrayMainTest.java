package ch11;

import java.util.Iterator;

public class ArrayMainTest {

	public static void main(String[] args) {

		// �迭
		// ���� �ڷ����� �����͸� ��Ƽ� ������ �����ϱ� ���� ����ϴ� �ڷᱸ���̴�
		// ������ �ϳ��� �����͸� �����ϱ����� ���̶�� �迭�� �������� �����͸� �ϳ��� ������
		// �����ϱ� ���� ���̶�� �� �� �ִ�

		int number = 10;

		// ���� ���
		int[] arr1 = new int[3];
		int arr2[] = new int[10];

		// �ʱ�ȭ�ϴ� ��� (���� �����ϴ� ��)
		arr1[0] = 33;
		arr1[1] = 10;
		arr1[2] = 11;

		// �迭 ����� ���ÿ� �ʱ�ȭ�ϱ�
		int[] arr3 = new int[] { 11, 20, 30 };
		int[] arr4 = { 10, 50, 100 };

		// ��� ���
//		System.out.println(arr3[0]);
//		System.out.println(arr3[1]);
//		System.out.println(arr3[2]);

		//
		String[] strArr = new String[10];
		strArr[0] = "�߽���";
		strArr[1] = "Ƽ��";
		strArr[2] = "�ֽ�";
		strArr[3] = "�ٸ��콺";

		// ����1 strArr 0, 1, 2, 3 ȭ�鿡 ���
//		System.out.println(strArr[0]);
//		System.out.println(strArr[1]);
//		System.out.println(strArr[2]);
//		System.out.println(strArr[3]);
		// ��� ���α׷��� ������ index 0���� ����

		// �迭�� ����� �� ���� for���� �������� ���� �����
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i] != null) {
				System.out.println(strArr[i]);
			}
		}

	}

}
