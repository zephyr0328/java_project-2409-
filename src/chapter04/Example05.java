package chapter04;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		// �л����� �Է¹޾�, ������ �Է��ϰ� ��������Ʈ�� ����ϰ� ������ ����� �м��ϴ� ������Ʈ
		
		boolean run = true;
		int studentNum = 0;

		int avg = 0;
		int total = 0;
		int score[] = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-----------------------------------------------");
			System.out.print("����> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println("�л���>");
				studentNum = scanner.nextInt();
				score = new int[studentNum];// �޸� Ȯ��
			} else if (selectNo == 2) {
				for (int i = 0; i < score.length; i++) {
					System.out.print("�����Է�> ");
					score[i] = scanner.nextInt();
				}
			} else if (selectNo == 3) {
				for (int j = 0; j < score.length; j++) {
					System.out.println(score[j] + " ");
				}
			} else if (selectNo == 4) {
				for (int k = 0; k < score.length; k++) {
					total += score[k];
					avg = total / score.length;
				}
				System.out.println("���: " + avg + "��");
			} else {
				run = false;
			}
			
			scanner.close();

			/*
			 * switch (selectNo) { case 1: System.out.print("�л���> "); studentNum =
			 * scanner.nextInt(); score = new int[studentNum]; break; case 2: if (studentNum
			 * != 0) { score = new int[studentNum]; for (int i = 0; i < score.length; i++) {
			 * System.out.print("�����Է�> "); score[i] = scanner.nextInt(); } } else {
			 * System.out.println("�л����� �Է����ּ���."); } break; case 3: score = new
			 * int[studentNum]; for (int j = 0; j < score.length; j++) {
			 * System.out.println(score[j] + " "); } break; case 4: score = new
			 * int[studentNum]; for (int k = 0; k < score.length; k++) { total += score[k];
			 * avg = total / score.length; } System.out.println("���: " + avg + "��"); break;
			 * case 5: run = false; break; }
			 */

		}
	}
}
