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
		System.out.println("==== 정보창 ====");
		System.out.println("이름 : " + name);
		System.out.println("공격력 : " + power);
		System.out.println("체력 : " + hp);
		System.out.println("============");
	}

	// 저글링을 공격합니다
	public void attack(Zergling zergling) {
		if (zergling.beAttacked(power)) {
			System.out.println(this.name + "이 " + zergling.getName() + "을 공격합니다.");
		} else {
			System.out.println(zergling.getName() + "은 이미 사망했습니다.");
		}

	}

	// 마린을 공격합니다
	public void attack(Marine marine) {
		if (marine.beAttacked(power)) {
			System.out.println(this.name + "이 " + marine.getName() + "을 공격합니다.");
		} else {
			System.out.println(marine.getName() + "은 이미 사망했습니다.");
		}
	}

	// 공격을 받습니다
	public boolean beAttacked(int power) {
		if (this.hp <= 0) {

			return false;
		} else {
			this.hp -= power;
			return true;
		}
	}

}
