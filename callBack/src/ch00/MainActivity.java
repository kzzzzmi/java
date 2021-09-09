package ch00;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;



public class MainActivity extends JFrame implements CallbackBtnAction {
	
	JLabel label;
	int count;
	
	public MainActivity() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("∏ﬁ¿Œ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		count = 0;
		label = new JLabel(count + "");
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		add(label);
	}

	@Override
	public void clickedBtnAdd() {
		label.setText(++count + "");
	}

	@Override
	public void clickedBtnMinus() {
		label.setText(--count + "");
	}

}
