package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

interface CallbackBtnAction {
	public abstract void clickedAddBtn();
	public  void clickedMinusBtn();
	// �Ű������� �� ����(�⺻ ������ Ÿ��, ���� Ÿ��)
	public void passValue(int value);
}

// �ݹ� �޴� ��ü : CallbackBtnAction �������̽��� �����ؼ� �޼��带 ����Ѵ�
class MainActivity extends JFrame implements CallbackBtnAction {

	int count;
	JLabel label;

	public MainActivity() {
		count = 0;
		label = new JLabel(count + "");
		setSize(300, 300);
		setLayout(new FlowLayout());
		add(label);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void clickedAddBtn() {
		label.setText(++count + "");
	}

	@Override
	public void clickedMinusBtn() {
		label.setText(--count + "");
	}

	@Override
	public void passValue(int value) {
		label.setText("�Ű� ������ �� ���� ���� : " + value);
	}

}

// �ݸ�(ȣ����) : �ݹ� �޴� ��ü�� �ּҰ��� �˰� �־�� ��� ������ ����ƴٰ� �˸� �� �ִ�
class SubActivity extends JFrame implements ActionListener {

	JButton btnAdd;
	JButton btnMinus;
	JButton btnPassValue; 
	
	CallbackBtnAction callbackBtnAction;

	public SubActivity(CallbackBtnAction callbackBtnAction) {
		this.callbackBtnAction = callbackBtnAction;
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		btnAdd = new JButton("���ϱ� ��ư");
		btnMinus = new JButton("���� ��ư");
		btnPassValue = new JButton("�н� ��ư");
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		
		add(btnAdd);
		add(btnMinus);
		add(btnPassValue);
		
		btnAdd.addActionListener(this);
		btnMinus.addActionListener(this);
		btnPassValue.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton targetBtn = (JButton) e.getSource();
		if (targetBtn.getText().equals(btnAdd.getText())) {
			this.callbackBtnAction.clickedAddBtn();
		} else if(targetBtn.getText().equals(btnMinus.getText())) {
			this.callbackBtnAction.clickedMinusBtn();
		} else {
			this.callbackBtnAction.passValue(100);
		}
	}

}

public class Callback {

	public static void main(String[] args) {
		MainActivity callbackBtnAction = new MainActivity();
		new SubActivity(callbackBtnAction);
	}

}
