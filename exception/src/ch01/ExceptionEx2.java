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
			//return;	// ������ return���� �־ finally �� ����� !
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// try ���� ����Ǹ� �ݵ�� �����
			System.out.println("����� ������ �ɱ�");
		}
		System.out.println("����� ���� �ȵǰ���>");
		
	}

}
