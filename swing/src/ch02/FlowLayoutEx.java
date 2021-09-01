package ch02;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame {

	private ArrayList<JButton> buttons;

	public FlowLayoutEx() {
		buttons = new ArrayList<JButton>();
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("Flow Layout ¿¬½À");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new FlowLayout(FlowLayout.LEFT, 80, 80));
		for (int i = 0; i < 6; i++) {
			buttons.add(new JButton("" + (i + 1)));
		}
	}

	private void setInitLayout() {
		setVisible(true);
		for (int i = 0; i < buttons.size(); i++) {
			this.add(buttons.get(i));
		}
	}

	public static void main(String[] args) {
		new FlowLayoutEx();
	}

} 