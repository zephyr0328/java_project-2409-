package chapter15;

public class NonDaemonThreadEx09Main implements Runnable {

	static boolean autoSave = false;

	// 3초마다 저장하기
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(3000);// 3초대기
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (autoSave) {
				System.out.println("자동저장 됩니다."); // 0 1 2 3 자동저장 됩니다.
			}
		}

	}

	public static void main(String[] args) {

		NonDaemonThreadEx09Main dm = new NonDaemonThreadEx09Main();
		Thread t = new Thread(dm); // run()을 start()로 구동
		// 메인 스레드가 종료되면 같이 종료시키는 역할
		t.setDaemon(true);// 데몬 작동
		t.start(); // 자동저장 스레드 실행

		for (int i = 0; i <= 15; i++) {
			// 메인 스레드
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
			if (i == 3) {
				autoSave = true; // 0 1 2 3
			}
		} // for
		/*
		 * // 메인 스레드 종료 전에 잠시 대기 try { Thread.sleep(2000); } catch (Exception e) {
		 * e.printStackTrace(); }
		 */
		System.out.println("메인 스레드 종료");

	}

}
