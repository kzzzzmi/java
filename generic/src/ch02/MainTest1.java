package ch02;

public class MainTest1 {

	public static void main(String[] args) {

		// ���
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		ThreeDPrinter1 dPrinter1 = new ThreeDPrinter1();
		// ��� ����
		dPrinter1.setMaterial(powder);
		
		// ��Ḧ ������ Ȯ��
		System.out.println(dPrinter1.getMaterial().toString());
		
		System.out.println("---------------------");
		
		ThreeDPrinter2 dPrinter2 = new ThreeDPrinter2();
		dPrinter2.setMaterial(plastic);
		System.out.println(dPrinter2.getMaterial().toString());
		
		System.out.println("---------------------");
		
		// ��� Ŭ������ �ֻ��� Ŭ������ Object Ŭ�����̱⿡ ����
		ThreeDPrinter3 dPrinter3 = new ThreeDPrinter3();
		dPrinter3.setMaterial(powder);
		System.out.println(dPrinter3.getMaterial().toString());
		
		// �ڷḦ ��������
		

	}

}
