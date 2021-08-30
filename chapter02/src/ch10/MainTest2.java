package ch10;

public class MainTest2 {

	public static void main(String[] args) {

		// 연간된 데이터를 통으로 모아서 관리하기 하는 것
		Zealot[] zealots = new Zealot[12];		// 선언 메모리 확보
		
		for(int i=0; i<zealots.length; i++) {
			zealots[i] = new Zealot("질럿" + i);
		}
		
		zealots[0].showInfo();
		
		for(int i=0; i<zealots.length; i++) {
			zealots[i].showInfo();
		}
		
		
		
	}

}
