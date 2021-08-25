package ch07;

public class Hero {

	private String name;
	private int hp;
	private int power;
	
	public Hero(String name, int hp, int power) {
		this.name = name;
		this.hp = hp;
		this.power = power;
	}

	// getter / setter
	// alt + shift + s
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
}
