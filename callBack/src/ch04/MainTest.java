package ch04;

public class MainTest {

	public static void main(String[] args) {

		// 해커 뉴스 객체 생성
		HackerNews hackerNews = new HackerNews();
		
		// 기사 작성
		MyArticle article = new MyArticle("오늘 날씨가 매우 덥습니다.", hackerNews);
		article.complete();
		
		// sbs 클래스 만들어보기
		// mbc 클래스 만들기
		
	}

}
