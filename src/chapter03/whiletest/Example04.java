package chapter03.whiletest;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		boolean run = true;
		int num;
		int num2;
		int save = 0;
		int money;

		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택>");

			num = scan.nextInt();
			if (num == 1) {
				System.out.print("예금액>");
				money = scan.nextInt();
				save += money;
			} else if (num == 2) {
				System.out.print("출금액>");
				num2 = scan.nextInt();
				save -= num2;
			} else if (num == 3) {
				System.out.print("잔액>" + save);
			} else if (num == 4) {
				run = false;
			} else {
				System.out.print("올바른 숫자를 선택해주세요.");
			}
			System.out.println();
		} // while
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}
}
