package ch04;

public class MainTest {

	public static void main(String[] args) {

		// ��Ŀ ���� ��ü ����
		HackerNews hackerNews = new HackerNews();
		
		// ��� �ۼ�
		MyArticle article = new MyArticle("���� ������ �ſ� �����ϴ�.", hackerNews);
		article.complete();
		
		// sbs Ŭ���� ������
		// mbc Ŭ���� �����
		
	}

}
