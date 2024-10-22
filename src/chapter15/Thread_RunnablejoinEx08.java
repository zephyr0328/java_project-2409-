package chapter15;

public class Thread_RunnablejoinEx08 implements Runnable {
	@Override
	public void run() {
		System.out.println("run() 메서드 실행");
		first();
	}

	public void first() {
		System.out.println("first() 메서드 실행");
		second();
	}

	public void second() {
		System.out.println("second() 메서드 실행");
	}

	public static void main(String[] args) {
		System.out.println("메인클래스 시작");
		Thread_RunnablejoinEx08 t1 = new Thread_RunnablejoinEx08();
		Thread Jthread = new Thread(t1); // Thread로 형변환
		Jthread.start();
		try {
			Jthread.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("메인클래스 종료");
	}

}
