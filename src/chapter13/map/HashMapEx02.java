package chapter13.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx02 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("�����", 85);
		map.put("�̼���", 90);
		map.put("���ϳ�", 98);
		map.put("������", 75);
		System.out.println("�� Entry �� : " + map.size());

		// ��ü ã��
		System.out.println("\n�̼��� : " + map.get("�̼���"));

		// ��ü Ű ��� �ޱ�
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();

		while (keyIterator.hasNext()) {
			String key = keyIterator.next(); // Ű �ޱ�
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();

		// ��ü ��ü ����
		map.clear();
		System.out.println("�� Entry �� : " + map.size());

	}

}
