package chapter14.standard;

import java.util.Scanner;

public class AverageCalculatorEx01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int count = 0;

		System.out.print("���ڸ� �Է��ϼ��� ( �����Ϸ��� -1 �Է�) : ");
		while (true) {
			int num = scanner.nextInt();
			if (num != -1) {
				sum += num;
				count++;
			} else {
				break;
			}
		}
		if (count > 0) {
			double average = sum / count;
			System.out.println("�Է��� ������ ����� : " + Math.round(average));
		} else {
			System.out.println("���ڰ� �Էµ��� �ʾҽ��ϴ�.");
		}
		scanner.close();
	}

}
