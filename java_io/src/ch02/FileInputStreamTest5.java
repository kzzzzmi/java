package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest5 {

	public static void main(String[] args) {

		try(FileInputStream fis = new FileInputStream("assets/input2.txt")) {
			
			byte[] bs = new byte[10];
//			fis.read(bs, 0, 5);
//			
//			for(byte b : bs) {
//				System.out.println((char)b);
//			}
			
			// for문으로 변경
			int i;
			while((i = fis.read(bs, 0, 5)) != -1) {
				for(int j = 0; j < i; j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(": " + i + "바이트 읽음");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
