package ch02;

public class TypeConversion {

	public static void main(String[] args) {
		
		// 형 변환	=> 서로 다른 자료형 간에 연산등의 수행을 위해 하나의 자료형으로 통일하는 것을 말함
		// 묵시적 형 변환 (자동 형 변환) -> 업캐스팅
		// 명시적 형 변환 (강제 형 변환) -> 다운캐스팅
		
		// int 자료형을 double 형으로 변환하거나 double 형을 int 형으로 변환하는 것을 말함
		
		int iNum1 = 100;
		System.out.println(iNum1);
		
		// 자동 형 변환
		double dNum1 = iNum1;
		System.out.println(dNum1);
		
		// 강제 형 변환
		double dNumber = 1.12341;
		//int iNumber = dNumber;		// 오류 : 큰 메모리의 크기를 가진 변수를 상대적으로 작은 메모리의 크기를 가진 변수에 넣을 수 없음

		// 컴파일러야 괜찮으니깐 그냥 강제로 넣어!
		int iNumber = (int)dNumber;
		System.out.println(iNumber);
		// 소수점을 버리고 값을 저장 (데이터 손실 발생)
		
		double aValue;
		int bValue;
		
		aValue = 0.5;
		bValue = (int)10.1;
		System.out.println(bValue);

	}

}
