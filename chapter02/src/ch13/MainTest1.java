package ch13;

public class MainTest1 {

	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("질럿1");
		Zergling zergling1 = new Zergling("저글링1");
		Marine marine1 = new Marine("마린1");
		
		zealot1.attack(marine1);
		zealot1.attack(marine1);
		zealot1.attack(marine1);
		
		marine1.showInfo();
		

	}

}
