package ch01;

public class FunctionTest3 {

	public static void main(String[] args) {
		
		int num1, num2;
		int sum = 0;
		
		add(100, 50);
		
	}
	
	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	// 리턴값 int, 매개변수 n1, n2, n3 이름은 intAdd 
	public static int intAdd(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	
	// 리턴값 double, 매개변수 d1, d2 이름은 doubleAdd
	public static double doubleAdd(double d1, double d2) {
		return d1 + d2;
	}
	
	// 리턴값 void, 매개변수 String article 이름은 printArticle
	public static void printArticle(String article) {
		System.out.println(article);
	}

}
