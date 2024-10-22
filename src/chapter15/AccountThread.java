package chapter15;

import java.util.Random;

public class AccountThread implements Runnable {
	Account acc;

	// ������ �����ε�
	public AccountThread(Account acc) {
		this.acc = acc;
	}

	@Override
	public void run() {

		while (true) {
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			// ��ݾ��� ������ �߻�
			int money = (new Random().nextInt(3) + 1) * 10000;
			acc.withdraw(money);
			System.out.println("�ܾ� : " + acc.balance);
		}

	}
}
