package chapter15;

class MyRunnable implements Runnable {

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

public class ThreadEx04 {

	public static void main(String[] args) {
		
		MyRunnable myrunable = new MyRunnable();
		Thread thread1 = new Thread(myrunable);
		Thread thread2 = new Thread(myrunable);
		
		thread1.start(); 
		thread2.start();

	}

}
