package chapter15;

import java.util.Scanner;

public class AccountEx10Main {

	public static void main(String[] args) {
		Account acc = new Account();
		Runnable r = new AccountThread(acc);

		// 스레드화
		Thread t1 = new Thread(r);
		t1.setDaemon(true);
		t1.start();

		// 스레드와 상관없는 while문
		while (true) {
			System.out.print("입금할 돈을 입력하세요: ");
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			acc.deposit(n);
			if (acc.balance < 0) {
				break;
			}
		} // while

	}

}
