package chapter15;

class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread" + Thread.currentThread().getName() + ": " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class ThreadEx03 {

	public static void main(String[] args) {
		
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		
		thread1.start();
		thread2.start();

	}

}
