package ch05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class BufferedStreamTest {

	public static void main(String[] args) throws IOException {

		long millisecond = 0;

		try (FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip");
				
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				// 데코레이션 패턴 - 기능의 확장 보조스트림을 쓰기 위해 기반 스트림을 생성
				) {
			
			millisecond = System.currentTimeMillis();

			int i;
//			while ((i = fis.read()) != -1) {
//				fos.write(i);
//			}
			while((i = bis.read()) != -1) {
				bos.write(i);
			}

			millisecond = System.currentTimeMillis() - millisecond;
		} catch (IOException e) {
			System.out.println(e);
		}

		System.out.println("파일 복사하는데 " + millisecond + " 소요 됐습니다");

//		Socket socket = new Socket();
//		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//		br.readLine();
		
	}

}
