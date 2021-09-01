package ch01;

public class Book {

	private String title;
	private String author;

	public Book(String title, String author) {
		this.author = author;
		this.title = title;
	}
	
	// Object 클래스에 있는 toString 메서드를 재정의
	@Override
	public String toString() {
		return title + ", " + author;
	}
	
	// equals 메서드 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book tempBook = (Book)obj;
			if(this.title == tempBook.title && this.author == tempBook.author) {
				return true;
			}
		}
		return false;
	}

}
