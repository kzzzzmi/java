package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame extends JFrame {
	
	MyPanel panel;
	
	public MyFrame() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("java 2D Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		panel = new MyPanel();
	}
	
	private void setInitLayout() {
		setVisible(true);
		add(panel);
	}
	
	// 내부 클래스 - static 정적 내부 클래스, 익명 내부 클래스
	class MyPanel extends JPanel {
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawLine(270, 270, 370, 150);		
			g.drawRect(270, 270, 200, 200);
			g.drawLine(370, 150, 470, 270);
			g.drawLine(470, 470, 370, 590);
			g.drawLine(270, 470, 370, 590);
		}
		
	} // End of MyPanel
	
} // End of MyFrame

public class PanelMainTest {

	public static void main(String[] args) {
		new MyFrame();
	}

}
