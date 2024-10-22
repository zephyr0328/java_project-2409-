package chapter13;

import java.util.List;
import java.util.Vector;

public class VectorBoard08Main {

	public static void main(String[] args) {

		// Vector ����Ʈ ���� (����ȭ�� ����Ʈ)
		List<Board> list = new Vector<Board>();

		// ù ��° ������ : �����͸� �߰��ϴ� �۾�
		Thread thread1 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				list.add(new Board("����" + i, "����" + i, "�۾���" + i));
				System.out.println(Thread.currentThread().getName() + " - ������ �߰�: ����" + i);
				try {
					Thread.sleep(50); // �߰� �� ���
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}, "Thread1");

		// �� ��° ������ : �����͸� �����ϴ� �۾�
		Thread thread2 = new Thread(() -> {

			try {
				Thread.sleep(100);// ó������ �������� �ʵ��� ���
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			for (int i = 0; i < 2; i++) {
				if (list.size() > 0) {
					Board board = list.remove(0);
					System.out.println(Thread.currentThread().getName() + " - ������ ����: " + board.subject);
				}
				try {
					Thread.sleep(100); // ���� �� ���
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}, "Thread2");

		// �� ������ ����
		thread1.start();
		thread2.start();

		// ������ �Ϸ� ���
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// ���� ����Ʈ ���
		System.out.println("\n���� ����Ʈ ����:");
		for (Board board : list) {
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}

}
