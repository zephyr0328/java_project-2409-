package chapter13.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx04 {
/*
 * 특징 : HashSet과 동일하지만, 요소가 삽입된 순서를 유지한다.
 */
	public static void main(String[] args) {

		Set<String> linkedHashSet = new LinkedHashSet<String>();

		// 요소 추가
		linkedHashSet.add("Apple");
		linkedHashSet.add("Banana");
		linkedHashSet.add("Orange");
		linkedHashSet.add("Apple");// 중복이 허용되지 않음

		// 출력
		System.out.println("HashSet : " + linkedHashSet);

		// 요소 존재 여부 확인
		if (linkedHashSet.contains("Banana")) {
			System.out.println("Banana is in the HashSet");
		}

		// 요소 삭제
		linkedHashSet.remove("Orange");
		System.out.println("After remobal: " + linkedHashSet);

	}

}
