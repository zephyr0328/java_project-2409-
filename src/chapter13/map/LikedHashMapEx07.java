package chapter13.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LikedHashMapEx07 {

	public static void main(String[] args) {
		// HashMap ��ü ���� �� ������ �߰�
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("apple", "red");
		hashMap.put("banana", "yellow");
		hashMap.put("grape", "purple");
		hashMap.put("orange", "orange");

		// HashMap ��� (���� ������� ����)
		for (Map.Entry<String, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		// LinkedHashMap ��ü ���� �� ������ �߰�
		Map<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("apple", "red");
		linkedHashMap.put("banana", "yellow");
		linkedHashMap.put("grape", "purple");
		linkedHashMap.put("orange", "orange");
		
		// LinkedHashMap ��� (�Է� ���� ����)
        System.out.println("\n== LinkedHashMap ��� (�Էµ� ����) ==");
		for (Map.Entry<String, String> entry1 : linkedHashMap.entrySet()) {
			System.out.println(entry1.getKey() + " : " + entry1.getValue());
		}

	}

}
