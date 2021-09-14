package ch01;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class DataStructureTest2 {

	public static void main(String[] args) {

		Map map;
		
		// Map �迭�� key�� value ������ �����͸� �����Ѵ�
		// null ���� ���
		HashMap<String, String> map1 = new HashMap<>();
		
		// null ���� ������� �ʴ´�.
		Hashtable<String, String> map2 = new Hashtable<>();
		
		map1.put("A01", "������������");
		map1.put("A02", "���������Ĺ�");
		map1.put("A03", "�������׷κ�");
		map1.put("B01", "��õ���׷κ�");
		map1.put("B02", "��õ�����Ĺ�");
		map1.put("C01", null);
		
		System.out.println(map1);
		System.out.println(map1.get("A03"));
		
		// �������
		map1.remove("C01");
//		map1.clear();
		System.out.println(map1);
		// ������ Ȯ�ι�
		System.out.println(map1.size());
		System.out.println("-----------------------------------");
		
		// java.util.Map.Entry
		for(Entry<String, String> entry : map1.entrySet()) {
			System.out.println("[key] : " + entry.getKey() + " [value] : " + entry.getValue());
		}
		
		System.out.println("=============================");
		
		for(String key : map1.keySet()) {
			System.out.println("[key] : " + key + " [value] : " + map1.get(key));
		}
		
	}

}
