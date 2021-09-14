package ch01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
	String name;
	int grade;
}

public class DataStructureTest3 {

	public static void main(String[] args) {

		List list;
		// 순서가 있고(인덱스) 중복이 가능
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Student> members = new ArrayList<Student>();
		
		// 값 추가 방법
		list1.add(3);
		list1.add(null);
		list1.add(1, 10);
		System.out.println(list1);
		
		// 값 삭제 방법
		list1.remove(2);
		System.out.println(list1);
		
		// 값 출력 방법
		System.out.println(list1.get(1));
		
		for(Integer i : list1) {
			System.out.println(i);
		}
		
		Iterator iter = list1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// ArrayList 값 검색
		
		System.out.println(list1.contains(3));
		
		// 10 값이 어디에 있는가? 인덱스 번호를 알아야 된느 상황
		// 값이 있으면 index 반환, 없으면 -1 반환
		System.out.println(list1.indexOf(10));
		
	}

}
