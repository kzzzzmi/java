package ch04;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {

		try(FileWriter fw = new FileWriter("assets/wrter.txt")) {
			fw.write('A');
			char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};
			fw.write(buf);
			fw.write("�ȳ��ϼ���. �� �����׿�");
			fw.write(buf, 1, 2);
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("����� �Ϸ�ƽ��ϴ�");
		
	}

}
