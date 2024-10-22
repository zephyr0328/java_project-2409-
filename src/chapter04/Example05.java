package chapter04;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		// 학생수을 입력받아, 점수를 입력하고 점수리스트를 출력하고 총점과 평균을 분석하는 프로젝트
		
		boolean run = true;
		int studentNum = 0;

		int avg = 0;
		int total = 0;
		int score[] = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println("학생수>");
				studentNum = scanner.nextInt();
				score = new int[studentNum];// 메모리 확보
			} else if (selectNo == 2) {
				for (int i = 0; i < score.length; i++) {
					System.out.print("점수입력> ");
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
				System.out.println("평균: " + avg + "점");
			} else {
				run = false;
			}
			
			scanner.close();

			/*
			 * switch (selectNo) { case 1: System.out.print("학생수> "); studentNum =
			 * scanner.nextInt(); score = new int[studentNum]; break; case 2: if (studentNum
			 * != 0) { score = new int[studentNum]; for (int i = 0; i < score.length; i++) {
			 * System.out.print("점수입력> "); score[i] = scanner.nextInt(); } } else {
			 * System.out.println("학생수를 입력해주세요."); } break; case 3: score = new
			 * int[studentNum]; for (int j = 0; j < score.length; j++) {
			 * System.out.println(score[j] + " "); } break; case 4: score = new
			 * int[studentNum]; for (int k = 0; k < score.length; k++) { total += score[k];
			 * avg = total / score.length; } System.out.println("평균: " + avg + "점"); break;
			 * case 5: run = false; break; }
			 */

		}
	}
}
