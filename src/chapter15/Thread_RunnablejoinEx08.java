package chapter15;

public class Thread_RunnablejoinEx08 implements Runnable {
	@Override
	public void run() {
		System.out.println("run() �޼��� ����");
		first();
	}

	public void first() {
		System.out.println("first() �޼��� ����");
		second();
	}

	public void second() {
		System.out.println("second() �޼��� ����");
	}

	public static void main(String[] args) {
		System.out.println("����Ŭ���� ����");
		Thread_RunnablejoinEx08 t1 = new Thread_RunnablejoinEx08();
		Thread Jthread = new Thread(t1); // Thread�� ����ȯ
		Jthread.start();
		try {
			Jthread.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("����Ŭ���� ����");
	}

}
