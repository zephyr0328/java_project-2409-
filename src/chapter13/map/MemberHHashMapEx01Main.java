package chapter13.map;

public class MemberHHashMapEx01Main {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();

		// �Է��� �� �ʿ��� �Ű����� ��ü ����
		Member memberLee = new Member(1001, "�̼���");
		Member memberPark = new Member(1002, "������");
		Member memberKim = new Member(1003, "�����");
		Member memberJung = new Member(1004, "���ϳ�");

		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberJung);
		memberHashMap.addMember(new Member(1005, "�̹���"));
		memberHashMap.addMember(new Member(1006, "�ӹ���"));

		memberHashMap.showAllMember();

		memberHashMap.remobeMember(1002);
		memberHashMap.showAllMember();

	}

}
