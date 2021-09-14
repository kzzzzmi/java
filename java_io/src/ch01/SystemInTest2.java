package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class SystemInTest2 {

	public static void main(String[] args) {

		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
		
		int i;
		
		try {
			
			// 바이트를 문자로 변경해주는 녀석 --> 보조 스트림
			InputStreamReader isr = new InputStreamReader(System.in);
			
//			while((i = System.in.read()) !='\n') {
			while((i = isr.read()) !='\n') {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			
		}
	}
}
