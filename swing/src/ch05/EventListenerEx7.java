package ch05;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

class MyFrame7 extends JFrame implements KeyListener {

	private JTextArea area;
	
	public MyFrame7() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("Ű �̺�Ʈ ����");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();
	}

	private void setInitLayout() {
		setVisible(true);
		add(area);
	}

	private void addEventListener() {
		area.addKeyListener(this);
	}
	
	private void display(KeyEvent e) {
		int keyCode = e.getKeyCode();
		area.append(keyCode + "\n");
	}

	// ���ڸ� ������ �� ȣ��, ����Ű���� ����
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		display(e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

public class EventListenerEx7 {

	public static void main(String[] args) {
		new MyFrame7();
	}

}
