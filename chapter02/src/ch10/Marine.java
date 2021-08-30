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
		System.out.println("==== 정보창 ====");
		System.out.println("이름 : " + name);
		System.out.println("공격력 : " + power);
		System.out.println("체력 : " + hp);
		System.out.println("============");
	}
	
	// 질럿을 공격합니다
	public void attack(Zealot zealot) {
		if(zealot.beAttacked(power)) {
			System.out.println(this.name + "이 " + zealot.getName() + "을 공격합니다.");
		} else {
			System.out.println(zealot.getName() + "은 이미 사망했습니다.");
		}
	}
	
	
	// 메서드 오버로딩 사용
	public void attack(Zergling zergling) {
		if(zergling.beAttacked(power)) {
			System.out.println(this.name + "이 " + zergling.getName() + "을 공격합니다.");
		} else {
			System.out.println(zergling.getName() + "은 이미 사망했습니다.");
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
