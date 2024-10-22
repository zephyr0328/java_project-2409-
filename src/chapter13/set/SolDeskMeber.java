package chapter13.set;

public class SolDeskMeber {

	private int memberId;
	private String memberName;

	public SolDeskMeber() {
		// TODO Auto-generated constructor stub
	}

	public SolDeskMeber(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return memberName + "ȸ������ ���̵��" + memberId;
	}

	// �������� ��(�ý��� �ּ�)
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberId;
	}

	// ����(����)
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof SolDeskMeber) {
			SolDeskMeber member = (SolDeskMeber) obj;
			return this.memberId == member.memberId || this.memberName.equals(member.memberName);
		}
		return false;
	}

}
