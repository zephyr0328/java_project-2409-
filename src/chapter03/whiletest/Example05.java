package chapter03.whiletest;

import java.util.Random;
import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		/*
		 * 숫자 맞추기 게임 1부터 100까지 무작위 숫자를 선택하고, 숫자를 맞추는 게임 만약 입력한 숫자가 컴퓨터가 선택한 숫자보다 크면
		 * "더 작은 숫자를 추측하세요" 출력 만약 입력한 숫자가 컴퓨터가 선택한 숫자보다 작으면 "더 큰 숫자를 추측하세요" 출력 선택한 숫자를
		 * 정확히 맞출 때까지 과정을 반복 맞출때까지 걸린 시도 횟수를 출력하여 축하의 메시지를 출력
		 */

		Scanner scanner = new Scanner(System.in);
		// int num = (int) (Math.random() * 6) + 1;
		Random random = new Random();
		// pc가 뽑은 숫자
		int targetNumber = random.nextInt(100) + 1;
		int guest;
		int count = 0;

		System.out.println("1부터 100까지 숫자를 맞춰보세요");

		do {
			System.out.print("1부터 100까지 숫자를 입력하세요 : ");
			guest = scanner.nextInt();
			if (guest >= 1 && guest <= 100) {
				if (guest > targetNumber) {
					System.out.println("더 작은 숫자를 추측하세요.");
					count++;
				} else if (guest < targetNumber) {
					System.out.println("더 큰 숫자를 추측하세요.");
					count++;
				} else {
					count++;
					break;
				}
			} else {
				System.out.println("");
			}
		} while (true);
		System.out.println("축하합니다!" + count + "번 만에 맞추었습니다.");
		System.out.println("PC가 선택한 숫자 : " + targetNumber);
		System.out.println("User가 선택한 숫자 : " + guest);
		scanner.close();
	}

}
