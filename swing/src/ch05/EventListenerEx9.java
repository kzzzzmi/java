package ch05;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame9 extends JFrame implements KeyListener {

	BufferedImage backgroundImage;
	BufferedImage imageIcon;
	MyImagePanel imagePanel;
	int xPoint = 200;
	int yPoint = 200;

	public MyFrame9() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("이미지 백그라운드 연습");
		setSize(515, 535);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImage = ImageIO.read(new File("background2.jpg"));
			imageIcon = ImageIO.read(new File("among1.png"));
			System.out.println("파일을 정상적으로 가져왔습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		imagePanel = new MyImagePanel();
	}

	private void setInitLayout() {
		setVisible(true);
		add(imagePanel);
	}

	private void addEventListener() {
		this.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		
		if (keyCode == KeyEvent.VK_UP) {
			yPoint = (yPoint < 10) ? 0 : yPoint - 10;
		} else if (keyCode == KeyEvent.VK_DOWN) {
			yPoint = (yPoint > 390 ) ? 400 : yPoint + 10;
		} else if (keyCode == KeyEvent.VK_LEFT) {
			xPoint = (xPoint < 10) ? 0 : xPoint - 10;
		} else if (keyCode == KeyEvent.VK_RIGHT) {
			xPoint = (xPoint > 390) ? 400 : xPoint + 10;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	private class MyImagePanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon, xPoint, yPoint, 100, 100, null);
			System.out.println("Log : paintComponent 메서드 실행");
		}

	}

}

public class EventListenerEx9 {

	public static void main(String[] args) {
		new MyFrame9();
	}

}
