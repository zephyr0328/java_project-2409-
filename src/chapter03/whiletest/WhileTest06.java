package chapter03.whiletest;

import java.util.Scanner;

public class WhileTest06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num, cnt = 0, sum = 0;
		double avg;

		while (true) {
			System.out.print("숫자를 입력해주세요 : ");
			num = scanner.nextInt();

			if (num == 0) {
				break;
			}

			cnt++; // 숫자가 몇 개 입력되었는지 체크
			sum += num; // 누적합

		}
		avg = (double) sum / cnt;
		System.out.print("입력된 숫자의 갯수 : " + cnt + "\n");
		System.out.print("입력된 숫자의 합계 : " + sum + "\n");
		System.out.print("입력된 숫자의 평균 : " + Math.round(avg*1000.0)/1000);
		System.out.printf("입력된 숫자의 평균 : %.3f",avg);
		scanner.close();
	}

}
