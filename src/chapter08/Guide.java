package chapter08;

public class Guide {
	//�������
	static String point;
	Guest[] guest;
	
	//������
	public Guide(int n) {
		//������(�߸�)
		point="�߸�";
		//������ �� ��ŭ �޸�Ȯ��
		guest=new Guest[n];
		for(int i=0;i<n;i++) {
			guest[i]=new Guest();
		}
		
	}
	
	//�޼���
	public static String getPoint() {
		return point;
	}

	

	
	

}
/*
����ƽ ���� point�� ������ GuideŬ������ �����, 
�̸��� ���� ������ ���� Guest Ŭ������ ����� �Ʒ��� ����� �������� �ϴ� ������ ����
���� ����� ����� ������ ���� ����.
������ �� ��ŭ GuestŬ������ �迭�� ����
*/