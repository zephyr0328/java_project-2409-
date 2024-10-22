package chapter13.set;

public class SolDeskMemberMain {

	public static void main(String[] args) {
		// SolDeskMemberManager 객체 생성
		SolDeskMemberManager manager = new SolDeskMemberManager();

		// 회원 객체 생성
		SolDeskMeber member1 = new SolDeskMeber(1001, "이수정");
		SolDeskMeber member2 = new SolDeskMeber(1002, "박진영");
		SolDeskMeber member3 = new SolDeskMeber(1003, "정하나");
		SolDeskMeber member4 = new SolDeskMeber(1004, "김우진");

		// 회원가입
		manager.addMember(member1);
		manager.addMember(member2);
		manager.addMember(member3);
		manager.addMember(member4);
		System.out.println();

		// 전체 회원 목록 출력
		System.out.println("======전체회원목록======");
		manager.showAllMember();
		
		//중복 회원 추가 시도
		SolDeskMeber duplicateMember = new SolDeskMeber(1003, "정하나");
		manager.addMember(duplicateMember);
		
		System.out.println("======전체회원목록======");
		manager.showAllMember();
	}
}
