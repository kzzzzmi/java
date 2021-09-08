package ch06;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MiniAmongUs extends JFrame {
	
	BufferedImage backgroundImage;
	BufferedImage amongImage1;
	BufferedImage amongImage2;
	CustomJPanel customJPanel;
	
	int among1X = 0;
	int among1Y = 370;
	int among2X = 200;
	int among2Y = 200;
	
	public MiniAmongUs() {
		initData();
		setInitLayout();
		addEventListener();
		
		Thread thread = new Thread(customJPanel);
		thread.start();
	}

	private void initData() {
		setTitle("어몽어스");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			backgroundImage = ImageIO.read(new File("background2.jpg"));
			amongImage1 = ImageIO.read(new File("among1.png"));
			amongImage2 = ImageIO.read(new File("among2.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("파일이 없습니다!");
		}
		customJPanel = new CustomJPanel();
		
	}

	private void setInitLayout() {
		setVisible(true);
		add(customJPanel);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				switch(code) {
				case KeyEvent.VK_UP :
					among2Y -= 10;
					break;
				case KeyEvent.VK_DOWN :
					among2Y += 10;
					break;
				case KeyEvent.VK_RIGHT :
					among2X += 10;
					break;
				case KeyEvent.VK_LEFT :
					among2X -= 10;
					break;
				}
				repaint();
			}		
		});
	}
	
	private class CustomJPanel extends JPanel implements Runnable {
		
		@Override
		protected void paintComponent(Graphics g) {
			g.drawImage(backgroundImage, 0, 0, 600, 600, null);
			g.drawImage(amongImage1, among1X, among1Y, 100, 100, null);
			g.drawImage(amongImage2, among2X, among2Y, 100, 100, null);
		}

		@Override
		public void run() {
			
			boolean direction = true;
			while(true) {
				if(direction == true) {
					among1X += 10;
				} else {
					among1X -= 10;
				}
				
				if(among1X > 400) {
					direction = false;
				} 
				if(among1X < 10) {
					direction = true;
				}
				
				if(among1X == among2X && among1Y == among2Y) {
					amongImage2 = null;
				}
				
				repaint();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
}

public class MainTest {

	public static void main(String[] args) {
		new MiniAmongUs();
	}

}
