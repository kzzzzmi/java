package ch01;

import javax.swing.JFrame;

class MyRunnable2 extends JFrame {

	int grade = 10;

	// 내부 익명 객체를 변수에 담아서 사용하는 방법
	Runnable runnable = new Runnable() {
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.print("--");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};

	public MyRunnable2() {
		runnable.run();
	}

}

public class Runnable2 {

	public static void main(String[] args) {
		MyRunnable2 runnable2 = new MyRunnable2();
		runnable2.runnable.run();
	}

}
