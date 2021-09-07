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
		setTitle("Ű ��� ���� Ŭ���� ����� ����");
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
				System.out.println("����Ű ���ΰ� ���������ϴ�");
			} else if(keyCode == KeyEvent.VK_DOWN) {
				System.out.println("����Ű �Ʒ��� ���������ϴ�");
			} else if(keyCode == KeyEvent.VK_LEFT) {
				System.out.println("����Ű ������ ���������ϴ�");
			} else if(keyCode == KeyEvent.VK_RIGHT) {
				System.out.println("����Ű �������� ���������ϴ�");
			}
		}
	}
	
}

public class EventListenerEx8 {

	public static void main(String[] args) {
		new MyFrame8();
	}

}
