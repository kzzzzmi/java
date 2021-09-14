package hash;

public class MainTest1 {

	public static void main(String[] args) {

		MyHash mainObject = new MyHash(20);
		mainObject.saveData("DaveLee", "01022223333");
		mainObject.saveData("fun-coding", "01033334444");
		mainObject.saveData("fun-codinf", "010333344454");
		System.out.println(mainObject.getData("fun-coding"));
		
	}

}
