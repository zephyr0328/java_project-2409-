package chapter05;

public class FuncTest_Overload {

	// �������=�ʵ�=�Ӽ�

	// ������(����Ʈ ��������)

	// �����ε�(�޼����� �Ű������� �ٸ��� �Ͽ� ���� ��Ī�� �޼��� ����)
	// �޼���
	public void getResult(int n) {
		System.out.println(n + "��(��) int �Դϴ�.");
	}

	public void getResult(char n) {
		System.out.println(n + "��(��) char �Դϴ�.");
	}

	public void getResult(String n) {
		System.out.println(n + "��(��) String �Դϴ�.");
	}

	public void getResult(int n, String n1) {
		System.out.println(n + "��(��) int �̰�, \n" + n1 + "��(��) String�Դϴ�.");
	}

}
