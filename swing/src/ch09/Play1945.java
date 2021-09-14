package ch09;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Play1945 extends JFrame {
	
	BufferedImage bgImage1;
	BufferedImage bgImage2;
	BufferedImage hero;
	
	final int WIDTH_SIZE = 600;
	final int HEIGHT_SIZE = 600;
	int bgY1;
	int bgY2;
	int heroX;
	int heroY;
	ImagePanel imagePanel;
	
	public Play1945() {
		initData();
		setInitLayout();
		addEventListener();
		
		heroX = 200;
		heroY = 200;
		
		// ������ ���� 3��° ���
		new Thread(new Runnable() {	
			@Override
			public void run() {
				while(true) {
					bgY1--;
					bgY2--;
					if(bgY1 < -HEIGHT_SIZE) {
						bgY1 = HEIGHT_SIZE;
					}
					if(bgY2 < -HEIGHT_SIZE) {
						bgY2 = HEIGHT_SIZE;
					}
					repaint();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
	
	private void initData() {
		setSize(WIDTH_SIZE, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		try {
			bgImage1 = ImageIO.read(new File("background_2.jpg"));
			bgImage2 = ImageIO.read(new File("background_2.jpg"));
			hero = ImageIO.read(new File("among1.png"));
		} catch (IOException e) {
			System.err.println("������ �����ϴ�");
		}
	
		imagePanel = new ImagePanel();
	}

	private void setInitLayout() {
		setVisible(true);
		add(imagePanel);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				if(code == e.VK_UP) {
					heroY -= 10;
				} else if(code == e.VK_DOWN) {
					heroY += 10;
				} else if(code == e.VK_LEFT) {
					heroX -= 10;
				} else if(code == e.VK_RIGHT) {
					heroX += 10;
				}
				repaint();
			}
		});
	}

	private class ImagePanel extends JPanel {
		
		public ImagePanel() {
			bgY1 = 0;
			bgY2 = 600;
		}
		
		// �̹��� ��׶��� �׸��� �޼���
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);	// ĵ������ ����ִ� �޼���			
			g.drawImage(bgImage1, 0, bgY1, WIDTH_SIZE, HEIGHT_SIZE, null);
			g.drawImage(bgImage2, 0, bgY2, WIDTH_SIZE, HEIGHT_SIZE, null);
			g.drawImage(hero, heroX, heroY, 100, 100, null);
		}
	}
	
	public static void main(String[] args) {
		new Play1945();
	}
	
}
