package ch10;

public class MainTest2 {

	public static void main(String[] args) {

		// ������ �����͸� ������ ��Ƽ� �����ϱ� �ϴ� ��
		Zealot[] zealots = new Zealot[12];		// ���� �޸� Ȯ��
		
		for(int i=0; i<zealots.length; i++) {
			zealots[i] = new Zealot("����" + i);
		}
		
		zealots[0].showInfo();
		
		for(int i=0; i<zealots.length; i++) {
			zealots[i].showInfo();
		}
		
		
		
	}

}
