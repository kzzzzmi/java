package ch03;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame {

	JPanel panel1;
	JPanel panel2;
	
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	
	public MyFrame2() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("패널 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		
		panel1 = new JPanel();
		panel1.setBackground(Color.yellow);
		
		panel2 = new JPanel();
		panel2.setBackground(Color.blue);
		
		button1 = new JButton("버튼1");
		button2 = new JButton("버튼2");
		button3 = new JButton("버튼3");
		button4 = new JButton("버튼4");
		button5 = new JButton("버튼5");
		button6 = new JButton("버튼6");
		
		
	}
	
	private void setInitLayout() {
		setVisible(true);
		this.setLayout(new GridLayout(2, 1));
		this.add(panel1);
		this.add(panel2);
		
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 70));
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 70));
		
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
				
	}
	
	
	
	public static void main(String[] args) {
		new MyFrame2();
	}

}
