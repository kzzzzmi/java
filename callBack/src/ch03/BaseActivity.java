package ch03;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BaseActivity extends JFrame {

	String name;
	JPanel panel;
	
	public BaseActivity(String name) {
		this.name = name;
		initData();
		setInitLayout();
	}

	protected void initData() {
		setTitle(name);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		panel = new JPanel();
	}

	protected void setInitLayout() {
		setVisible(true);
		add(panel);
	}
	
}
