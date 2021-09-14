package ch01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class DataStructureTest1 {

	public static void main(String[] args) {
		
		// �ߺ��� ���� ������ ����
		// ���ָӴ� ����
		
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(1); // �ߺ� ��
		set1.add(2);
		set1.add(3);
		set1.add(3);
		set1.add(2);
		
		System.out.println(set1.size());
		
		set1.remove(1);
		System.out.println(set1);
//		// ��ü ����
//		set1.clear();
//		System.out.println(set1);
		System.out.println(set1.isEmpty());
		
		// for�� ���� => ������ ���⿡ ���� �� �� ����
		// index ���� �Ұ�
		for(int i = 0; i < set1.size(); i++) {
			System.out.println("set1 �� Ȯ�� : " + i);
		}
		
		// for each ���� �̿��ϸ� ���� �� �� ���� ������ ������� ���� �� �ֱ⿡
		for(Integer integer : set1) {
			System.out.println(integer);
		}
		
		// while�� ����
		// ��� ��ȸ(�ݺ���) �÷��� �����ӿ�ũ�� ����� ��Ҹ� �ϳ��� ���ʷ� �����ϴ� ��
		Iterator iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println("�� Ȯ�� : " + iter.next());
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
