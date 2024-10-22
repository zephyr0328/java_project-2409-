package chapter13.map;

public class MemberHHashMapEx01Main {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();

		// 입력할 때 필요한 매개변수 객체 생성
		Member memberLee = new Member(1001, "이수정");
		Member memberPark = new Member(1002, "박진영");
		Member memberKim = new Member(1003, "김우진");
		Member memberJung = new Member(1004, "정하나");

		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberJung);
		memberHashMap.addMember(new Member(1005, "이민정"));
		memberHashMap.addMember(new Member(1006, "임민정"));

		memberHashMap.showAllMember();

		memberHashMap.remobeMember(1002);
		memberHashMap.showAllMember();

	}

}
