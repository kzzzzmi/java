package ch10;

public class Zergling {

	private String name;
	private int power;
	private int hp;

	public Zergling(String name) {
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
	public void attac(Marine marine) {
		if(marine.beAttacked(power)) {
			System.out.println(this.name + "�� " + marine.getName() + "�� �����մϴ�.");
		} else {
			System.out.println(marine.getName() + "�� �̹� ����߽��ϴ�.");
		}
		
	}

	// ������ �����մϴ�
	public void attack(Zealot zealot) {
		if (zealot.beAttacked(power)) {
			System.out.println(this.name + "�� " + zealot.getName() + "�� �����մϴ�.");
		} else {
			System.out.println(zealot.getName() + "�� �̹� ����߽��ϴ�.");
		}
	}

	public boolean beAttacked(int power) {
		if (this.hp <= 0) {
			return false;
		} else {
			this.hp -= power;
			return true;
		}
	}

}
