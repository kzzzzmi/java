package ch03;

import ch02.Plastic;
import ch02.Powder;

public class GenericprinterTest {

	public static void main(String[] args) {

		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		// ����� �� �ڷ����� �־��ָ� �ȴ�
		
		GenericPrinter<Powder> printer = new GenericPrinter<>();
		printer.setMaterial(powder);
		System.out.println(printer.toString());
		
	}

}
