package ch02;

public class StringTest1 {

	public static void main(String[] args) {
		
		// String ���� ���
		// heap �޸𸮿� �ν��Ͻ��� �����Ǵ� ���
		String str1 = new String("abc");
		// constant pool (Data, static)�� ���α׷� ���� �� �ٷ� ���ڿ��� �ø��� �ּҸ� �����ϴ� ���
		String str2 = "abc";
		System.out.println(str1.equals(str2));
		
		// ��� : heap �޸𸮿� �ν��Ͻ��� �����Ǹ� �Ź� �ٸ� �ּҰ��� ��������, ��� Ǯ�� �ø� ���ڿ��� ���� �ּҰ��� ����
		
		String str3 = new String("abc");
		System.out.println(str1.equals(str3));
		
		String str4 = "abc";
		String str5 = "abc";
		System.out.println(str4 == str5);
		
	}
	
}
