package ch02;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx extends JFrame {

	private ArrayList<JButton> buttons;

	// ��� ����
	// ������
	// �޼���

	public NoLayoutEx() {
		buttons = new ArrayList<JButton>();
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("No Layout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);

		for (int i = 0; i < 5; i++) {
			buttons.add(new JButton());
		}
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null);

		// ��ư�� ũ�⸦ ���� �����ؾ���
		buttons.get(0).setSize(100, 100);
		buttons.get(0).setLocation(100, 150);

		buttons.get(1).setSize(100, 100);
		buttons.get(1).setLocation(300, 150);

		buttons.get(2).setSize(100, 100);
		buttons.get(2).setLocation(200, 250);

		buttons.get(3).setSize(100, 100);
		buttons.get(3).setLocation(200, 50);

		buttons.get(4).setSize(100, 100);
		buttons.get(4).setLocation(200, 150);

		for (JButton button : buttons) {
			add(button);
		}

	}
	
	private int setupPosition (int size, int index) {
		int result = (index + 1) * size;
		return result;
	}

	public static void main(String[] args) {
		new NoLayoutEx();
	}

}
