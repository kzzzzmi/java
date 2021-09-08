package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyThread extends Thread {
	
	boolean flag = true;
	
	@Override
	public void run() {
		while(flag) {
			System.out.print("-");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class TerminateThread {
	
	public static void main(String[] args) throws IOException {

		System.out.println("작업잘를 생성하겠습니다");
		// 메인 쓰레드가 작업자를 생성
		MyThread thread1 = new MyThread();
		// 작업자 1이 작업을 시작 (run 메서드 호출)
		thread1.start();
		
		// 메인 쓰레드가 작업함
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = 1;		
		do {	
			System.out.println("중지하려면 0번을 입력하시오");
			input =Integer.parseInt(br.readLine());
			if(input == 0) {
				thread1.flag = false;
			}
		} while(input != 0);
		
		
	}

}
