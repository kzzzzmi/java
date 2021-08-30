package ch02;

public class Engine {

	String name;
	int price;
	// 포함관계로 설계해야 함
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
