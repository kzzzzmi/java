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
		System.out.println("==== 정보창 ====");
		System.out.println("이름 : " + name);
		System.out.println("공격력 : " + power);
		System.out.println("체력 : " + hp);
		System.out.println("============");
	}

	// 마린을 공격합니다
	public void attac(Marine marine) {
		if(marine.beAttacked(power)) {
			System.out.println(this.name + "이 " + marine.getName() + "을 공격합니다.");
		} else {
			System.out.println(marine.getName() + "은 이미 사망했습니다.");
		}
		
	}

	// 질럿을 공격합니다
	public void attack(Zealot zealot) {
		if (zealot.beAttacked(power)) {
			System.out.println(this.name + "이 " + zealot.getName() + "을 공격합니다.");
		} else {
			System.out.println(zealot.getName() + "은 이미 사망했습니다.");
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
