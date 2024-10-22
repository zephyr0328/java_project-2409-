package chapter03.whiletest;

import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Java  교과목 점수를 입력하세요 : ");
			int scr = scanner.nextInt();

			// if => 60점 이상이면 합격 그 밖에 불합격
			// 0 이하 또는 100초과시 0에서부터 100까지의 점수만 입력 가능합니다.
			// ||or 연산사용
			if (scr>=60&&scr<=100) {
				System.out.println("합격\n");
				break;
			} else if(scr>=0&&scr<60){
				System.out.println("불합격\n");
				break;
			}else {
				System.out.println("0~100사이의 점수만 입력 가능합니다.");
				break;
			}

		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
