package ch10;

public class Zealot {

	private String name;
	private int power;
	private int hp;

	public Zealot(String name) {
		this.name = name;
		this.power = 10;
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

	// ���۸��� �����մϴ�
	public void attack(Zergling zergling) {
		if (zergling.beAttacked(power)) {
			System.out.println(this.name + "�� " + zergling.getName() + "�� �����մϴ�.");
		} else {
			System.out.println(zergling.getName() + "�� �̹� ����߽��ϴ�.");
		}

	}

	// ������ �����մϴ�
	public void attack(Marine marine) {
		if (marine.beAttacked(power)) {
			System.out.println(this.name + "�� " + marine.getName() + "�� �����մϴ�.");
		} else {
			System.out.println(marine.getName() + "�� �̹� ����߽��ϴ�.");
		}
	}

	// ������ �޽��ϴ�
	public boolean beAttacked(int power) {
		if (this.hp <= 0) {

			return false;
		} else {
			this.hp -= power;
			return true;
		}
	}

}
