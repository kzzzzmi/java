package ch04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMainTest {

	public static void main(String[] args) {
		
		// Calendar란 날짜 관련 클래스이다. 달력이나 시간 계산 등을 사용할 때 많이 쓰는 클래스		
		Calendar calendar = Calendar.getInstance(); // 싱글톤 패턴
		System.out.println(calendar.getTimeInMillis());
		
		// 보기 불편하기 때문에 형식을 만들어서 사용할 수 있다
		// 날짜로 변환 방법을 지정
		DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String date = dateFormat.format(calendar.getTimeInMillis());
		// 현재 시간을 내가 정한 format 형식으로 변환 가능
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
