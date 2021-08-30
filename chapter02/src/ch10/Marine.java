package ch10;

public class Marine {

	private String name;
	private int power;
	private int hp;
	
	public Marine(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 100;
	}

	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	public int getHp() {
		return hp;
	}
	
	public void showInfo() {
		System.out.println("==== ����â ====");
		System.out.println("�̸� : " + name);
		System.out.println("���ݷ� : " + power);
		System.out.println("ü�� : " + hp);
		System.out.println("============");
	}
	
	// ������ �����մϴ�
	public void attack(Zealot zealot) {
		if(zealot.beAttacked(power)) {
			System.out.println(this.name + "�� " + zealot.getName() + "�� �����մϴ�.");
		} else {
			System.out.println(zealot.getName() + "�� �̹� ����߽��ϴ�.");
		}
	}
	
	
	// �޼��� �����ε� ���
	public void attack(Zergling zergling) {
		if(zergling.beAttacked(power)) {
			System.out.println(this.name + "�� " + zergling.getName() + "�� �����մϴ�.");
		} else {
			System.out.println(zergling.getName() + "�� �̹� ����߽��ϴ�.");
		}
		
		
	}
	
	public boolean beAttacked(int power) {
		if(this.hp <= 0) {
			return false;
		} else {
			this.hp -= power;
			return true;
		}
	}
	
}
