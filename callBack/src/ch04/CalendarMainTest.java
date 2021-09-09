package ch04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMainTest {

	public static void main(String[] args) {
		
		// Calendar�� ��¥ ���� Ŭ�����̴�. �޷��̳� �ð� ��� ���� ����� �� ���� ���� Ŭ����		
		Calendar calendar = Calendar.getInstance(); // �̱��� ����
		System.out.println(calendar.getTimeInMillis());
		
		// ���� �����ϱ� ������ ������ ���� ����� �� �ִ�
		// ��¥�� ��ȯ ����� ����
		DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String date = dateFormat.format(calendar.getTimeInMillis());
		// ���� �ð��� ���� ���� format �������� ��ȯ ����
		System.out.println(date);
		
		while(true) {
			System.out.println(dateFormat.format(Calendar.getInstance().getTimeInMillis()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
