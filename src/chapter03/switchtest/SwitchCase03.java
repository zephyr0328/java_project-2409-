package chapter03.switchtest;

import java.util.Scanner;

public class SwitchCase03 {

	public static void main(String[] args) {
		int month;
		int day;

		Scanner scanner = new Scanner(System.in);

		System.out.println("월을 입력하세요.(1~12)");
		month = scanner.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 11:
		case 12: {
			day = 31;
			break;
		}
		case 2: {
			day = 28;
			break;
		}
		case 4:
		case 6:
		case 9: {
			day = 30;
			break;
		}
		default: {
			day = 0;
			System.out.println("존재하지 않는 달입니다.");
		}

		}
		System.out.println(month + "월은" + day + "일 까지 있습니다.");
		scanner.close();
	}

}