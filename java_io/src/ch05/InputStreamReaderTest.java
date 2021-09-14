package ch05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {

//		try(FileInputStream fis = new FileInputStream("asset/input2.txt")) {
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("assets/input2.txt"))) {
			
			
			int i;
			while((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
