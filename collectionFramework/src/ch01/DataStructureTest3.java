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
		// ������ �ְ�(�ε���) �ߺ��� ����
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Student> members = new ArrayList<Student>();
		
		// �� �߰� ���
		list1.add(3);
		list1.add(null);
		list1.add(1, 10);
		System.out.println(list1);
		
		// �� ���� ���
		list1.remove(2);
		System.out.println(list1);
		
		// �� ��� ���
		System.out.println(list1.get(1));
		
		for(Integer i : list1) {
			System.out.println(i);
		}
		
		Iterator iter = list1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// ArrayList �� �˻�
		
		System.out.println(list1.contains(3));
		
		// 10 ���� ��� �ִ°�? �ε��� ��ȣ�� �˾ƾ� �ȴ� ��Ȳ
		// ���� ������ index ��ȯ, ������ -1 ��ȯ
		System.out.println(list1.indexOf(10));
		
	}

}
