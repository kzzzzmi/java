package ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionEx2 {

	public static void main(String[] args) {

		FileInputStream fis;
		
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//return;	// 심지어 return문이 있어도 finally 가 실행됨 !
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// try 문이 실행되면 반드시 실행됨
			System.out.println("여기는 실행이 될까");
		}
		System.out.println("여기는 실행 안되겠지>");
		
	}

}
