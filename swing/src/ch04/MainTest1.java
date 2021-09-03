package ch04;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel {
	private Image image;
	
	public ImagePanel() {
		image = new ImageIcon("image1.jpeg").getImage();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}
	
}

class MyFrame extends JFrame {
	
	private ImagePanel imagePanel;

	public MyFrame() {
		initDat();
		setInitLayout();
	}
	
	private void initDat() {
		setTitle("어몽어스 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		imagePanel = new ImagePanel();
	}
	
	private void setInitLayout() {
		setVisible(true);
		add(imagePanel);
	}
	
}

public class MainTest1 {
	
	public static void main(String[] args) {
		new MyFrame();
	}

}
