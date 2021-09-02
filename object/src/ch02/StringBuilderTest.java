package ch02;

public class StringBuilderTest {

	public static void main(String[] args) {

		// StringBuilder, StringBuffer Ȱ���ϱ�
		// ���������� �������� char[]�� ��� ������ ����.
		// ���ڿ��� ������ �����ϰų� ������ �� ����ϸ� ������
		// StringBuffer�� ��Ƽ ������ ���α׷��ֿ��� ����ȭ(synchronization)�� ����
		// ���� ������ ���α׷������� StringBuilder ����ϱ⸦ ����
		// String str1,  StringBuilder str2,
		// �ٿ� ĳ������ �ƴ� toString() �޼���� String ��ȯ�ؼ� ����
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append(android);
		buffer.append(50);
		System.out.println(System.identityHashCode(buffer));
		System.out.println(buffer.indexOf("aa"));
		System.out.println(java.indexOf(""));
		
		java =buffer.toString();
		System.out.println(java);
		
		
	}

}
