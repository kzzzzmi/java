package ch02;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.ArrayList;

public class GridLayoutEx extends JFrame {

	private ArrayList<JButton> buttons;
	
	public GridLayoutEx() {
		buttons = new ArrayList<JButton>();
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("GridLayout ¿¬½À");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int i=0; i<6; i++) {
			buttons.add(new JButton(i+1 + ""));
		}
	}
	
	private void setInitLayout() {
		setVisible(true);
		setLayout(new GridLayout(2, 3));
		for(int i=0; i<buttons.size(); i++) {
			add(buttons.get(i));
		}
	}

	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
