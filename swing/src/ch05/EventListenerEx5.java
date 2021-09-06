package ch05;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame5 extends JFrame {

	JLabel label;

	public MyFrame5() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("마우스 이벤트");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("Hello");
		label.setSize(50, 50);
		label.setOpaque(true);
		label.setBackground(Color.blue);
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		add(label);
		label.setLocation(50, 50);
		System.out.println(label.getBounds());
	}
	
	private void addEventListener() {
		this.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				label.setLocation(e.getX(), e.getY() - label.getBounds().height);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
		});
	}

}

public class EventListenerEx5 {

	public static void main(String[] args) {
		new MyFrame5();
	}

}
