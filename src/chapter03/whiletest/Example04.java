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
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-------------------------------------");
			System.out.print("����>");

			num = scan.nextInt();
			if (num == 1) {
				System.out.print("���ݾ�>");
				money = scan.nextInt();
				save += money;
			} else if (num == 2) {
				System.out.print("��ݾ�>");
				num2 = scan.nextInt();
				save -= num2;
			} else if (num == 3) {
				System.out.print("�ܾ�>" + save);
			} else if (num == 4) {
				run = false;
			} else {
				System.out.print("�ùٸ� ���ڸ� �������ּ���.");
			}
			System.out.println();
		} // while
		System.out.println("���α׷��� �����մϴ�.");
		scan.close();
	}
}
