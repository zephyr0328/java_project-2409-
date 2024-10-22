package chapter13.map;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	/*
	 * • 특징: 해시 테이블을 기반으로 동작하며, 순서를 보장하지 않고 중복된 키를 허용하지 않는다. • 성능: 해시 기반 탐색을 사용하여 매우
	 * 빠른 검색과 삽입을 제공한다.
	 */

	private HashMap<Integer, String> hashMap; // 선언

	public MemberHashMap() {
		hashMap = new HashMap<Integer, String>();
	}

	// addMember
	public void addMember(Member member) {
		hashMap.put(member.getMemeberId(), member.getMemberName());
	}

	// removeMember
	public boolean remobeMember(int memberId) {
		while (hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	// showAllMember
	public void showAllMember() {
		// map 구조에서 key만 ir에 저장함
		Iterator<Integer> ir = hashMap.keySet().iterator(); // 순환구조

		while (ir.hasNext()) {// key존재여부
			int key = ir.next();
			String member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
