package chapter15;

public class Account {

	int balance = 100000; // 잔액

	// 출금메서드
	public synchronized void withdraw(int money) {

		if (balance < money) {
			try {
				wait();// 스레드가 일시적으로 정지
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		balance -= money;
	}

	// 입금메서드
	public synchronized void deposit(int money) {

		balance += money;
		notify();//대기중인 스레드 깨움

	}
}
