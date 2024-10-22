package chapter13.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx04 {
/*
 * Ư¡ : HashSet�� ����������, ��Ұ� ���Ե� ������ �����Ѵ�.
 */
	public static void main(String[] args) {

		Set<String> linkedHashSet = new LinkedHashSet<String>();

		// ��� �߰�
		linkedHashSet.add("Apple");
		linkedHashSet.add("Banana");
		linkedHashSet.add("Orange");
		linkedHashSet.add("Apple");// �ߺ��� ������ ����

		// ���
		System.out.println("HashSet : " + linkedHashSet);

		// ��� ���� ���� Ȯ��
		if (linkedHashSet.contains("Banana")) {
			System.out.println("Banana is in the HashSet");
		}

		// ��� ����
		linkedHashSet.remove("Orange");
		System.out.println("After remobal: " + linkedHashSet);

	}

}
