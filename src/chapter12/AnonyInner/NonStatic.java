package chapter12.AnonyInner;

import javax.swing.JOptionPane;

class Out {
	// �ʵ�
	static int a = 1;

	// ����Ʈ ������

	// �޼���

	// ���� Ŭ����
	public class In {
		// �ʵ�

		// ������

		// �޼���
		public String Infun() {
			return (a + "�� ° Non-Static ���� �ǽ�");
		}
	}
}

public class NonStatic {

	public static void main(String[] args) {
		// 1. �ٱ� Ŭ���� ��ü
		Out obj1 = new Out();
		// 2. ���� Ŭ���� ��ü
		Out.In obj2 = obj1.new In();
		// ���ο� �ִ� �޼���
		String str = obj2.Infun();
		JOptionPane.showMessageDialog(null, str + "\n SUCCESS");
	}

}
