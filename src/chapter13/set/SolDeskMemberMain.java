package chapter13.set;

public class SolDeskMemberMain {

	public static void main(String[] args) {
		// SolDeskMemberManager ��ü ����
		SolDeskMemberManager manager = new SolDeskMemberManager();

		// ȸ�� ��ü ����
		SolDeskMeber member1 = new SolDeskMeber(1001, "�̼���");
		SolDeskMeber member2 = new SolDeskMeber(1002, "������");
		SolDeskMeber member3 = new SolDeskMeber(1003, "���ϳ�");
		SolDeskMeber member4 = new SolDeskMeber(1004, "�����");

		// ȸ������
		manager.addMember(member1);
		manager.addMember(member2);
		manager.addMember(member3);
		manager.addMember(member4);
		System.out.println();

		// ��ü ȸ�� ��� ���
		System.out.println("======��üȸ�����======");
		manager.showAllMember();
		
		//�ߺ� ȸ�� �߰� �õ�
		SolDeskMeber duplicateMember = new SolDeskMeber(1003, "���ϳ�");
		manager.addMember(duplicateMember);
		
		System.out.println("======��üȸ�����======");
		manager.showAllMember();
	}
}
