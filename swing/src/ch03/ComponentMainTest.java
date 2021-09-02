package ch03;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class MyComponents extends JFrame {
	
	private JPanel panel;
	private JButton button;
	private JLabel label;
	private JTextField textField;
	private JPasswordField pwField;
	private JCheckBox checkBox;
	
	public MyComponents(String input) {
		initData(input);
		setInitLayout();
	}
	
	private void initData(String input) {
		setTitle("컴포넌트 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		panel = new JPanel();
		button = new JButton("button");
		label = new JLabel("안녕하세요");
		textField = new JTextField(input, 20);
		pwField = new JPasswordField(20);
		checkBox = new JCheckBox("Test1", true);
	}
	
	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		panel.setBackground(Color.yellow);
		
		this.add(panel);	
		panel.add(button);
		panel.add(label);
		panel.add(label);
		panel.add(textField);
		panel.add(pwField);
		panel.add(checkBox);
	}
	
}

public class ComponentMainTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("글자를 입력하세요");
		String input = sc.next();
		
		new MyComponents(input);
		
	}

}
