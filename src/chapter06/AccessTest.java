package chapter06;

public class AccessTest {

	// �������=�ʵ�
	private int aa; // ���� Ŭ���������� ��� ����
	public int bb; // ���������� ���(�ٸ� Ŭ���������� ��밡��)
	int cc; // public��������

	// ����Ʈ ������

	// �޼���
	public void setAa(int aa) {// get set �޼���
		this.aa = aa; // ������� �ʱ�ȭ this ��������� ����Ų��.this �� ����ü ��ü�� �ǹ�
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public void Disp() {
		System.out.println("aa�� : " + aa + "bb�� : " + bb + "cc�� : " + cc);// �ʱ�ȭ Ȯ��

	}

	public static void main(String[] args) {
		AccessTest obj = new AccessTest();

		// aa�ʱ�ȭ ���
		// obj.aa=10;
		// System.out.println("aa=10 -> "+obj.aa);
		obj.setAa(20);
		System.out.println("aa=20 -> " + obj.aa);

		obj.bb = 30;
		System.out.println("bb=30 -> " + obj.bb);

		obj.setCc(40);
		System.out.println("cc=40 -> " + obj.cc);

		obj.Disp();

	}

}
