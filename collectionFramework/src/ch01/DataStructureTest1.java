package ch01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class DataStructureTest1 {

	public static void main(String[] args) {
		
		// 중복이 없고 순서도 없음
		// 모래주머니 느낌
		
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(1); // 중복 값
		set1.add(2);
		set1.add(3);
		set1.add(3);
		set1.add(2);
		
		System.out.println(set1.size());
		
		set1.remove(1);
		System.out.println(set1);
//		// 전체 삭제
//		set1.clear();
//		System.out.println(set1);
		System.out.println(set1.isEmpty());
		
		// for문 사용법 => 순서가 없기에 값을 볼 수 없음
		// index 접근 불가
		for(int i = 0; i < set1.size(); i++) {
			System.out.println("set1 값 확인 : " + i);
		}
		
		// for each 문을 이용하면 값을 볼 수 있음 순서에 상관없이 값을 다 넣기에
		for(Integer integer : set1) {
			System.out.println(integer);
		}
		
		// while문 사용법
		// 요소 순회(반복자) 컬렉션 프레임워크에 저장된 요소를 하나씩 차례로 참조하는 것
		Iterator iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println("값 확인 : " + iter.next());
		}
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		while(set2.size() < 6) {
			set2.add(getRandomNumber());
		}	
		System.out.println(set2);
	}
	
	public static int getRandomNumber() {
		Random random = new Random();
		int value = random.nextInt(45) + 1;
		return value;
	}

}
