package ch00;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SubActivity extends JFrame implements ActionListener {

	JButton btnAdd;
	JButton btnMinus;
	
	CallbackBtnAction callbackBtnAction;
	
	public SubActivity(CallbackBtnAction callbackBtnAction) {
		this.callbackBtnAction = callbackBtnAction;
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("서브");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		btnAdd = new JButton("더하기");
		btnMinus = new JButton("빼기");
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		add(btnAdd);
		add(btnMinus);
	}

	private void addEventListener() {
		btnAdd.addActionListener(this);
		btnMinus.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		if(btn.getText().equals(btnAdd.getText())) {
			callbackBtnAction.clickedBtnAdd();
		} else if(btn.getText().equals(btnMinus.getText())) {
			callbackBtnAction.clickedBtnMinus();
		}
	}
	
}
