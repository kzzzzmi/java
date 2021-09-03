package ch04;

class Water {
	
	@Override
	public String toString() {
		return "재료는 물입니다.";
	}
	
}

public class TExtendsClass {

	public static void main(String[] args) {

		// <T extends Class> 사용
		// T 자료형의 범위를 제한할 수 있음 ( 제한하지 않으면 아무 클래스나 자료형으로 들어올 수 있다)
		
		GenericPrinter<Plastic> printer1 = new GenericPrinter<>();
		printer1.setMaterial(new Plastic());
		printer1.getMaterial().doPrinting();
		System.out.println(printer1.toString());
		
		System.out.println("--------------------------------------");
		
		//GenericPrinter<Water> printer2 = new GenericPrinter<Water>();
		
	}

}
