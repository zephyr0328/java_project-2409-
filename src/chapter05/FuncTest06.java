package chapter05;

import java.util.Scanner;

public class FuncTest06 {
	
	public static String EduStep(int num) {
		String a;
		switch (num) {
		case 1:
			a = "초급";
			break;
		case 2:
			a = "중급";
			break;
		case 3:
			a = "고급";
			break;
		default:
			a = "null";
			break;
		}
		return a;
	}

	public static void main(String[] args) {
		// 사용자로부터 스터디 단계를 입력받아서 EduStep 호출하기
		Scanner scanner = new Scanner(System.in);
		System.out.print("스터디 단계를 입력하세요: ");
		int number = scanner.nextInt();

		String step = EduStep(number);
		System.out.println("현재 수업 단계는 " + step + "입니다.");
		
		
	}

}
