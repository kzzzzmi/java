package ch05;

import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class PhoneBook extends JFrame {
	
	// 포함관계
	private InputPhoneNumber inputPhoneNumber;
	
	public PhoneBook() throws IOException {
		inputPhoneNumber = new InputPhoneNumber();
		inputPhoneNumber.savePhoneNumber();
		
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("phone book");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setInitLayout() {
		ArrayList<String> name = inputPhoneNumber.getUserName();
		ArrayList<String> phone = inputPhoneNumber.getPhoneNumber();
		setLayout(new GridLayout(name.size(), 2));
		for(int i=0; i<name.size();i ++) {
			JTextField field1 = new JTextField(name.get(i), 10);
			JTextField field2 = new JTextField(phone.get(i), 20);
			add(field1);
			add(field2);
		}
		setVisible(true);
	}

	public static void main(String[] args) throws IOException {
		new PhoneBook();
	}
	
}
