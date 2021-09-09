package ch02;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

// �ݸ�(ȣ����)
public class Activity2 extends JFrame {

	String name;
	JPanel panel;
	// �ּҰ��� ����ش�
	CallbackCheckPosition callbackCheckPosition;
	
	public void setCallbackCheckPosition(CallbackCheckPosition callbackCheckPosition) {
		this.callbackCheckPosition = callbackCheckPosition;
	}
	
	public Activity2(String name) {
		this.name = name;
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle(name);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
	}

	private void setInitLayout() {
		setVisible(true);
		add(panel);
		panel.setBackground(Color.yellow);
	}
	
	private void addEventListener() {
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				callbackCheckPosition.checkPosition(x, y);
			}
		});
	}
	
}
