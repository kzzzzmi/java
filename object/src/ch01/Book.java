package ch01;

public class Book {

	private String title;
	private String author;

	public Book(String title, String author) {
		this.author = author;
		this.title = title;
	}
	
	// Object Ŭ������ �ִ� toString �޼��带 ������
	@Override
	public String toString() {
		return title + ", " + author;
	}
	
	// equals �޼��� ������
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
