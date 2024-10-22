package chapter15;

public class Thred_RunnableEx07 implements Runnable {

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

		// 일반 실행(메인스레드)
		System.out.println("메인클래스 시작");
		Thred_RunnableEx07 t1 = new Thred_RunnableEx07();
		t1.run();

		System.out.println("------------------------------------------");
		Thread mThread = new Thread(t1);// t1객체가 Thread객체로 형변환
		mThread.start();
		System.out.println("메인 클래스 종료");

	}

}
