package chapter13;

import java.util.Vector;

public class VectorShared {
	// Vector ��ü ����(���� �ڿ�)
		private Vector<Integer> sharedVector = new Vector<Integer>();

		// Vector�� �����͸� �߰��ϴ� �޼���
		public void addDataToVector(int count) {
			for (int i = 0; i < count; i++) {
				sharedVector.add(i);
				System.out.println("������ " + Thread.currentThread().getName() + "��(��) ������ " + i + " �߰�");
				try {
					Thread.sleep(50); // �� ������ �߰� �� ��� ��� (��Ƽ������ ��Ȳ �ùķ��̼�)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}// addDataToVector

		public void printVector() {
			System.out.println("���� Vector�� ������: " + sharedVector);
		}
}
