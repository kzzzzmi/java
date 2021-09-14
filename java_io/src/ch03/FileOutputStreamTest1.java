package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {

		// true �� append 
		// �������鼭 �۾��ϱ�
		try(FileOutputStream fos = new FileOutputStream("output.txt", true)) {
			fos.write(65);
			fos.write(66);
			fos.write(67);
		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
		
	}

}
