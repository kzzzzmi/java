package ch03;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Activity2 extends BaseActivity {

	CallbackCheckPosition callbackCheckPosition;
	Position position;
	
	public Activity2(String name) {
		super(name);
		position = new Position();	
		addEvventListener();
	}
	
	@Override
	protected void setInitLayout() {
		super.setInitLayout();
		panel.setBackground(Color.blue);
	}
	
	public void setCallbackCheckPosition(CallbackCheckPosition callbackCheckPosition) {
		this.callbackCheckPosition = callbackCheckPosition;
	}
	
	private void addEvventListener() {
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				position.setXY(e.getX(), e.getY());
				callbackCheckPosition.checkPosition(position);
			}
		});
	}

}
