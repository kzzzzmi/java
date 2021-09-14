package ch07;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class LottoFrame extends JFrame {

	MyPanel panelBot;
	JButton button;

	int[] lottoNum;

	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("로또 번호 추출");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panelBot = new MyPanel();
		button = new JButton("당첨 번호 추출");
		lottoNum = new int[6];
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(new BorderLayout());
		panelBot.setBackground(Color.cyan);
		add(button, BorderLayout.NORTH);
		add(panelBot, BorderLayout.CENTER);
	}

	private void addEventListener() {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Random random = new Random();
				for (int i = 0; i < lottoNum.length; i++) {
					lottoNum[i] = random.nextInt(45) + 1;
					for (int j = 0; j < i; j++) {
						if (lottoNum[i] == lottoNum[j]) {
							i--;
							break;
						}
					}
				}
				Arrays.sort(lottoNum);
				repaint();
			}
		});
	}

	private class MyPanel extends JPanel {
		@Override
		public void paint(Graphics g) {
			Font font = new Font("궁서체", Font.BOLD, 20);
			g.setFont(font);
			if (lottoNum[0] != 0) {
				g.drawString(Arrays.toString(lottoNum), 180, 180);
			}
		}
	}

}

public class Lotto {

	public static void main(String[] args) {
		new LottoFrame();
	}

}
