package ch09;

public class Baron {

	private static Baron instance = new Baron();
	
	private Baron() {}
	
	public static Baron getInstance() {
		if(instance == null) {
			instance = new Baron();
		}
		return instance;
	}
	
}
