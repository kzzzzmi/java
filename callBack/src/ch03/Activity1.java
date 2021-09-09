package ch03;

import java.awt.Color;

public class Activity1 extends BaseActivity {

	CallbackCheckPosition callbackCheckPosition = new CallbackCheckPosition() {	
		@Override
		public void checkPosition(Position position) {
			System.out.println("x : " + position.getX());
			System.out.println("y : " + position.getY());
		}
	};
	
	public Activity1(String name) {
		super(name);
	}
	
	@Override
	protected void setInitLayout() {
		super.setInitLayout();
		panel.setBackground(Color.yellow);
	}

}
