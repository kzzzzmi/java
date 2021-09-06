package ch05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ColorChangeFrame extends JFrame implements ActionListener {
	
	final String[] color = {"빨간색", "노랑색", "파란색", "초록색", "초기화"};
	BorderLayout borderLayout;
	JPanel panelTop;
	JPanel panelBot;

	JButton[] buttons = new JButton[5];
	
	public ColorChangeFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("배경색 바꾸기 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		borderLayout = new BorderLayout();
		
		panelBot = new JPanel();
		panelTop = new JPanel();
		panelTop.setBackground(Color.gray);
		panelTop.setPreferredSize(new Dimension(500, 400));		
		panelBot = new JPanel(new FlowLayout(50, 20, 18));
		
		for(int i=0; i<buttons.length; i++) {
			buttons[i] = new JButton(color[i]);
		}
	}
	
	private void setInitLayout() {
		setVisible(true);
		this.setLayout(borderLayout);
		add(panelTop, BorderLayout.NORTH);
		add(panelBot, BorderLayout.SOUTH);
		
		for(JButton button : buttons) {
			panelBot.add(button);
		}
	}
	
	private void addEventListener() {
		for(int i=0; i<buttons.length; i++) {
			buttons[i].addActionListener(this);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton targetBtn = (JButton)e.getSource();
		
		if(targetBtn == buttons[0]) {
			panelTop.setBackground(Color.red);
		} else if(targetBtn == buttons[1]){
			panelTop.setBackground(Color.yellow);
		} else if(targetBtn == buttons[2]) {
			panelTop.setBackground(Color.blue);
		} else if(targetBtn == buttons[3]) {
			panelTop.setBackground(Color.green);
		} else {
			panelTop.setBackground(Color.gray);
		}
	}
	
}

public class EventListenerEx3 {

	public static void main(String[] args) {
		// 익명 클래스 (인스턴스 변수가 없기 떄문에 지속적으로 접근해서 사용할 수가 없다)
		new ColorChangeFrame();
	}

}
