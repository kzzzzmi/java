package ch02;

public class Engine {

	String name;
	int price;
	// ���԰���� �����ؾ� ��
	Engine engine;
	
	public Engine(String name, int price) {
		this.name = name;
		this.price = price;
		engine = new Engine("GDI", 400);
	}
	
	public void showInfo() {
		System.out.println("name : " + name);
		System.out.println("price : " + price);
	}
	
}
