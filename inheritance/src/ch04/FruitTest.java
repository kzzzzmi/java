package ch04;

public class FruitTest {

	public static void main(String[] args) {

		Peach peach = new Peach();
		Banana banana = new Banana();
		
		peach.showInfo();
		banana.showInfo();
		
		// ������ - Ŭ������ �پ��� ���·� �ٶ󺻴� (��)
		// �ϳ��� �ڵ尡 ���� �ڷ������� �����Ǿ� ����Ǵ� ��
		// ���� �ڵ忡�� ���� �ٸ� ���� ����� ���ü��� �ִ�
		// ��������, ��Ӱ� ���Ҿ� ��ü���� ���α׷����� ���� ū Ư¡ �� �ϳ�
		// �������� �� Ȱ���ϸ� �����ϰ� Ȯ�强 �ְ�, ���������� ���� ���α׷��� ���� �� �ִ�
		
		System.out.println("==================");
		
		// �ϳ��� ������ �������� ������ ������ �ڷ����� ���� (�迭)
		Fruit[] basket = new Fruit[4];
		basket[0] = new Banana();
		basket[1] = new Peach();
		basket[2] = new Banana();
		basket[3] = new Peach();
		
		// �ڵ� ���� - ������ Ÿ�� (Ÿ�Ա����� Ȯ�� ����)
		// �� Ÿ�� - ���α׷� ���� �� ���� ����
		
		// .�����ڸ� ����ϰ� �Ǹ� ��ü�� Ÿ�Ա����� Ȯ�� ������
		// origin ��� ������ �����ϱ� ���ؼ��� �ٿ� ĳ������ �ؾ� ��
		// �θ��� Ÿ�Կ��� �ڽ��� Ÿ������ �ٿ� ĳ����
		
		String temp = ((Banana)basket[0]).origin;
		System.out.println("������ : " + temp);
		
		// instanceof ������
		if(basket[0] instanceof Banana) {
			System.out.println("�ٳ��� Ÿ���Դϴ�");
		}
		
		if(basket[1] instanceof Peach) {
			System.out.println("������ Ÿ���Դϴ�");
		}
		
		// for���� ����ؼ� �ٳ��� Ÿ���� ��� ȭ�鿡 origin ���� ���
		for(int i=0; i<basket.length; i++) {
			if(basket[i] instanceof Banana) {
				System.out.println(((Banana)basket[i]).origin);
			}
		}

	}

}
