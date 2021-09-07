package ch05;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

class MyFrame6 extends JFrame {
	public MyFrame6() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("어뎁터 클래스 이용 방법");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);

	}

	private void setInitLayout() {
		setVisible(true);

	}

	private void addEventListener() {
		this.addMouseListener(new MyMouseListener());
	}

	// 내부 클래스
	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			System.out.println("X : " + x + ", Y : " + y);
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println("마우스가 들어왔습니다");
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			System.out.println("마우스가 나갔습니다");
		}
	}

}

public class EventListenerEx6 {

	public static void main(String[] args) {
		new MyFrame6();
	}

}
