package chapter13.set;

import java.util.HashSet;

public class SolDeskMemberManager {
	
	//HashSet을 사용하여 회원 정보 관리
	private HashSet<SolDeskMeber> members;
	
	//생성자를 통해서 회원 정보를 담을 공간 확보
	public SolDeskMemberManager() {
		members = new HashSet<SolDeskMeber>();
	}
	
	//회원 추가 메서드 ( 중복 허용 안함 )
	public void addMember(SolDeskMeber member) {
		if(members.add(member)) {
			System.out.println(member.getMemberName()+"회원이 성공적으로 추가되었습니다.");
		}else {
			System.out.println(member.getMemberName()+"이미 존재하는 회원입니다.");
		}
	}
	
	public void showAllMember() {
		for (SolDeskMeber m : members) {
			System.out.println(m);
		}
	}

}
