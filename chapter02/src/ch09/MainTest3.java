package ch09;

import java.util.Calendar;

public class MainTest3 {

	public static void main(String[] args) {
		
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		Company company3 = Company.getInstance();
		Company company4 = Company.getInstance();
		Company company5 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		System.out.println(company3);
		System.out.println(company4);
		System.out.println(company5);
		
		// �̱������� ������� �ڹٿ��� �����ϴ� Ŭ����
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();

		System.out.println(calendar1.getTimeInMillis());
		// System.out.println(calendar2);
		
	}

}
