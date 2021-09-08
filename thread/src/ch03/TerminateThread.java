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

		System.out.println("�۾��߸� �����ϰڽ��ϴ�");
		// ���� �����尡 �۾��ڸ� ����
		MyThread thread1 = new MyThread();
		// �۾��� 1�� �۾��� ���� (run �޼��� ȣ��)
		thread1.start();
		
		// ���� �����尡 �۾���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = 1;		
		do {	
			System.out.println("�����Ϸ��� 0���� �Է��Ͻÿ�");
			input =Integer.parseInt(br.readLine());
			if(input == 0) {
				thread1.flag = false;
			}
		} while(input != 0);
		
		
	}

}
