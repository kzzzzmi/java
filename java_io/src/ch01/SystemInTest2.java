package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class SystemInTest2 {

	public static void main(String[] args) {

		System.out.println("���ĺ� ���� ���� ���� [Enter]�� ��������");
		
		int i;
		
		try {
			
			// ����Ʈ�� ���ڷ� �������ִ� �༮ --> ���� ��Ʈ��
			InputStreamReader isr = new InputStreamReader(System.in);
			
//			while((i = System.in.read()) !='\n') {
			while((i = isr.read()) !='\n') {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			
		}
	}
}
