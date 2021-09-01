package ch13;

// new Ű���带 ����ؼ� �޸𸮿� �ø� �� ����
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
		System.out.println("====����â(" + this.name + " ) ====");
		System.out.println("�̸� : " + this.name);
		System.out.println("���ݷ� : " + this.power);
		System.out.println("ü�� : " + this.hp);
		System.out.println("============");
	}
	
	public void beAttacked(int power) {
		if(hp <= 0) {
			System.out.println(name + "�� �̹� �׾����ϴ�"); 
			power = 0;
		} else {
			 hp -= power;
		}
	}
	
	public void attack(Unit unit) {
		System.out.println(this.name + " �� " + unit.getName() + " �� ���� �մϴ�.");
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
