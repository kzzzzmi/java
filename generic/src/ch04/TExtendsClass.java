package ch04;

class Water {
	
	@Override
	public String toString() {
		return "���� ���Դϴ�.";
	}
	
}

public class TExtendsClass {

	public static void main(String[] args) {

		// <T extends Class> ���
		// T �ڷ����� ������ ������ �� ���� ( �������� ������ �ƹ� Ŭ������ �ڷ������� ���� �� �ִ�)
		
		GenericPrinter<Plastic> printer1 = new GenericPrinter<>();
		printer1.setMaterial(new Plastic());
		printer1.getMaterial().doPrinting();
		System.out.println(printer1.toString());
		
		System.out.println("--------------------------------------");
		
		//GenericPrinter<Water> printer2 = new GenericPrinter<Water>();
		
	}

}
