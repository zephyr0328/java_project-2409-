package chapter15;

import java.util.Scanner;

public class AccountEx10Main {

	public static void main(String[] args) {
		Account acc = new Account();
		Runnable r = new AccountThread(acc);

		// ������ȭ
		Thread t1 = new Thread(r);
		t1.setDaemon(true);
		t1.start();

		// ������� ������� while��
		while (true) {
			System.out.print("�Ա��� ���� �Է��ϼ���: ");
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			acc.deposit(n);
			if (acc.balance < 0) {
				break;
			}
		} // while

	}

}
