package chapter03.whiletest;

import java.util.Scanner;

public class WhileTest06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num, cnt = 0, sum = 0;
		double avg;

		while (true) {
			System.out.print("���ڸ� �Է����ּ��� : ");
			num = scanner.nextInt();

			if (num == 0) {
				break;
			}

			cnt++; // ���ڰ� �� �� �ԷµǾ����� üũ
			sum += num; // ������

		}
		avg = (double) sum / cnt;
		System.out.print("�Էµ� ������ ���� : " + cnt + "\n");
		System.out.print("�Էµ� ������ �հ� : " + sum + "\n");
		System.out.print("�Էµ� ������ ��� : " + Math.round(avg*1000.0)/1000);
		System.out.printf("�Էµ� ������ ��� : %.3f",avg);
		scanner.close();
	}

}
