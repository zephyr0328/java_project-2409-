package chapter15;

class Counter {
	private int count = 0;

	// synchronized : ���� �����尡 �����ǰ� �ִ� �ڿ��� ���ÿ� ������ �� �ϰ����� �����ϱ� ���� ���
	public synchronized void increment() {
		count++;
	}

	public int getCount() {
		return count;
	}
}

public class ThreadEx05 {

	public static void main(String[] args) {
		Counter counter = new Counter();

		// Thread run
		Runnable task = () -> {
			for (int i = 0; i < 1000; i++) {
				counter.increment();
			}
		};

		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);

		thread1.start();
		thread2.start();

		// join �����ڵ尡 �ڽĽ������� thread1.start();,thread2.start(); �� ����� ������ ��ٸ�
		try {
			thread1.join();
			thread2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// ����
		System.out.println("Final count : " + counter.getCount());
	}

}
