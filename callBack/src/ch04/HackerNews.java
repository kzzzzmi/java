package ch04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// 메서드 하나당 하나의 기능을 하는게 제일 베스트임!!!!

public class HackerNews implements WriteArticle {
	
	private String printDate() {	
		// 날짜 형식을 String으로 변환하기 위한 포멧 형식
		DateFormat formater = new SimpleDateFormat("yyyy.MM.dd");
		return formater.format(Calendar.getInstance().getTime());
	}
	
	@Override
	public void printArticle(String article) {
		System.out.println("*** HackerNews ***");
		System.out.println();
		System.out.println(article);
		System.out.println();
		System.out.println("기사 작성일 : " + printDate());
	}
	
}
