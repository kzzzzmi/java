package ch01;

public class Wrapper_Ex3 {

	public static void main(String[] args) {

		int a = 10;
		String b = a + " : ...";
		
		String str1 = "10";
		String str2 = "10.5";
		String str3 = "true";
		
		int n1 = Integer.parseInt(str1);
		double n2 = Double.parseDouble(str2);
		boolean n3 = Boolean.parseBoolean(str3);
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		System.out.println('9'-'0');

	}

}
