package ch13;

// new 키워드를 사용해서 메모리에 올릴 수 없다
public abstract class Unit {
	
	protected String name;
	protected int power;
	protected int hp;
	
	public Unit(String name, int power, int hp) {
		this.name = name;
		this.power = power;
		this.hp = hp;
	}
	
	public void showInfo() {
		System.out.println("====정보창(" + this.name + " ) ====");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
		System.out.println("============");
	}
	
	public void beAttacked(int power) {
		if(hp <= 0) {
			System.out.println(name + "는 이미 죽었습니다"); 
			power = 0;
		} else {
			 hp -= power;
		}
	}
	
	public void attack(Unit unit) {
		System.out.println(this.name + " 이 " + unit.getName() + " 을 공격 합니다.");
		unit.beAttacked(this.power);
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
	
}
