package ch05;

public class GenericMethod {

	public static void main(String[] args) {

		Point<Integer, Integer> p1 = new Point<Integer, Integer>(0, 0);
		Point<Integer, Integer> p2 = new Point<Integer, Integer>(10, 10);
				
		int size = makeRectanngle1(p2, p1);
		System.out.println("size : " + size);
		
		System.out.println("-----------------------------");
		
		Point<Integer, Double> p3 = new Point<>(0, 0.0);
		Point<Integer, Double> p4 = new Point<>(20, 20.0);
				
		double size2 = makeRectangle2(p3, p4);
		System.out.println("size2 : " + size);

		System.out.println("-----------------------------");
	}

	public static <X, Y, Z> double makeTriangle(Point<X, Y> p1, Point<X, Y> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = (right > left) ? right-left : left - right;
		double height = (top > bottom) ? top - bottom : bottom - top;
		
		return width * height / 2;
	}

	public static <X, Y> double makeRectangle2(Point<X, Y> p1, Point<X, Y> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = (right > left) ? right-left : left - right;
		double height = (top > bottom) ? top - bottom : bottom - top;
		
		return width * height;
	}
	
	// 사각형 넓이 구하는 공식 (가로 * 세로)
	public static<X, Y> int makeRectanngle1(Point<X, Y> p1, Point<X, Y> p2) {	
		int left = (int)p1.getX();
		int right = (int)p2.getX();
		
		int top = (Integer)p1.getY();
		int bottom = (Integer)p2.getY();
		
		int width = (right > left) ? right-left : left - right;
		int height = (top > bottom) ? top - bottom : bottom - top;
		
		return width * height;
	}

}
