package chapter03.whiletest;

import java.util.Random;
import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		/*
		 * ���� ���߱� ���� 1���� 100���� ������ ���ڸ� �����ϰ�, ���ڸ� ���ߴ� ���� ���� �Է��� ���ڰ� ��ǻ�Ͱ� ������ ���ں��� ũ��
		 * "�� ���� ���ڸ� �����ϼ���" ��� ���� �Է��� ���ڰ� ��ǻ�Ͱ� ������ ���ں��� ������ "�� ū ���ڸ� �����ϼ���" ��� ������ ���ڸ�
		 * ��Ȯ�� ���� ������ ������ �ݺ� ���⶧���� �ɸ� �õ� Ƚ���� ����Ͽ� ������ �޽����� ���
		 */

		Scanner scanner = new Scanner(System.in);
		// int num = (int) (Math.random() * 6) + 1;
		Random random = new Random();
		// pc�� ���� ����
		int targetNumber = random.nextInt(100) + 1;
		int guest;
		int count = 0;

		System.out.println("1���� 100���� ���ڸ� ���纸����");

		do {
			System.out.print("1���� 100���� ���ڸ� �Է��ϼ��� : ");
			guest = scanner.nextInt();
			if (guest >= 1 && guest <= 100) {
				if (guest > targetNumber) {
					System.out.println("�� ���� ���ڸ� �����ϼ���.");
					count++;
				} else if (guest < targetNumber) {
					System.out.println("�� ū ���ڸ� �����ϼ���.");
					count++;
				} else {
					count++;
					break;
				}
			} else {
				System.out.println("");
			}
		} while (true);
		System.out.println("�����մϴ�!" + count + "�� ���� ���߾����ϴ�.");
		System.out.println("PC�� ������ ���� : " + targetNumber);
		System.out.println("User�� ������ ���� : " + guest);
		scanner.close();
	}

}
