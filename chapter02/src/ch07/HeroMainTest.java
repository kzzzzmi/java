package ch07;

public class HeroMainTest {

	public static void main(String[] args) {

		Hero hero = new Hero("����", 100, 10);
		
		String name = hero.getName();
		System.out.println(name);
		
		int hp = hero.getHp();
		System.out.println(hp);
		
		int power = hero.getPower();
		System.out.println(power);
		
		// ���ݷ� ���׷�����
		hero.setPower(20);
		System.out.println(hero.getPower());
		
		// ���� ���׷��̵�
		hero.setHp(200);
		System.out.println(hero.getHp());
	}

}