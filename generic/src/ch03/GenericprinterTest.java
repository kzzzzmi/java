package ch03;

import ch02.Plastic;
import ch02.Powder;

public class GenericprinterTest {

	public static void main(String[] args) {

		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		// 사용할 때 자료형을 넣어주면 된다
		
		GenericPrinter<Powder> printer = new GenericPrinter<>();
		printer.setMaterial(powder);
		System.out.println(printer.toString());
		
	}

}
