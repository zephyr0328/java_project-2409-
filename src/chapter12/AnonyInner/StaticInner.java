package chapter12.AnonyInner;

public class StaticInner {
	int a = 10;
	private int b = 100;
	static int c = 200; // data ����
	// ������

	// �޼���

	// ����Ŭ����
	static class Inner {
		static int d = 1000;

		// �޼���
		public void printData() {
			// a��b�� static�� �ƴϱ� ������ ����� �Ұ�����
			/*
			 * System.out.println("int a : " + a); System.out.println("private b : " + b);
			 */
			System.out.println("static int c : " + c);
		}
	}

	public static void main(String args[]) {

		Inner inner = new Inner();
		inner.printData();

	}

}
