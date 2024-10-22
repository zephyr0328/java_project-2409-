package chapter13.set;

import java.util.HashSet;

public class SolDeskMemberManager {
	
	//HashSet�� ����Ͽ� ȸ�� ���� ����
	private HashSet<SolDeskMeber> members;
	
	//�����ڸ� ���ؼ� ȸ�� ������ ���� ���� Ȯ��
	public SolDeskMemberManager() {
		members = new HashSet<SolDeskMeber>();
	}
	
	//ȸ�� �߰� �޼��� ( �ߺ� ��� ���� )
	public void addMember(SolDeskMeber member) {
		if(members.add(member)) {
			System.out.println(member.getMemberName()+"ȸ���� ���������� �߰��Ǿ����ϴ�.");
		}else {
			System.out.println(member.getMemberName()+"�̹� �����ϴ� ȸ���Դϴ�.");
		}
	}
	
	public void showAllMember() {
		for (SolDeskMeber m : members) {
			System.out.println(m);
		}
	}

}
