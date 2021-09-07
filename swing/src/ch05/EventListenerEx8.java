package ch05;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class MyFrame8 extends JFrame {
	
	JTextArea area;
	JScrollPane scroll;
	
	public MyFrame8() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("키 어뎁터 내부 클래스 만들기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		area = new JTextArea();
		scroll = new JScrollPane(area);
	}
	private void setInitLayout() {
		setVisible(true);
		add(scroll);
	}

	private void addEventListener() {
		area.addKeyListener(new MyFrameAdapter());
		
	}
	
	private class MyFrameAdapter extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			area.append("\n" + "KeyCode : " + keyCode + "\n");
			area.append("Char : " + e.getKeyChar() + "\n");
			
			if(keyCode == KeyEvent.VK_UP) {
				System.out.println("방향키 위로가 눌러졌습니다");
			} else if(keyCode == KeyEvent.VK_DOWN) {
				System.out.println("방향키 아래가 눌러졌습니다");
			} else if(keyCode == KeyEvent.VK_LEFT) {
				System.out.println("방향키 왼쪽이 눌러졌습니다");
			} else if(keyCode == KeyEvent.VK_RIGHT) {
				System.out.println("방향키 오른쪽이 눌러졌습니다");
			}
		}
	}
	
}

public class EventListenerEx8 {

	public static void main(String[] args) {
		new MyFrame8();
	}

}
