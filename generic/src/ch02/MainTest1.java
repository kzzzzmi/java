package ch02;

public class MainTest1 {

	public static void main(String[] args) {

		// 재료
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		ThreeDPrinter1 dPrinter1 = new ThreeDPrinter1();
		// 재료 셋팅
		dPrinter1.setMaterial(powder);
		
		// 재료를 꺼내서 확인
		System.out.println(dPrinter1.getMaterial().toString());
		
		System.out.println("---------------------");
		
		ThreeDPrinter2 dPrinter2 = new ThreeDPrinter2();
		dPrinter2.setMaterial(plastic);
		System.out.println(dPrinter2.getMaterial().toString());
		
		System.out.println("---------------------");
		
		// 모든 클래스의 최상위 클래스가 Object 클래스이기에 가능
		ThreeDPrinter3 dPrinter3 = new ThreeDPrinter3();
		dPrinter3.setMaterial(powder);
		System.out.println(dPrinter3.getMaterial().toString());
		
		// 자료를 꺼내보기
		

	}

}
